package dev.kaldiroglu.fpj.ch03.stringAnalyzer;

public class StringAnalyzerTool {

	public void showResult(String[] strList, String searchStr, StringAnalyzer analyzer) {
		for (String current : strList) {
			if (analyzer.analyze(current, searchStr)) {
				System.out.println("Match: " + current);
			}
		}
	}
}
