package basics_of_software_code_development.branching;

import java.util.Scanner;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ВЕТВЛЕНИЯ
 * Задача 5 - Вычислить значение функции F(x)= 
 * x^2 - 3x + 9, если x <= 3
 * 1/(x^3 + 6), если x > 3.
 */

public class Task_05 {
    
    public static void main(String[] args) {
        
        double func;
        double x;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Введите значение аргумента x:");
        if (input.hasNextDouble()){
            x = input.nextDouble();
            input.close();
        } else {
            System.out.println("Ошибка ввода! Перезапустите программу.");
            input.close();
            return;
        }
        
        if (x > 3){
            func = 1/(Math.pow(x, 3) + 6);
        } else {
            func = x*x - 3*x + 9;
        }
        
        System.out.printf("значение функции F(x)= %.3e\n", func);
    }    
}
