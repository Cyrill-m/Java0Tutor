package algorithmization.linear_array;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ОДНОМЕРНЫЕ МАССИВЫ
 * Задача 8 - Дана последовательность целых чисел а1 ,а2 ,..., аn. 
 * Образовать новую последовательность, выбросив из исходной те члены, 
 * которые равны min(а1 ,а2 ,..., аn).
 */

public class Task_08 {
    
    public static void main(String[] args) {
        int n;
        int[] a, b;
        int min;        
        Random rand;
        
        n = 12; 
        a = new int[n];
        rand = new Random();
        
        //инициализация элементов массива случайными числами
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(5);
        }
        
        System.out.println(Arrays.toString(a));
        
        //определяем минимальный член массива a
        min = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        
        //определяем количество повторов члена min
        int k = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == min){
                k++;
            }
        }
        
        //формируем новый массив b без min
        b = new int[a.length - k];
        int j = 0;
        for(int i = 0; i < b.length; i++){
            while(a[j] == min){
                j++;
            }
            b[i] = a[j];
            j++;
        }
        
        System.out.println(Arrays.toString(b));
    }    
}
