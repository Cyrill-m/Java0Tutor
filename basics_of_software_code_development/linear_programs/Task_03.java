package basics_of_software_code_development.linear_programs;

import java.util.Scanner;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ЛИНЕЙНЫЕ ПРОГРАММЫ
 * Задача 3 - Вычислить значение выражения по формуле 
 * (все переменные принимают действительные значения):
 * (sin x + cos y)/(cos x - sin y) * tg xy
 * 
 */

public class Task_03 {
    
    public static void main(String[] args) {
        
        double x;
        double y;
        double result;        
        double resultZnam;  //результат знаменателя дроби
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Введите значение x:");
        if (input.hasNextDouble()){
            x = input.nextDouble();
        } else {
            System.out.println("Ошибка ввода! Перезапустите программу.");
            input.close();
            return;
        }
                        
        System.out.println("Введите значение y:");
        if (input.hasNextDouble()){
            y = input.nextDouble();
        } else {
            System.out.println("Ошибка ввода! Перезапустите программу.");
            input.close();
            return;
        }
        
        resultZnam = Math.cos(x) - Math.sin(y);
        if (resultZnam == 0){
            System.out.println("Ошибка: деление на ноль. Перезапустите программу.");
            input.close();
            return;
        }
        
        result = (Math.sin(x) + Math.cos(y))/resultZnam * Math.tan(x * y);
        System.out.printf("Значение функции = %.3e \n", result);
        input.close();
    }    
}
