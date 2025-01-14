package homework.lab10.strategy_pattern.ex2;

class ConcreteStrategyAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
