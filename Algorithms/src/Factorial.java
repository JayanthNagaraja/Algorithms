public class Factorial {

    public static int factorials(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n * factorials(n-1);
        }
    }

    public static int iterativeFactorials(int n){
        int factorial = 1;

        for(int i = 1; i <= n; i++){
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String []args){
        int n = 5;

        int result = factorials(n);
        int result1 = iterativeFactorials(n);

        System.out.println(result+","+result1);
    }
}
