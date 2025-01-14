package practice.factory_pattern;

public class ComputerFactory {
    public Computer getComputer(String name, String CPU, int RAM, String VGA){
        if(name.equalsIgnoreCase("acer")){
            return new ACER(CPU, RAM, VGA);
        }
        return new HP(CPU, RAM, VGA);
    }
}
