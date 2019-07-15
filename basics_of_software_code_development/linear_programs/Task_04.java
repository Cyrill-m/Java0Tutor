package basics_of_software_code_development.linear_programs;

import java.util.Scanner;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ЛИНЕЙНЫЕ ПРОГРАММЫ
 * Задача 4 - Дано действительное число R вида nnn.ddd 
 * (три цифровых разряда в дробной и целой частях). 
 * Поменять местами дробную и целую части числа и 
 * вывести полученное значение числа. 
 */

public class Task_04 {
    
    public static void main(String[] args) {
        
        double number;        
        double result;        
        int numberNNN;
        int numberDDD;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Введите действительное число вида nnn,ddd:");
        if (input.hasNextDouble()){
            number = input.nextDouble();
            input.close();
        } else {
            System.out.println("Ошибка ввода! Перезапустите программу.");
            input.close();
            return;
        }
        
        numberNNN = (int)number;
        if (Math.abs(numberNNN) >= 1000){
            System.out.println("Ошибка формата! Целая часть больше 999.");            
            return;
        }
        
        numberDDD = (int)(number * 1000 - numberNNN * 1000);
        result = numberDDD + numberNNN / 1000.0;
        
        //System.out.println("Целая часть: " + numberNNN);
        //System.out.println("Дробная часть: " + numberDDD);
        System.out.printf("Число вида ddd.nnn: %.3f \n", result);        
    }
}
