//Задание 1.
//        Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n


import javax.swing.*;
import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        while (true) {
            try {
                System.out.println("Введите число N");
                int digN = new Scanner(System.in).nextInt();


                long sum = 0;
                long facto = 1;
                for (int i = 1; i <= digN; i++) {
                    sum = sum + i;
                    facto = facto * i;
                }


                System.out.printf("Сумма %d Факториал %d \n",sum,facto);
//                JOptionPane.showMessageDialog(null, mgs);

                break;
            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "Неправильный ввод. Введите число N");
                System.out.println( "Неправильный ввод. Введите число N");
            }
        }


    }


}
