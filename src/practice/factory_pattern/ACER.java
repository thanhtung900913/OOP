package practice.factory_pattern;

public class ACER extends Computer{
    private String CPU;
    private int RAM;
    private String VGA;

    public ACER(String CPU, int RAM, String VGA) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.VGA = VGA;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setVGA(String VGA) {
        this.VGA = VGA;
    }

    @Override
    public String getCPU() {
        return "CPU:: "+this.CPU;
    }

    @Override
    public String getRAM() {
        return "RAM:: "+this.RAM;
    }

    @Override
    public String getVGA() {
        return "VGA:: "+this.VGA;
    }
}
