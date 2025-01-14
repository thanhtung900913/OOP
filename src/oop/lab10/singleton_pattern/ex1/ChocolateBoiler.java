package oop.lab10.singleton_pattern.ex1;

public class ChocolateBoiler {
    private static ChocolateBoiler uniqueInstance;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }
    public static ChocolateBoiler getInstance(){
        if (uniqueInstance == null){
            System.out.println(" Tao doi tuong: ");
            uniqueInstance = new ChocolateBoiler();
            return uniqueInstance;
        }
        System.out.println("Tra ve doi tuong: ");
        return uniqueInstance;
    }
    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }
    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
        }
    }
    public void boil(){
        if(!isEmpty() && isBoiled()){
            boiled = true;
        }
    }
    public boolean isEmpty(){
        return empty;
    }
    public boolean isBoiled(){
        return boiled;
    }
}
