package weeks3;

public class LogicalOperators {

    public static void main(String[] args) {
        System.out.println("& 연산은 두개의 피연산자를 모두 평가해서 산출결과를 낸다");
        boolean resultAnd = firstAnd() & secondAnd();

        System.out.println("&& 연산은 앞의 피연산자가 false이면 뒤의 피연산자를 평가하지 않고 바로 false");
        resultAnd = firstAnd() && secondAnd();

        System.out.println("| 연산도 &와 마찬가지이다. ");
        boolean resultOr = firstOr() | secondOr();

        System.out.println("|| 연산은 앞의 피연산자가 true이면 뒤의 피연산자를 평가하지 않고 바로 true");
        resultOr = firstOr() || secondOr();

    }

    private static boolean firstAnd() {
        System.out.println("first 호출");
        return false;
    }

    private static boolean secondAnd() {
        System.out.println("second 호출");
        return true;
    }

    private static boolean firstOr() {
        System.out.println("first 호출");
        return true;
    }

    private static boolean secondOr() {
        System.out.println("second 호출");
        return true;
    }

}
