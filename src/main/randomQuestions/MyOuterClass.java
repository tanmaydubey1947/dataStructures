package main.randomQuestions;

public class MyOuterClass {
	
	protected int x=1;
	private String st = "Number";
	private void innerInstance() {
		
		MyInnerClass inner = new MyInnerClass();
		inner.seeOuter();
	}
	
	public static void main(String[] args) {
		
		MyOuterClass obj = new MyOuterClass();
		
		obj.innerInstance();
	}
	
	private class MyInnerClass{
		
		private void seeOuter() {
			//protected int x=2;
			System.out.println(st+" "+x);
		}
	}

}
