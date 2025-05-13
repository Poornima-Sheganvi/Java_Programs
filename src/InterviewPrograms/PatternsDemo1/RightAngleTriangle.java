package InterviewPrograms.PatternsDemo1;

public class RightAngleTriangle {
   /* public static void main(String[] args) {
        int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/
/*//inverted triangle
    public static void main(String[] args) {
        int n=5;
        for (int i=1; i<=n; i++){
            for (int j=n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/
/*//square
    public static void main(String[] args) {
        int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/
//combination of right n inverted right angle trainglr

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int m=4;
        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


