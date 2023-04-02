package Create_obj;
import java.util.*;
class MyCalculator {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
} 
class AdvancedArithmeti {
    public static void main(String[] args) {
        int n = 6;
        MyCalculator myCalculator = new MyCalculator();					//object of above class
        int sum = myCalculator.divisor_sum(n);							//call method and get sum from it
        System.out.println("I implemented: AdvancedArithmetic\n" + sum);
    

    
    }


}