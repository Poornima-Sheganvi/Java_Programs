package DataTypes;

public class Test {
	int i=200;
	String name;

	public void getSpeed() {
		System.out.println("get speed main");
	}

	public static void main(String[] args) {
		int age=20;
		System.out.println(age);
		System.out.println("Hi");
		
		Test t1=new Test();
		t1.getSpeed();
		t1.main("hello");
		System.out.println(Cars.NumOfWheel);
		Cars c5=new Cars();
		System.out.println(c5.model);
		System.out.println(c5.name);
	}

	public static void main(String a) {
		System.out.println("main with String args");
		System.out.println(a);
	}

}
