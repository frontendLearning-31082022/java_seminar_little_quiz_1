//        Задание 2.
//                Вывести все простые числа от 1 до 1000

public class Task_2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }

    }

    public static boolean isPrime(int number) {
        if (number == 1) return false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
