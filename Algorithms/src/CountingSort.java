public class CountingSort {

    public static void main(String[] args) {

        int[] array = {2, 4, 1, 5, 6, 8, 4, 2, 6, 7};

        countingSort(array, 1, 10);

        for (int i = 0; i <= array.length-1; i++){
            System.out.println(array[i]);
        }

    }

    public static void countingSort(int[] array, int min, int max){

        int[] countArray = new int[(max-min) + 1];

        for(int i = 0; i < array.length; i++){
            countArray[array[i] - min]++;
        }

        int j = 0;
        for(int i = min; i <= max; i++){
            while(countArray[i - min] > 0){
                array[j++] = i;
                countArray[i-min]--;
            }
        }

    }

}
