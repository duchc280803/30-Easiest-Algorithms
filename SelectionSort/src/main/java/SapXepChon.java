public class SapXepChon {
    void sort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "");
        }
    }

    public static void main(String[] args) {
        SapXepChon sapXepChon = new SapXepChon();
        int arr[] = {64, 25, 12, 22, 11};
        sapXepChon.sort(arr);
        System.out.println("Sorted array");
        sapXepChon.printArray(arr);
    }
}