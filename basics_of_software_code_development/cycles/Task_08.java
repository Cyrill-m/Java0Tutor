package basics_of_software_code_development.cycles;

import java.util.HashSet;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ЦИКЛЫ
 * Задача 8 - Даны два числа. Определить цифры, 
 * входящие в запись как первого так и второго числа.
 */

public class Task_08 {
    
    public static void main(String[] args) {
        
        int num1;
        int num2;
        HashSet<Integer> digSet; //множество общих цифр
        
        num1 = 12422;
        num2 = 12911;
        digSet = new HashSet();
        
        System.out.println("Даны числа " + num1 + " и " + num2);
        System.out.print("Общие цифры: ");
        
        while(num1 > 0){
            int dig1;
            dig1 = num1 % 10;
            num1 = num1 / 10;
            int num2t = num2;
            
            while(num2t > 0){
                int dig2;
                dig2 = num2t % 10;
                num2t = num2t / 10;
                if (dig1 == dig2){
                    digSet.add(dig1);
                    break;
                }
            }
        }
        
        if (digSet.isEmpty()) {
            System.out.print("нет общих цифр");
        } else {
            System.out.print(digSet);
        }
        
        System.out.println();
    }    
}
