public class Quick_Sort {
    public static void main(String[] args) {

        int arr[] = {5,62,2,3,111,81,4};

        QuickSort(arr, 0, arr.length-1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public  static void QuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partetion(arr, low, high);

            QuickSort(arr, low, pi-1);
            QuickSort(arr, pi+1,high);
        }
    }

    private static int partetion(int[] arr, int low, int high) {
        int pivat = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <pivat) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
