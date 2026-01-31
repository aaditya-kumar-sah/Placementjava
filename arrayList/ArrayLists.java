package arrayList;
import java.util.*;

public class ArrayLists{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add elements
        list.add(0);
        list.add(6);
        list.add(3);
        System.out.println(list);

        // get elements
        int element = list.get(1);
        int element1 = list.get(2);
        int element2 = list.get(0);
        System.out.println(element);
        System.out.println(element1);
        System.out.println(element2);

        // to add element between 
        list.add(0, 1);
        System.out.println(list);

        // update elements
        list.set(0, 5);
        System.out.println(list);

        // delete elements
        list.remove(3);
        System.out.println(list);

        // count size
        int size = list.size();
        System.out.println(size);

        // itetrate like array
        for(int i = 0; i < list.size(); i ++ ){
            System.out.println(list.get(i));
        }

        // sorting
        Collections.sort(list);
        System.out.println(list);
    }
}