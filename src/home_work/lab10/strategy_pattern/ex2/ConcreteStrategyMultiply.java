package home_work.lab10.strategy_pattern.ex2;

class ConcreteStrategyMultiply implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
