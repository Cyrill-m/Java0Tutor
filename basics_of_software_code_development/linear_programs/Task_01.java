package basics_of_software_code_development.linear_programs;

import java.util.Scanner;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ЛИНЕЙНЫЕ ПРОГРАММЫ
 * Задача 1 - Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 */

public class Task_01 {
    
    public static void main(String[] args) {
        
        double a;
        double b;
        double c;
        double z;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Введите значение a:");
        if (input.hasNextDouble()){
            a = input.nextDouble();
        } else {
            System.out.println("Ошибка ввода! Перезапустите программу.");
            input.close();
            return;
        }
        
        System.out.println("Введите значение b:");
        if (input.hasNextDouble()){
            b = input.nextDouble();
        } else {
            System.out.println("Ошибка ввода! Перезапустите программу.");
            input.close();
            return;
        }
        
        System.out.println("Введите значение c:");
        if (input.hasNextDouble()){
            c = input.nextDouble();
        } else {
            System.out.println("Ошибка ввода! Перезапустите программу.");
            input.close();
            return;
        }
        
        z = ((a - 3) * b / 2) + c;
        System.out.printf("Значение функции z = %.2f \n", z);
        input.close();
    }
}
