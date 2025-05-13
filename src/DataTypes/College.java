package DataTypes;

public class College {
	String sname, combination;
	int s_rollno;
	static int NumOfSubjects=3;
	
	public static void main(String[] args) {
		College c1=new College();
		College c2=new College();
		c1.sname="Appu";
		c1.combination="PCM";
		c1.s_rollno=2;
		c2.sname="Vidu";
		c2.combination="PMCs";
		c2.s_rollno=13;
		System.out.println("Number of Subjects="+ College.NumOfSubjects);
		System.out.println(c1.sname + ":" + c1.combination + ":" + c1.s_rollno);
		System.out.println(c2.sname + ":" + c2.combination + ":" + c2.s_rollno);
		}

}
