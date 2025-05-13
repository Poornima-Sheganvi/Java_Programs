package InterviewPrograms.PracticePrograms1;

public class EncapsulationDemo {
   /* private  int emp_id;

    public void setEmp_id(int empid1){
        emp_id=empid1;
    }
    public int getEmp_id(){
        return  emp_id;
    }

    public static void main(String[] args) {
    EncapsulationDemo ed=new EncapsulationDemo();
    ed.setEmp_id(10);
        System.out.println(ed.getEmp_id());
    }
*/
    private int stud_id;
    private String stud_name;

    public void setStud_id(int studid1){
        stud_id=studid1;
    }

    public int getStud_id() {
        return stud_id;
    }

    public void setstud_name(String studname1) {
        stud_name = studname1;
    }
    public String getstud_name(){
        return stud_name;
    }

    public static void main(String[] args) {
        EncapsulationDemo ed1=new EncapsulationDemo();
        ed1.setStud_id(23);
        ed1.setstud_name("Appu");
        System.out.println(ed1.getStud_id());
        System.out.println(ed1.getstud_name());
    }
}

