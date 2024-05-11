public class Linear_BInary_Search {
    public static void main(String[] args) {

        int nums[] = new int[1000];
        int target = 900;

        int result1 = LinerSearch(nums, target);
        int result2= binarySearch(nums, target, 0, nums.length-1);

        if (result1 != -1) {
            System.out.println("Elemnt found at Index: " + result1);
        } else {
            System.out.println("Eleent not found");
        }
    }

//    Liner Search (Always take more steps)
    public static int LinerSearch(int[] nums, int target) {

        int step = 0;

        for (int i = 0; i < nums.length; i++) {
            step++;
            if (nums[i] == target) {
                System.out.println("Steps taken by linear: " + step);
                return i;
            }
        }
        System.out.println("Steps taken by linear: " + step);
        return -1;
    }

//    binary Search (Always take less steps)
    public static int binarySearch(int[] nums, int target,  int left, int right) {
        int step = 0;
//        int left = 0;
//        int right = nums.length - 1;

        if (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return binarySearch(nums, target, mid + 1, right);
            } else {
                return binarySearch(nums, target, left, mid - 1);
            }
        }

//        while (left <= right) {
//            step++;
//            int mid = (left + right) / 2;
//
//            if (nums[mid] == target) {
//                System.out.println("Steps taken by Binary: " + step);
//                return mid;
//            } else if (nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//
//        System.out.println("Steps taken by linear: " + step);
        return -1;
    }
}