public class QuickSort {

    public static void main(String[] args) {

        int[] array = {21, 3, -15, 45, -30, 9};

        quickSort(array, 0, array.length);

        for (int i = 0; i <= array.length-1; i++){
            System.out.println(array[i]);
        }

    }

    public static void quickSort(int[] array, int start, int end){

        if(end - start < 2){
            return;
        }

        int partitionIndex = partition(array, start, end);
        quickSort(array, start, partitionIndex);
        quickSort(array, partitionIndex+1, end);

    }

    public static int partition(int[] array, int start, int end){

        int i = start;
        int j = end;
        int pivot = array[start];

        while(i < j){

            //empty loop
            while(i < j && array[--j] >= pivot);
            if(i < j){
                array[i] = array[j];
            }

            //empty loop
            while(i < j && array[++i] <= pivot);
            if(i < j){
                array[j] = array[i];
            }

        }
        
        array[j] = pivot;
        return j;

    }

}
