
package dev.kaldiroglu.fpj.ch02.examples.stringAnalyzer;

@FunctionalInterface
public interface StringAnalyzer {

	public boolean analyze(String target, String searchStr);
		
}
