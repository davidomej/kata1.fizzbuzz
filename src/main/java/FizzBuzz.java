public class FizzBuzz{

     public void print_number(){
         int fizz;
         int buzz;
        for(int n = 1; n<100; n++){
            if(n%3==0){
                System.out.println("fizz");
            }else if(n%5==0) {
                System.out.println("buzz");
            }else {
                System.out.println(n);
            }
        }
    }
}
