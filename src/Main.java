public class Main {

    public static void main(String[] args) {
        System.out.println("Các số nguyên tố bé hơn 100 là: " );
        for (int i = 2; i< 100; i++){
            if (isPrime(i)){
                System.out.printf("%d ", i);
            }
        }
    }

    public static boolean isPrime(int number){
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
