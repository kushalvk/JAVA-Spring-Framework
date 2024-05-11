public class Selection_Sort {
    public static void main(String[] args) {
        int nums[] = {6,5,2,8,9,4};
        int size = nums.length;

        System.out.println("Before Sorted");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        int temp = 0;
        int minIndex = -1;
        for (int i = 0; i < size; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("After Sorted");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}