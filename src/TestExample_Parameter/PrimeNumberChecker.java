package TestExample_Parameter;

public class PrimeNumberChecker {
    public Boolean validate(final Integer primeNumber) {
        for (int i = 2; i < (primeNumber / 2); i++) { // Số nguyên tố   
           if (primeNumber % i == 0) {
              return false;
           }
        }
        return true;
     }
}
