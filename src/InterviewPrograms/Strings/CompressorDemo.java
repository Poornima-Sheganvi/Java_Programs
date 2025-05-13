package InterviewPrograms.Strings;

//A String Compressor in Java is a program that shortens a string by replacing repeated characters with:
// the character + the number of times it repeats.
//To save space.
//To make a string smaller and easier to work with.
//It's like shrinking a long message if it has many repeating letters.

public class CompressorDemo {
    public static void main(String[] args) {

        char[] c = {'a', 'b', 'c', 'b', 'a', 'a', 'c','p','q'};
        String compressor = "";
        for (int i = 0; i < c.length; i++) {
            int count = 1;
            char c1 = c[i];
            if (c1 == ' ')
                continue;
            for (int j = i + 1; j < c.length; j++) {
                char c2 = c[j];
                if (c1 == c2) {
                    count++;
                    c[j] = ' ';
                }
            }
           // if (count > 1)
                //System.out.println("Duplicate char:" + c1 + "--->" + count);
            compressor = compressor + c1 + count;
        }
        System.out.println("Compressor is:" + compressor);
    }
}

































   /* String str="abcabcabc";
    //output: a3b3c3
    Map <Character,Integer>map=new HashMap();

        for (int i=0;i<str.length();i++){
        if(map.containsKey(str.charAt(i))){
            map.put(str.charAt(i),map.get(str.charAt(i))+1);
        }
        else {
            map.put(str.charAt(i),1);
        }
    }
       map.forEach(key,value); System.out.println(key + "" + value);
*/



