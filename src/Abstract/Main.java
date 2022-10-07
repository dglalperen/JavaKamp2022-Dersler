package Abstract;

public class Main {
    public static void main(String[] args) {
        GameCalculator[] gameCalculators = new GameCalculator[]{new WomanGameCalculator(), new ChildGameCalculator()};

        for(GameCalculator gameCalculator: gameCalculators){
            gameCalculator.calculate();
        }
    }
}
