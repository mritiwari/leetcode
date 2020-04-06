public class Single_number_Day1 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumber(nums2));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];

        }
        return result;
    }
}
