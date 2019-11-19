package basics_of_software_code_development.cycles;

import java.util.Scanner;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ЦИКЛЫ
 * Задача 7 - Для каждого натурального числа в промежутке от m до n 
 * вывести все делители, кроме единицы и самого числа. 
 * m и n вводятся с клавиатуры.
 */

public class Task_07 {
    
    public static void main(String[] args) {
        
        int m;
        int n;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Введите натуральное число m:");
        if (input.hasNextInt()){
            m = input.nextInt(); 
            if (m <= 0){
                System.out.println("Натуральное число должно быть больше нуля! Перезапустите программу.");
                input.close();
                return;
            }
        } else {
            System.out.println("Ошибка ввода! Перезапустите программу.");
            input.close();
            return;
        }
        
        System.out.println("Введите натуральное число n(n > m):");
        if (input.hasNextDouble()){
            n = input.nextInt();
            if (n <= m) {
                System.out.println("Число n должно быть больше m. Перезапустите программу.");
                input.close();
                return;
            }            
        } else {
            System.out.println("Ошибка ввода! Перезапустите программу.");
            input.close();
            return;
        }
        
        for (int i = m; i <= n; i++) {
            System.out.print("Число: " + i + "\tимеет делители: ");
            for (int j = 2; j < i; j++) {
                int rez;
                rez = i % j;
                if (rez == 0) {
                    System.out.print(j + "  ");
                }
            }
            System.out.println();
        }
    }
}
