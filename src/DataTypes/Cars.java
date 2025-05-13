package DataTypes;

public class Cars {
	String name;
	int model;
	static int NumOfWheel=4;
	

	public void getSpeed(int d, int t) {
		int speed = d / t;
		System.out.println(speed);
		
	}

	public static void main(String[] args) {
		Cars c1 = new Cars();
		Cars c2 = new Cars();
		Cars c3 = new Cars();
		Cars c4 = new Cars();
		c1.name = "Maruti";
		c1.model = 2020;
		System.out.println();
		System.out.println(c1.name + " : " + c1.model);
		System.out.println(c2.name + " : " + c2.model);
		c1.getSpeed(1000, 10);
		System.out.println(Cars.NumOfWheel);
		//System.out.println(name);
	}

}
