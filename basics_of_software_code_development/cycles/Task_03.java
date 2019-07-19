package basics_of_software_code_development.cycles;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ЦИКЛЫ
 * Задача 3 - Найти сумму квадратов первых ста чисел. 
 */

public class Task_03 {
    
    public static void main(String[] args) {
        
        int sum;
        
        sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i*i;
        }
        
        System.out.println("сумма квадратов первых ста чисел " + sum);
    }    
}
