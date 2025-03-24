public class ShellSort {

    public static void main(String[] args) {

        int[] array = {21, 3, -15, 45, -30, 9};

        for(int gap = array.length/2; gap > 0; gap /= 2){

            for(int i = gap; i < array.length; i++){

                int newElement = array[i];

                int j = i;
                while(j >= gap && array[j-gap] > newElement){
                    array[j] = array[j-gap];
                    j -= gap;
                }

                array[j] = newElement;

            }

        }

        for (int i = 0; i <= array.length-1; i++){
            System.out.println(array[i]);
        }
    }
}
