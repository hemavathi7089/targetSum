import java.util.Arrays;

public class TargetSum {

    public static int[] targetSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            if (currentSum == target) {
                return new int[]{left + 1, right + 1};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }

    public static void testPossitiveCase() {
         int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = targetSum(numbers, target);
        int[] expected = {1,2};
        boolean flag = true;
        for(int i=0; i< expected.length; i++) {
            if(expected[i] != result[i]) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
    public static void testNegativeCase() {
        int[] numbers = {2, 3, 11, 15};
        int target = 9;
        int[] result = targetSum(numbers, target);
        int[] expected = {0};
        boolean flag = true;
        for(int i=0; i< expected.length; i++) {
            if(i >= result.length || expected[i] != result[i]) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
    public static void main(String[] args) {
        testPossitiveCase();
        testNegativeCase();
    }
}
