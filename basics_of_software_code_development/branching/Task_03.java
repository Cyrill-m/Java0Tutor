package basics_of_software_code_development.branching;

import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ВЕТВЛЕНИЯ
 * Задача 3 - Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
 * Определить, будут ли они расположены на одной прямой. 
 */

public class Task_03 {
    
    public static void main(String[] args) {
        
        int x1, y1;
        int x2, y2;
        int x3, y3;
        double rezX, rezY;
        String otvet;
        
        Random rand = new Random();
        final int RANGE = 100;
        
        x1 = 0;//rand.nextInt(RANGE);
        x2 = 3;//rand.nextInt(RANGE);
        x3 = 6;//rand.nextInt(RANGE);
        y1 = 1;//rand.nextInt(RANGE);
        y2 = 2;//rand.nextInt(RANGE);
        y3 = 3;//rand.nextInt(RANGE);
        
        rezX = Math.round((double)(x3 - x1)/(x2 - x1)*1000)/1000.0;
        rezY = Math.round((double)(y3 - y1)/(y2 - y1)*1000)/1000.0;
        
        otvet = (rezX == rezY) ? "лежат" : "не лежат";
        
        System.out.printf("Точки А(%d,%d), В(%d,%d) и С(%d,%d)\n", x1, y1, x2, y2, x3, y3);
        //System.out.println("rezX " + rezX);
        //System.out.println("rezY " + rezY);
        System.out.printf("%s на одной прямой\n", otvet);
    }
    
}
