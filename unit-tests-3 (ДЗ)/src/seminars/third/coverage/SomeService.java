package seminars.third.coverage;

public class SomeService {
    public SomeService() {
    }

    public String fizzBuzz(int i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(i);
    }

    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6) {
            return true;
        } else {
            return nums[nums.length - 1] == 6;
        }
    }

    public double calculatingDiscount(double purchaseAmount, int discountAmount) {
        double discountedAmount = 0.0;
        if (purchaseAmount >= 0.0) {
            if (discountAmount >= 0 && discountAmount <= 100) {
                discountedAmount = purchaseAmount - purchaseAmount * (double) discountAmount / 100.0;
                return discountedAmount;
            } else {
                throw new ArithmeticException("Скидка должна быть в диапазоне от 0 до 100%");
            }
        } else {
            throw new ArithmeticException("Сумма покупки не может быть отрицательной");
        }
    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return b + c;
        } else if (b == 13) {
            return a + c;
        } else {
            return c == 13 ? a + b : a + b + c;
        }
    }
}
