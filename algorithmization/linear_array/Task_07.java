package algorithmization.linear_array;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ОДНОМЕРНЫЕ МАССИВЫ
 * Задача 7 - Даны действительные числа а1 ,а2 ,..., аn. 
 * Найти max(a1 + a2n, a2 + a2n-1,... , an + an+1).
 */

public class Task_07 {
    
    public static void main(String[] args) {
        int n;
        double[] a, b;
        double max;        
        Random rand;
        
        n = 10; 
        a = new double[n];
        rand = new Random();
        
        //инициализация элементов массива случайными числами
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextGaussian() * 10;
        }
        
        System.out.println(Arrays.toString(a));
        
        b = new double[n - 1];
        
        for(int i = 0; i < b.length; i++){
            b[i] = a[i] + a[i + 1];
        }
        
        System.out.println(Arrays.toString(b));
        
        max = b[0];
        for(int i = 0; i < b.length; i++){
            if(max < b[i]){
                max = b[i];
            }
        }
        
        System.out.println(max);
    }
}
