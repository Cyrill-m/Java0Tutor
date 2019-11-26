package algorithmization.linear_array;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ОДНОМЕРНЫЕ МАССИВЫ
 * Задача 6 - Задана последовательность N вещественных чисел. 
 * Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */

public class Task_06 {
    
    public static void main(String[] args) {
        int n;
        double[] a;
        double sum;        
        Random rand;
        
        n = 12; 
        a = new double[n];
        rand = new Random();
        
        //инициализация элементов массива случайными числами
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextDouble()* 10;
        }
        
        System.out.println(Arrays.toString(a));
        
        sum = 0;
        if(n > 1){
            for(int i = 1; i < a.length; i++){
                int nomer = i + 1;
                boolean flag = true;
                for(int j = 2; j < nomer; j++){
                    if(nomer%j == 0){
                        flag = false; 
                        break;
                    }
                }
                if(flag){
                    System.out.println("Порядковый номер " + nomer + "\tзначение " + a[i]);
                    sum = sum + a[i];
                }
            }
        }
        System.out.println("Сумма значений " + sum);
    }    
}
