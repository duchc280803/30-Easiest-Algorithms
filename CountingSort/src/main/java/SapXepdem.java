import java.util.Arrays;

public class SapXepdem {

    public static void countingSort(int[] arr) {
        int maxVal = Arrays.stream(arr).max().getAsInt(); // Tìm giá trị lớn nhất trong mảng

        int[] count = new int[maxVal + 1]; // Tạo mảng đếm có kích thước phù hợp

        // Tính toán số lượng phần tử
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Tính toán mảng đếm tích lũy
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] sortedArr = new int[arr.length]; // Mảng kết quả

        // Đặt các phần tử vào vị trí tương ứng trong mảng kết quả
        for (int i = arr.length - 1; i >= 0; i--) {
            sortedArr[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy mảng kết quả vào mảng ban đầu
        System.arraycopy(sortedArr, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);

        // In mảng đã được sắp xếp
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
    }
}
