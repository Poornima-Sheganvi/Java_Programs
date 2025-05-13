package InterviewPrograms.Strings;

public class ExtractNumberDemo {
    public static void main(String[] args) {
       /* String s1="abc123pqr456";
        String s2=s1.replaceAll("\\D+", "");
        int b=Integer.parseInt(s2);
        System.out.println(b);*/

        String s1="Google";
        String s2=s1.replaceAll("\\d+", "");
        System.out.println(s2);

        String b[]=s1.split("o");
        for(int i=0; i<=b.length-1; i++){
            System.out.println(b[i]);
        }


    }
}
