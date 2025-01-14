package week2.oop;
import java.util.Scanner;
public class MethodExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        testExponent();
        testMagicSum(scan);
        testReverse(scan);
        testCopyOf(scan);
        testContains(scan);
        testSwap(scan);
        testArraytoString(scan);
        testPrint(scan);
        testSearch(scan);
    }
    // Ex 3.1:
    public static int exponent(int base, int exp){
        int product = 1;
        for (int i = 1; i <= exp; i++){
            product*=base;
        }
        return product;
    }
    public static void testExponent(){
        int exp;
        int base;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base: ");
        base = scan.nextInt();
        System.out.print("Enter exp: ");
        exp = scan.nextInt();
        System.out.println(base + " raises to the power of "
                + exp + " is : " + exponent ( base , exp ));
    }

    // Ex 3.2:
    public static boolean hasEight(int number){
        while (number != 0){
            int digit = number%10;
            if(digit == 8){
                return true;
            }else{
                number/=10;
            }
        }
        return false;
    }
    public static void testMagicSum(Scanner in){
        final int SENTINAL =-1;
        int magicSum = 0;
        System.out.print("Enter a positive integer (or -1 to end): ");
        int n = in.nextInt();
        while (n!= SENTINAL){
            if(hasEight(n)){
                magicSum+=n;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            n=in.nextInt();
        }
        System.out.println("The magic sum is: "+magicSum);
    }
    // Ex 3.3:
    public static void print(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if(i != array.length-1){
                System.out.print(";");
            }
        }
        System.out.print("]");
    }
    public static void testPrint(Scanner in){
        System.out.print("Enter the size of array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter the element at "+(i+1)+" : ");
            arr[i] = in.nextInt();
        }
        print(arr);
    }
    //Ex 3.4:
    public static String arrayToString(int[] array){
        String result = "[";
        for (int i = 0; i < array.length; i++){
            result+= Integer.toString(array[i]);
            if(i != array.length-1){
                result += ";";
            }
        }
        result += "]";
        return result;
    }

    public static void testArraytoString(Scanner in){
        System.out.print("Enter the size of array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter the element at "+(i+1)+" : ");
            arr[i] = in.nextInt();
        }
        System.out.print(arrayToString(arr));
    }
    // Ex 3.5:
    public static boolean contains(int[] arr, int key){
        if(arr.length == 0){
            return false;
        }
        for(int num : arr){
            if (num == key){
                return true;
            }
        }
        return false;
    }
    public static void testContains(Scanner in){
        System.out.print("Enter the key value: ");
        int key = in.nextInt();
        System.out.print("Enter the size of array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter the element at "+(i+1)+" : ");
            arr[i] = in.nextInt();
        }
        System.out.print(contains(arr,key));
    }
    // Ex 3.6:
    public static int search(int[] arr, int key){
        if(arr.length ==0 ){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void testSearch(Scanner in){
        System.out.print("Enter the key value: ");
        int key = in.nextInt();
        System.out.print("Enter the size of array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter the element at "+(i+1)+" : ");
            arr[i] = in.nextInt();
        }
        System.out.print(search(arr,key));
    }
    // Ex 3.7:
    public static boolean equals(int[] array1, int[] array2){
        if(array1.length != array2.length){
            return false;
        }
        for (int i = 0; i < array1.length; i++){
            if(array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }
    // Ex 3.8:
    public static int[] copyOf(int[] array){
        int[] copyArray = new int[array.length];
        for(int i = 0; i < array.length;i++){
            copyArray[i]=array[i];
        }
        return copyArray;
    }
    public static void testCopyOf(Scanner in){
        System.out.print("Enter the size of array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter the element at "+(i+1)+" : ");
            arr[i] = in.nextInt();
        }
        print(arr);
    }
    // Ex 3.9:
    public static boolean swap(int[] array1, int[] array2){
        if(array1.length != array2.length){
            return false;
        }
        for(int i = 0; i < array1.length; i++){
            int tmp = array1[i];
            array1[i]=array2[i];
            array2[i]=tmp;
        }
        return true;
    }
    public static void testSwap(Scanner in){
        System.out.print("Enter the size of array1: ");
        int size1 = in.nextInt();
        int[] array1 = new int[size1];
        System.out.print("Enter the size of array2: ");
        int size2 = in.nextInt();
        int[] array2 = new int[size2];
        for(int i = 0; i < size1; i++){
            System.out.print("Enter the element at "+(i+1)+" of array1: ");
            array1[i] = in.nextInt();
        }
        for(int i = 0; i < size2; i++){
            System.out.print("Enter the element at "+(i+1)+" of array2: ");
            array2[i] = in.nextInt();
        }
        System.out.print(swap(array1,array2));
    }
    // Ex 3.10:
    public static void reverse(int[] array){
        for(int fIdx = 0, bIdx = array.length-1;fIdx < bIdx; fIdx++ , bIdx--){
            int temp = array[bIdx];
            array[bIdx]=array[fIdx];
            array[fIdx]=temp;
        }
        print(array);
    }
    public static void testReverse(Scanner in){
        System.out.print("Enter the size of array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter the element at "+(i+1)+" : ");
            arr[i] = in.nextInt();
        }
        reverse(arr);
    }
}
