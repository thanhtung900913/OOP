package practice.factory_pattern;

public abstract class Computer {
    public abstract String getCPU();
    public abstract String getRAM();
    public abstract String getVGA();

    public String toString(){
        return "PC configuration: "+this.getCPU() +" " + this.getRAM() +" "+ this.getVGA();
    }
}
