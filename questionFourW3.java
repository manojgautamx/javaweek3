package workshop3;


public class questionFourW3 {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 3};

        System.out.println("Original Array:");
        printArray(array);

        bubbleSort(array);

        System.out.println("Sorted Array:");
        printArray(array);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

