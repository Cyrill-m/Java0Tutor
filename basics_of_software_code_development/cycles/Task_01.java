package basics_of_software_code_development.cycles;

import java.util.Scanner;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ЦИКЛЫ
 * Задача 1 - Напишите программу, где пользователь вводит 
 * любое целое положительное число. А программа суммирует 
 * все числа от 1 до введенного пользователем числа. 
 */

public class Task_01 {
    
    public static void main(String[] args) {
        
        int number;        
        long summa;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Введите целое положительное число:");
        if (input.hasNextInt()){
            number = input.nextInt();
            input.close();
        } else {
            System.out.println("Ошибка ввода! Перезапустите программу.");
            input.close();
            return;
        }
        
        summa = 0;
        if (number > 0){            
            for (int i = 0; i <= number; i++) {
                summa = summa + i;
            }
        }
        
        System.out.println("Сумма чисел: " + summa);
    }    
}
