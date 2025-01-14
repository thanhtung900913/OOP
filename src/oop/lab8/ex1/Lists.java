package lab8.ex1;
import java.util.*;
public class Lists {
    public static void insertFirst(List<Integer> list, int value){
        list.add(0, value);
    }
    public static void insertLast(List<Integer> list, int value){
        list.add(value);
    }
    public static void replace(List<Integer> list, int value){
        list.set(2, value);
    }
    public static void removeThird(List<Integer> list){
        list.remove(2);
    }
    public static void removeEvil(List<Integer> list){
        int index;
        while(list.indexOf(666) != -1) {
            index = list.indexOf(666);
            list.remove(index);
        }
    }
    public static List<Integer> generateSquare(){
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            result.add(i*i);
        }
        return result;
    }
    public static boolean contains(List<Integer> list, int value){
        return list.contains(value);
    }
    public static void copy(List<Integer> source, List<Integer> target){
        target.addAll(source);
    }
    public static void reverse(List<Integer> list){
        Collections.reverse(list);
    }
    public static void reverseManual(List<Integer> list){
        for (int i = 0, j = list.size()-1; j > i; i++, j--) {
            int tmp = list.get(i);
            list.set(i,list.get(j));
            list.set(j, tmp);
        }

    }
    public static void insertBeginningEnd(LinkedList<Integer> list, int value){
        list.addFirst(value);
        list.addLast(value);
    }
}
