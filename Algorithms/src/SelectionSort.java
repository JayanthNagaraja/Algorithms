public class SelectionSort {
    public static void main(String[] args) {

        int[] array = {21, 3, -15, 45, -30, 9};

        for(int lastUnsortedIndex = array.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            int largest = 0;

            for(int j = 1; j <= lastUnsortedIndex; j++){
                if(array[j] > array[largest]){
                    largest = j;
                }
            }

            swap(array, largest, lastUnsortedIndex);
        }

        for (int i = 0; i <= array.length-1; i++){
            System.out.println(array[i]);
        }
    }

    public static void swap(int[] arr, int i, int j){

        if(i==j){
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
