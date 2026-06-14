
package dev.kaldiroglu.fpj.ch03.stringAnalyzer;

@FunctionalInterface
public interface StringAnalyzer {

	public boolean analyze(String target, String searchStr);
		
}
