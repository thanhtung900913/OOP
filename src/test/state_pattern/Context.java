package test.state_pattern;

public class Context {
    private PackageState state;
    public Context(){
        this.state = new OrderedState();
    }
    public void setState(PackageState state){
        this.state = state;
    }
    public void getSate(){
        this.state.printState();
    }
    public void next(){
        state.setNext(this);
    }
    public void prev(){
        state.setPrev(this);
    }
}
