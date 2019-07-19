package basics_of_software_code_development.branching;

import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ВЕТВЛЕНИЯ
 * Задача 4 - Заданы размеры А, В прямоугольного отверстия и 
 * размеры х, у, z кирпича. Определить, пройдет ли кирпич 
 * через отверстие. 
 */

public class Task_04 {
    
    public static void main(String[] args) {
        
        int a, b;       //размеры прямоугольного отверстия
        int x, y, z;    //размеры кирпича
        
        Random rand = new Random();
        final int RANGE = 9;
        
        a = rand.nextInt(RANGE) + 1;
        b = rand.nextInt(RANGE) + 1;
        x = rand.nextInt(RANGE) + 1;
        y = rand.nextInt(RANGE) + 1;
        z = rand.nextInt(RANGE) + 1;
        
        System.out.printf("Размеры прямоугольного отверстия: %d x %d\n", a, b);
        System.out.printf("Размеры кирпича: %d x %d x %d\n", x, y, z);
        
        if (((a >= x || a >= y) && b >= z) ||
            ((a >= x || a >= z) && b >= y) ||
            ((a >= y || a >= z) && b >= x)){
            System.out.println("Кирпич пройдет через отверстие.");
        } else {
            System.out.println("Кирпич не пройдет через отверстие.");
        }
    }
}
