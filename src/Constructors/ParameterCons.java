package Constructors;

public class ParameterCons {
    private int id;
    String name;
    String designation;

    public  ParameterCons (int id,String name,String designation){
        this.id=id;
        this.name=name;
        this.designation=designation;

    }

    public void displayPersonDetails(){
        System.out.println("Person Details:::" + "Id:"+this.id +" " + "Name:"+this.name + " Designation::"+this.designation);
    }

    public static void main(String[] args) {
        ParameterCons pd = new ParameterCons(10, "Acchu", "tester");
        pd.displayPersonDetails();
    }

    }

