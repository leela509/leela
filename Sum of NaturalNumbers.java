class RecursionDemo{
    static int sumNaturalNumbers(int n){
        if(n==1){
            return 1;
        }else{
            return n+sumNaturalNumbers(n-1);
        }
    }
    public static void main(String[]args){
        int number=10;
        int result=sumNaturalNumbers(number);
        System.out.println("Sum of first"+number+"natural numbers is"+result);
         }
        }
        