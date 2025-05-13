package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put(12,"Shiva");
        hm.put(15,"Rani");
        hm.put(10,"Appu");
        hm.put(25,"Poo");
        System.out.println(hm);

        System.out.println( hm.size());//4
        System.out.println(hm.get(10));//Appu
        System.out.println(hm.get(14));//null
        System.out.println(hm.get("poo"));//null


    }
}
