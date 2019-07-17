package basics_of_software_code_development.linear_programs;

import java.util.Scanner;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ЛИНЕЙНЫЕ ПРОГРАММЫ
 * Задача 6 - Для данной области составить линейную программу, 
 * которая печатает true, если точка с координатами (х, у) принадлежит 
 * закрашенной области, и false — в противном случае
 */

public class Task_06 {
    
    public static void main(String[] args) {
        
        int coordX;
        int coordY;
        boolean result;
        boolean conditionTop;
        boolean conditionBottom;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Введите координату X точки:");
        if (input.hasNextInt()){
            coordX = input.nextInt();            
        } else {
            System.out.println("Ошибка ввода! Перезапустите программу.");
            input.close();
            return;
        }
        
        System.out.println("Введите координату Y точки:");
        if (input.hasNextInt()){
            coordY = input.nextInt();
            input.close();
        } else {
            System.out.println("Ошибка ввода! Перезапустите программу.");
            input.close();
            return;
        }
        
        conditionTop = (Math.abs(coordX) <= 2) && (coordY > 0 && coordY <= 4);
        conditionBottom = (Math.abs(coordX) <= 4) && (coordY >= -3 && coordY <= 0);
        
        result = conditionTop || conditionBottom;
        System.out.println(result);
    }
}
