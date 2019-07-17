package basics_of_software_code_development.branching;

import java.util.Scanner;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ВЕТВЛЕНИЯ
 * Задача 1 - Даны два угла треугольника (в градусах). 
 * Определить, существует ли такой треугольник, и если да, 
 * то будет ли он прямоугольным.
 */

public class Task_01 {
    
    public static void main(String[] args) {
        
        int angel1;
        int angel2;
        boolean triangleExist;
        boolean triangleOrtho;
                
        Scanner input = new Scanner(System.in);
        
        System.out.println("Введите первый угол треугольника (в градусах):");
        if (input.hasNextInt()){
            angel1 = input.nextInt();            
        } else {
            System.out.println("Ошибка ввода! Перезапустите программу.");
            input.close();
            return;
        }
        
        if (angel1 < 0){
            angel1 = Math.abs(angel1);
            System.out.println("Отрицательные значения углов не допустимы,"
                    + "\nзначение преобразовано в положительное: " + angel1);
        }
        
        System.out.println("Введите второй угол треугольника (в градусах):");
        if (input.hasNextInt()){
            angel2 = input.nextInt();
            input.close();
        } else {
            System.out.println("Ошибка ввода! Перезапустите программу.");
            input.close();
            return;
        }
        
        if (angel2 < 0){
            angel2 = Math.abs(angel2);
            System.out.println("Отрицательные значения углов не допустимы,"
                    + "\nзначение преобразовано в положительное: " + angel2);
        }
        
        triangleExist = (angel1 + angel2) < 180;
        
        if (triangleExist){
            triangleOrtho = (angel1 == 90) || (angel2 == 90) || (angel1 + angel2 == 90);
            System.out.println("Треугольник с такими углами существует");
            if (triangleOrtho){
                System.out.println("и он прямоугольный");
            } else {
                System.out.println("и он не прямоугольный");
            }
        } else {
            System.out.println("Треугольник с такими углами не существует");
        }
    }
}
