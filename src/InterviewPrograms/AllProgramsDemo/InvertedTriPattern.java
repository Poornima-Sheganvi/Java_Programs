package InterviewPrograms.AllProgramsDemo;

public class InvertedTriPattern {
    public static void main(String[] args) {
        int rows = 5;
       /* for(int i=rows;i>=1;i--){
            char ch='a';
            for(int j=1; j<=i; j++){
                System.out.print(ch +" ");
                ch++;
            }
            System.out.println();

        }
    }*/
        for (int i = rows; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

