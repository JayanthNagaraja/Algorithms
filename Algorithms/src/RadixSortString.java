public class RadixSortString {

    public static void main(String[] args) {

        String[] array = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        radixSort(array, 26, array.length);

        for (int i = 0; i <= array.length-1; i++){
            System.out.println(array[i]);
        }

    }

    public static void radixSort(String[] array, int radix, int width){

        for(int i = width-1; i >= 0; i--){
            radixSingleSort(array, i, radix);
        }

    }

    public static void radixSingleSort(String[] array, int position, int radix){

        int numItems = array.length;
        int[] countArray = new int[radix];

        for(String value: array){
            countArray[getIndex(position, value)]++;
        }

        for (int j = 1; j < radix; j++){
            countArray[j] += countArray[j-1];
        }

        String[] temp = new String[numItems];
        for(int tempIndex = numItems-1; tempIndex >= 0; tempIndex--){

            temp[--countArray[getIndex(position, array[tempIndex])]] = array[tempIndex];

        }

        for(int tempIndex = 0; tempIndex < numItems; tempIndex++){

            array[tempIndex] = temp[tempIndex];

        }

    }

    public static int getIndex(int pos, String value){
        return value.charAt(pos) - 'a';
    }
}
