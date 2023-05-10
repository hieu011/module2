import java.util.Scanner;

public class show20FirstPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to:");
        int number = scanner.nextInt();
        int count = 0;
        int num = 2;
        boolean isPrime = true;
        while (count < number) {
            if (checkPrime(num)){
                System.out.println(num + "la so nguyen to");
                num++;
                count++;
            }else {
                num++;
            }
        }
    }
    public static boolean checkPrime(int number) {
        if(number == 2){
            return true;
        }
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}

