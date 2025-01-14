package practice.state_pattern;

public interface PackageState {
    void setNext(Context context);
    void setPrev(Context context);
    void printState();
}
