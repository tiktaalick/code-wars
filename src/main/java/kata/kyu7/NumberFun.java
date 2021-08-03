package kata.kyu7;

public class NumberFun {

    private NumberFun() {
    }

    public static long findNextSquare(long square) {
        return Math.sqrt(square) % 1 != 0 ? -1 : (long) Math.pow(Math.sqrt(square) + 1, 2);
    }
}

