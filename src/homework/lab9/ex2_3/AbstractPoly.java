package homework.lab9.ex2_3;
import java.util.Objects;
public abstract class AbstractPoly implements Poly{
    public AbstractPoly(){
    }
    abstract double[] derive();
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractPoly that = (AbstractPoly) o;
        return Objects.equals(coefficients(), that.coefficients());
    }
    @Override
    public int hashCode(){
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        return "AbstractPoly{" +
                "coefficients=" + Objects.toString(coefficients()) +
                '}';
    }
}
