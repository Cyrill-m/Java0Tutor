package basics_of_software_code_development.cycles;

import java.math.BigDecimal;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ЦИКЛЫ
 * Задача 4 - Составить программу нахождения произведения 
 * квадратов первых двухсот чисел.
 */

public class Task_04 {
    
    public static void main(String[] args) {        
        
        BigDecimal multiplication = new BigDecimal(1);        
        
        for (int i = 1; i <= 200; i++) {            
            BigDecimal kvadr = new BigDecimal(i*i);
            multiplication = multiplication.multiply(kvadr);
        }
        
        System.out.printf("произведение квадратов первых двухсот чисел %.4e\n", multiplication);       
    } 
}
