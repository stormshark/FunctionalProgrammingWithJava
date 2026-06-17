# Functional Programming with Java

> For further enquiry please contact Akın Kaldıroğlu at akin@kaldiroglu.dev

Example source code accompanying the course **"Java ile Fonksiyonel Programlama"
(Functional Programming with Java)**. Each chapter of the course has a matching
package of runnable examples here.

- **Project:** Functional Programming with Java — course example code
- **Author:** Akın Kaldıroğlu
- **Root package:** `dev.kaldiroglu.fpj`
- **Started:** June 2026
- **Language/level:** Java SE (intermediate), with Groovy / Python / C# snippets for
  cross-language comparison in Chapter 1

---

## Expected Benefits

This repository lets students **run, modify, and break** the concepts presented on
the slides, rather than only reading them. By working through the examples a learner
will:

- See the difference between **imperative and functional** style in real Java code.
- Understand **pure functions**, **immutability**, and how state mutation is the
  source of complexity the functional style avoids.
- Learn **anonymous classes** and how they evolve into **lambda expressions**.
- Master lambda mechanics: **functional interfaces**, **target typing**, **variable
  capture / scope**, the meaning of **`this`**, and **exception** handling in lambdas.
- Compare Java's approach with Groovy closures, Python functions, and C# delegates.

---

## What the Examples Demonstrate (functional properties)

### `ch01` — Fonksiyonel Programlamaya Giriş (Introduction)
- `PureFunctionDemo` — pure vs. impure functions and referential transparency.
- `SimpleLambdaExpression` — a first `Stream` pipeline (`filter` → `map` → `average`).
- `evenNumber/` — behavior parameterization: the classic four-method version
  (`ClassicEvenNumberOperations`) reduced to a single method with a functional
  interface (`EvenNumberOperation` + `EvenNumberOperationsWithLambda`).
- `code/` — the same even-numbers idea in **Groovy** (closures), **Python**, and
  **C#** (delegates) for cross-language comparison.

### `ch02` — Lambda İfadeleri (Lambda Expressions)
- `anonymous/doer/` — anonymous classes, including instance initializers, captured
  variables, and the "weird" forms.
- `callback/` — the callback pattern with Swing `Timer` / `JButton` listeners, shown
  as named classes, anonymous classes, and lambdas.
- `lambda/` — the core of the chapter:
  - `LambdaVariations1` / `LambdaVariations2` — every syntactic form of a lambda.
  - `LambdaScope` — variable capture, `final` / effectively-final, shadowing.
  - `LambdaProperties` — access to interface `static` / `default` members and
    sub-interfaces.
  - `LambdaTargets` — target typing (why a lambda has no type on its own).
  - `ThisInLambda` — `this` in a lambda vs. in an anonymous class.
  - `math/` — implementing a functional interface (`Math`) with anonymous classes
    vs. lambdas.
- `functions/ComparatorLambda` — `Comparator` written as lambdas.
- `exception/ExceptionWorkaroundInLambda` — checked exceptions in lambdas and how to
  work around the standard `java.util.function` interfaces.
- `examples/` — small standalone demos (`clock`, `doer`, `event`, `stringAnalyzer`,
  `BasicLambdaExpressionsExample`).

> **Teaching note:** many files contain commented-out lines marked with *why they do
> not compile*. These are intentional — they are part of the lesson, not dead code.

---

## Architecture & Conventions

- **Organized by chapter, then by topic.** Top-level packages `ch01` and `ch02`
  mirror the course chapters; sub-packages group a single concept.
- **Self-contained, runnable examples.** Almost every class has its own `main`
  method, so any concept can be run in isolation.
- **No build tool.** The project compiles with plain `javac` (or any IDE). The
  Groovy 5 runtime needed for the `.groovy` comparison files is bundled under `lib/`.
- **Not a unit-test suite.** Classes named `*Test` here are *runnable demonstrations*
  (with `main`), not JUnit tests — they print to the console so you can observe
  behavior.

### Requirements
- **JDK 25** is recommended (a few examples, e.g. `PureFunctionDemo`, use the
  instance `void main()` form). On an older JDK, change those to
  `public static void main(String[] args)`.
- Lambdas and the `Stream` API require **Java 8+**; everything else here runs on any
  modern JDK.
- Some `callback` / `event` examples are **Swing GUIs** and open a window.

---

## Run it with

All commands are run from the **repository root**.

### Compile all Java sources
```bash
# sources live under dev/..., output goes to ./out
javac -d out $(find dev -name "*.java")
```

### Run a specific example (use its fully-qualified class name)
```bash
java -cp out dev.kaldiroglu.fpj.ch02.lambda.LambdaVariations1
java -cp out dev.kaldiroglu.fpj.ch02.lambda.ThisInLambda
java -cp out dev.kaldiroglu.fpj.ch01.SimpleLambdaExpression
```
GUI examples (open a window):
```bash
java -cp out dev.kaldiroglu.fpj.ch02.callback.MyApplication
```

### Run the cross-language comparison files (Chapter 1)
```bash
# Groovy (runtime bundled in lib/)
java -cp "lib/*" groovy.ui.GroovyMain dev/kaldiroglu/fpj/ch01/code/ClosureExamples.groovy

# Python
python3 dev/kaldiroglu/fpj/ch01/code/EvenNumbers1.py

# C# (requires the .NET SDK)
dotnet run --project dev/kaldiroglu/fpj/ch01/code   # or compile EvenNumberOperations.cs with csc
```

### Tests
This repository has no automated test suite; the `*Test` classes are runnable demos.
Run any of them as shown above and verify the console output.


# Yenilikleri Kendi Reponuza Çekme (Sync)
İlerleyen zamanlarda orijinal depoda bir güncelleme olduğunda, o yenilikleri önce bilgisayarınıza çekip sonra kendi uzaktaki reponuza pushlamak için şu komutları sırasıyla çalıştırın:

# 1. Orijinal depodaki tüm değişiklikleri bilgisayarınıza indirin
git fetch upstream

# 2. Ana dalınızda (main veya master) olduğunuzdan emin olun
git checkout main

# 3. Orijinal depodaki yenilikleri kendi yerel kodlarınızla birleştirin
git merge upstream/main

# 4. Güncellenmiş kodları kendi GitHub/GitLab reponuza yükleyin
git push origin main