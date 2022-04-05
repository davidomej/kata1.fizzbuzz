public class FizzBuzz {

    public String play(int i) {
       if(i%3==0 && i%5==0){
           return "FizzBuzz";
       }
       return ""+i;
    }
}
