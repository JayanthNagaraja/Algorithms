public class InsertionSort {

    public static void main(String[] args) {

        int[] array = {21, 3, -15, 45, -30, 9};

        //modified for recursion
        //insertionSortRecursion(array, array.length);

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++){

            int newElement = array[firstUnsortedIndex];

            int i;

            for(i = firstUnsortedIndex; i > 0 && array[i-1] > newElement; i--){
                array[i] = array[i-1];
            }

            array[i] = newElement;
        }

        for (int i = 0; i <= array.length-1; i++){
            System.out.println(array[i]);
        }
    }

    //modified for recursion
    public static void insertionSortRecursion(int [] array, int numItems){

        if(numItems < 2){
            return;
        }

        insertionSortRecursion(array, numItems-1);

        int newElement = array[numItems-1];

        int i;
        for(i = numItems-1; i > 0 && array[i-1] > newElement; i--){
            array[i] = array[i-1];
        }

        array[i] = newElement;

    }
}
