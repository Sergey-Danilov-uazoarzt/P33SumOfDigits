public class Array {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        System.out.println("The sum of all array elements is " + sum);
    }
}
