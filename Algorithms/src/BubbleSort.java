//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {21, 3, -15, 45, -30, 9};

        for(int lastUnsortedIndex = array.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int j = 0; j < lastUnsortedIndex; j++){
                if(array[j] > array[j+1]){
                    swap(array, j, j+1);
                }
            }
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