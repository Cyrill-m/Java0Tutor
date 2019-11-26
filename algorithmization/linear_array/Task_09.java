package algorithmization.linear_array;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ОДНОМЕРНЫЕ МАССИВЫ
 * Задача 9 - В массиве целых чисел с количеством элементов n 
 * найти наиболее часто встречающееся число. 
 * Если таких чисел несколько, то определить наименьшее из них.
 */

public class Task_09 {
    
    public static void main(String[] args){
        int n;
        int[] a;
        int freq; //наиболее часто встречающееся число
        int quan; //количество повторов
        Random rand;
        
        n = 12; 
        a = new int[n];
        rand = new Random();
        freq = 0;
        quan = 0;
        
        //инициализация элементов массива случайными числами
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(5);
        }
        
        System.out.println(Arrays.toString(a));
        
        for(int i = 0; i < a.length; i++){
            int quan_t = 0;
            int freq_t = a[i];
            for(int j = i; j < a.length; j++){
                if(freq_t == a[j]){
                    quan_t++;
                }
            }
            if(quan < quan_t){
                freq = freq_t;
                quan = quan_t;
            }
            if((quan == quan_t) & (freq > freq_t)){
                freq = freq_t;
            }
        }
        
        System.out.println("Наиболее часто встречающееся число - " + freq);
        System.out.println("(количество повторов - " + quan + ")");
    }    
}
