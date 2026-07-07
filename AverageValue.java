 public class AverageValue {
    public static int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;

        for (int num : nums) {
            // Check if number is even and divisible by 3
            if (num % 2 == 0 && num % 3 == 0) {
                sum += num;
                count++;
            }
        }

        // If no valid numbers found, return 0
        if (count == 0) {
            return 0;
        }

        // Return average (integer division automatically rounds down)
        return sum / count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 10, 12, 15};
        System.out.println(averageValue(nums)); // Output: 9
    }
}

    

