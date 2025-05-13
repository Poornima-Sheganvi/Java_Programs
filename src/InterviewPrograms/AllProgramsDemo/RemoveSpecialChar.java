package InterviewPrograms.AllProgramsDemo;

//A#b%₹#!&%cdef - wap to remove special character
public class RemoveSpecialChar {
    public static void main(String[] args) {
        String str1="abv098@#458%&mk12l!@";
        System.out.println("Input:" + str1);

        ////String spclChar=str1.replaceAll("\\w","");  //w prints special character
      String spcl=str1.replaceAll("[^A-Za-z0-9]","");
        System.out.println("Special Characters removed: " + spcl);
      /*String num=str1.replaceAll("[\\d]","");
        System.out.println("Numbers removed: " +num);*/
        /*String alphanumremo=str1.replaceAll("[\\w]","");
        System.out.println("Alphabets and numbers removed: " +alphanumremo);  //only special characters will be printed*/




    }
}


/*String num=str1.replaceAll("\\D", "");  //D prints inetegrs
        System.out.println("Numbers:" + num);

        String char1=str1.replaceAll("[^A-Za-z]","");
        System.out.println("Characters: " + char1);
*/
