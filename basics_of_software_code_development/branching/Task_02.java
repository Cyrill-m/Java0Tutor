package basics_of_software_code_development.branching;

import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ВЕТВЛЕНИЯ
 * Задача 2 - Найти max{min(a, b), min(c, d)}. 
 */

public class Task_02 {
    
    public static void main(String[] args) {
        
        int a;
        int b;
        int c;
        int d;
        final int RANGE = 100;
        int minAB;
        int minCD;
        int result;
        
        Random rand = new Random();
        
        a = rand.nextInt(RANGE);
        b = rand.nextInt(RANGE);
        c = rand.nextInt(RANGE);
        d = rand.nextInt(RANGE);
        
        if (a < b){
            minAB = a;
        } else {
            minAB = b;
        }
        
        if (c < d){
            minCD = c;
        } else {
            minCD = d;
        }
        
        if (minAB > minCD){
            result = minAB;
        } else {
            result = minCD;
        }
        
        System.out.printf("max{min(%d, %d), min(%d, %d)} = %d\n", a, b, c, d, result);
    }    
}
