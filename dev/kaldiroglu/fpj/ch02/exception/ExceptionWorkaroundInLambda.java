package dev.kaldiroglu.fpj.ch02.exception;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Function;

public class ExceptionWorkaroundInLambda {
    public static void main(String[] args) {
        List<String> paths = List.of("a.txt", "b.txt");
        problem(paths);
    }

    public static void problem(List<String> paths ){
//        List<byte[]> data = paths.stream()
//                .map(p -> Files.readAllBytes(Path.of(p)))   // ERROR: unhandled IOException
//                .toList();
    }

    public static void solution1(List<String> paths){
        List<byte[]> data = paths.stream()
                .map(p -> {
                    try {
                        return Files.readAllBytes(Path.of(p));
                    } catch (IOException e) {
                        throw new UncheckedIOException(e);   // checked -> unchecked
                    }
                })
                .toList();
    }

    public static void solution2(List<String> paths){
        List<byte[]> data = paths.stream()
                .map(unchecked(p -> Files.readAllBytes(Path.of(p))))   // temiz tekrar
                .toList();
    }

    private static <T, R> Function<T, R> unchecked(CheckedFunction<T, R> f) {
        return t -> {
            try {
                return f.apply(t);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }

    @FunctionalInterface
    interface CheckedFunction<T, R> {
        R apply(T t) throws Exception;      // Our own interface declares that it throws a checked exception
    }
}
