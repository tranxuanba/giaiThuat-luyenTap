import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class sapXep {
    //theo thu tu tang dan
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.print("Nhập số phần tử của mảng: ");
//        int n = scanner.nextInt();
//        // khởi tạo arr
//        int [] arr = new int [n];
//        System.out.print("Nhập các phần tử của mảng: \n");
//        for (int i = 0; i < n; i++) {
//            System.out.printf("a[%d] = ", i);
//            arr[i] = scanner.nextInt();
//        }
//        // sắp xếp dãy số theo thứ tự tăng dần
//        sortASC(arr);
//        System.out.println("Dãy số được sắp xếp tăng dần: ");
//        show(arr);

        int a[] = {2, 4, 9, 10, 11, 22, 24, 31, 48, 56, 76, 86 };
        int n1 = a.length;
        int x = 11;
        int kq = birary(a, 0, n1 -1, x);
        if (kq == -1){
            System.out.println("khong co trong mang");
        }else {
            System.out.println("phan tu o vi tri" + kq);
        }

    }

//    /**
//     * sắp xếp mảng số nguyên theo thứ tự tăng dần
//     *
//     * @param arr: mảng các số nguyên
//     * @param n: số phần tử của mảng
//     */
    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

//    /**
//     * in các phần tử của mảng ra màn hình
//     *
//     * @param arr: mảng các số nguyên
//     * @param n: số phần tử của mảng
//     */
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
   static int birary(int arr[], int l, int n, int x) {
        if (l >= n) {
            int mid = l + (l - n)/2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                return birary(arr, mid + 1, n, x);
            return birary(arr, l, mid - 1, x);
        }
        return -1;
    }
}
