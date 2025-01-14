package second.ex2;

public abstract class ToppingDecorator extends Bread {
	Bread bread;
	
	public abstract String getDescription();

	public Bread getBread() {
		return this.bread;
	}
}
