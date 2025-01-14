package week3_2;

import java.util.Scanner;

public class exercisesOnAlgorithmsSortingAndSearching {
    public static void main(String[] args) {
        testLinearSearch();
    }
    // Ex 2.1
    public static boolean linearSearch(int[] array, int key){
        for (int item : array){
            if (key == item){
                return true;
            }
        }
        return false;
    }
    public static int linearSearchIndex(int[] array, int key){
        int index = -1;
        if(!linearSearch(array,key)){
            return index;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void testLinearSearch(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an array: ");
        String input = scanner.nextLine();
        String[] str = input.split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println("Enter a key: ");
        int key = scanner.nextInt();

        System.out.println(linearSearch(arr,key));
    }
    // Ex 2.2:
    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx){
        if(fromIdx == toIdx){
            if (array[fromIdx]==key){
                return true;
            }else {
                return false;
            }
        }
        else {
            int middleIdx = (fromIdx + toIdx)/2;
            if (key == array[middleIdx]){
                return true;
            }else if(key < array[middleIdx]){
                toIdx = middleIdx;
            }else {
                fromIdx = middleIdx+1;
            }
        }
        return binarySearch(array,key,fromIdx,toIdx);
    }

    public static boolean binarySearch(int[] array, int key){
        int fromIdx =0;
        int toIdx = array.length;
        while (fromIdx != toIdx){
            int middleIdx = (fromIdx+toIdx)/2;
            if(array[middleIdx]==key){
                return true;
            }else if(array[middleIdx]>key){
                toIdx=middleIdx;
            }else {
                fromIdx = middleIdx + 1;
            }
        }
            return false;
    }
    public static void testLinearSearchIndex(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an array: ");
        String input = scanner.nextLine();
        String[] str = input.split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println("Enter a key: ");
        int key = scanner.nextInt();

        System.out.println(linearSearchIndex(arr,key));
    }
    // Ex 2.3:
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j <= array.length; j++){
                if(array[j] <array[j-1]){
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void testBubbleSort(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an array: ");
        String input = scanner.nextLine();
        String[] str = input.split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        bubbleSort(arr);
    }
// Ex 2.4
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIdx = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIdx = j;
                }
            }
            int tmp = array[i];
            array[i] = min;
            array[minIdx] = tmp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void testSelectionSort(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an array: ");
        String input = scanner.nextLine();
        String[] str = input.split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        selectionSort(arr);
    }
    // Ex 2.5:
    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j <= i; j++){
                if(array[i] <array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void testInsertionSort(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an array: ");
        String input = scanner.nextLine();
        String[] str = input.split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        insertionSort(arr);
    }
}
