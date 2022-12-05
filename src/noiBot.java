public class noiBot {
    void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    //in cac phan tu cua arr
    void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
//            System.out.println();
        }
    }

    public static void main(String[] args) {
        noiBot noiBot = new noiBot();
        int arr[] = {32, 2,4,6,2,324,34,213};
        System.out.println("mang ban dau");
        noiBot.printArray(arr);
        noiBot.bubbleSort(arr);
        System.out.println("mang sau khi sap xep");
        noiBot.printArray(arr);
    }
}
