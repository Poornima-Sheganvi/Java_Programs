package InterviewPrograms;

public class SwapCharDemo {
    public static void main(String[] args) {
        String name="HelloWorld";
        char[] arr=name.toCharArray();
        if(arr.length>1){
            char temp= arr[0];   //declaration temporary
            arr[0]=arr[arr.length-1];
          arr [arr.length-1]=temp;
        }
        String result=" ";
        for (char c:arr){
            result=result+c;
        }
        System.out.println(result);
    }

}
