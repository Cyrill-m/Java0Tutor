package basics_of_software_code_development.cycles;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ЦИКЛЫ
 * Задача 2 - Вычислить значения функции на отрезке [а,b] c шагом h:
 * y=x, если x>2
 * y=-x, если x<=2
 */

public class Task_02 {
    
    public static void main(String[] args) {
        
        int a;
        int b;
        int h;
        int x;
        int y;
        
        //алгоритм работает при условии a<b и h>0.
        a = -5;
        b = 10;
        h = 1;
        
        System.out.printf("Значения функции y(x) на отрезке [%d,%d] c шагом %d:\n", a, b, h);
        
        x = a;
        while (x <= b){
            if (x > 2){
                y = x;
            } else {
                y = -1 * x;
            }
            System.out.printf("x = %d,\ty = %d\n", x, y);
            x = x + h;
        }
    }    
}
