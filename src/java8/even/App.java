package java8.even;

public class App {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6};
        ExpressionHelper exprHelper = new ExpressionHelper();
        System.out.println(sum(nums, exprHelper::isEven)); // 0
    }

    private static int sum(int[] numbers, Expression func) {
        int result = 0;
        for (int i : numbers) {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }
}