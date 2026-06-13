
package dev.kaldiroglu.fpj.ch02.anonymous.doer;

public class DoerClassTest {

	public static void main(String[] args) {
		callDoerClass();
	}
	
	public static void callDoerClass(){
		DoerInterface doer = new DoerClass();
		doer.doIt();
		doer.doThat();
	}
}
