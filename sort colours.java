public class Solution {
    public void sortColors(int[] nums) {
        int red = 0;  // Pointer for the red color (0)
        int white = 0;  // Pointer for the white color (1)
        int blue = nums.length - 1;  // Pointer for the blue color (2)

        while (white <= blue) {
            if (nums[white] == 0) {
                // If the current element is 0, swap it with the red pointer
                swap(nums, red, white);
                red++;
                white++;
            } else if (nums[white] == 1) {
                // If the current element is 1, move the white pointer
                white++;
            } else {
                // If the current element is 2, swap it with the blue pointer
                swap(nums, white, blue);
                blue--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        Solution solution = new Solution();
        solution.sortColors(nums1);

        System.out.print("Sorted Colors 1: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums2 = {2, 0, 1};
        solution.sortColors(nums2);

        System.out.print("Sorted Colors 2: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
