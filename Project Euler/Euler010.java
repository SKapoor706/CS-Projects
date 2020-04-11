// 4-6-2018 @Sameer Kapoor
class Euler010 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 2000000; i++) {
            if(isPrime(i)) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("Sum: " + sum);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i+=2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
