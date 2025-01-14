package lab8.ex2;
import java.util.*;
public class Sets {
    public static Set<Integer> insertionManual(Set<Integer> first, Set<Integer> second){
        Set<Integer> result = new HashSet<>();
        for (int s : first){
            if(second.contains(s)){
                result.add(s);
            }
        }
        return result;
    }
    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second){
        Set<Integer> result = new HashSet<>(first);
        for(int i : second){
            if(!first.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
    public static Set<Integer> insertion(Set<Integer> first, Set<Integer> second){
        Set<Integer> result = new HashSet<>(first);
        result.retainAll(second);
        return result;
    }
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second){
        Set<Integer> result = new HashSet<>(first);
        result.addAll(second);
        return result;
    }
    public static List<Integer> toList(Set<Integer> source){
        List<Integer> result = new ArrayList<>();
        for (int s : source){
            result.add(s);
        }
        return result;
    }
    public static List<Integer> removeDuplicates(List<Integer> source){
        Set<Integer> tmp = new HashSet<>(source);
        List<Integer> result = new ArrayList<>(tmp);
        return result;
    }
    public static List<Integer> removeDuplicatesManual(List<Integer> source){
        List<Integer> result = new ArrayList<>();
        for(int a : source){
            if(!result.contains(a)){
                result.add(a);
            }
        }
        return result;
    }
    public static String firstRecurringCharacter(String s){
        Set<Character> seenCharacter = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char currentCharacter = s.charAt(i);
            if(seenCharacter.contains(currentCharacter)){
                return String.valueOf(currentCharacter);
            }else{
                seenCharacter.add(currentCharacter);
            }
        }
        return "\0";
    }
    public static Set<Character> allRecurringChars(String s){
        Set<Character> recurringChar = new HashSet<>();
        Set<Character> seenCharacter = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char currentCharacter = s.charAt(i);
            if(seenCharacter.contains(currentCharacter)){
                recurringChar.add(currentCharacter);
            }else{
                seenCharacter.add(currentCharacter);
            }
        }
        return recurringChar;
    }
    public static Integer[] toArray(Set<Integer> source){
        Integer[] result = new Integer[source.size()];
        int i =0;
        for(Integer element : source){
            result[i] = element;
            i++;
        }
        return result;
    }
    public static int getFirst(TreeSet<Integer> source){
        return source.first();
    }
    public static int getLast(TreeSet<Integer> source){
        return source.last();
    }
    public static int getGreater(TreeSet<Integer> source, int value){
        return source.higher(value);
    }
}
