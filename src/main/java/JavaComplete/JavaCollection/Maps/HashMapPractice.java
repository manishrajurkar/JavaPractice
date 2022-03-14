package JavaComplete.JavaLoops.JavaCollection.Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    public static void main(String[] args) {

        Map <Character ,Integer> map = new HashMap<Character,Integer>();
        map.put('a',1);
        map.put('b',1);
        map.put('a',2);
        map.put('b',2);
        System.out.println(map);
        System.out.println(map.get('a'));
        System.out.println(map.get('a'));
        System.out.println(map.containsKey('a'));
        System.out.println(map.replace('a',3));
        System.out.println(map.remove('b'));
        System.out.println(map);
    }

}
