package sample;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.abc1();
		test.abc2();

	}
	
	public void abc1(){
		System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}

	public String abc2(){
		System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());

		return "";
	}
}
