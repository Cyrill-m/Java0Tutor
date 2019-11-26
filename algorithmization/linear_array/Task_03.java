package algorithmization.linear_array;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ОДНОМЕРНЫЕ МАССИВЫ
 * Задача 3 - Дан массив действительных чисел, размерность которого N. 
 * Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */

public class Task_03 {
    
    public static void main(String[] args) {
        int n;
        double[] a;
        int positive;
        int negative;
        int zero;
        Random rand;
        
        n = 10; 
        a = new double[n];
        rand = new Random();
        positive = 0;
        negative = 0;
        zero = 0;
        
        //инициализация элементов массива случайными числами
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextGaussian() * 10;
        }
        
        System.out.println(Arrays.toString(a));
        
        for(int i = 0; i < a.length; i++){
            if(a[i] > 0){
                positive++;
                continue;
            }
            if(a[i] < 0){
                negative++;
            }else{
                zero++;
            }
        }
        
        System.out.println("отрицательных элементов\t" + negative);
        System.out.println("положительных элементов\t" + positive);
        System.out.println("нулевых элементов\t" + zero);
    }    
}
