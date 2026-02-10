import java.util.HashMap;

public class hashmap{
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();


        // insertion 
        map.put("India", 120);
        map.put("Napal", 259);
        map.put("pakistan", 53);
        System.out.println(map);
        
        for(map.Entry<String, Integer> e : map.entrySet()){

        }
    }
}