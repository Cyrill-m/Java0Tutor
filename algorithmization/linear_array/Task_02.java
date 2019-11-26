package algorithmization.linear_array;

import java.util.Arrays;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ОДНОМЕРНЫЕ МАССИВЫ
 * Задача 2 - Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
 * Заменить все ее члены, большие данного Z, этим числом. 
 * Подсчитать количество замен.
 */

public class Task_02 {
    
    public static void main(String[] args){
        
        double[] a;
        double z;
        int num;
        
        a = new double[]{0.25, 1.333, 2.8, 3.01, 4.55, 5.75, 6.0};
        z = 3.14;
        num = 0;
        
        System.out.println(Arrays.toString(a));
        
        for(int i = 0; i < a.length; i++){
            if(a[i] > z){
                a[i] = z;
                num++;
            }
        }
        
        System.out.println(Arrays.toString(a));
        System.out.println("Количество замен " + num);
    }    
}
