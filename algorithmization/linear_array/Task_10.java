package algorithmization.linear_array;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ОДНОМЕРНЫЕ МАССИВЫ
 * Задача 10 - Дан целочисленный массив с количеством элементов п. 
 * Сжать массив, выбросив из него каждый второй элемент 
 * (освободившиеся элементы заполнить нулями). 
 * Примечание. Дополнительный массив не использовать.
 */

public class Task_10 {
    
    public static void main(String[] args){
        int n;
        int[] a;
        Random rand;
        
        n = 12; // n должно быть > 1
        a = new int[n];
        rand = new Random();
        
        //инициализация элементов массива случайными числами
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(20) + 1; //для наглядности без нулей
        }
        
        System.out.println(Arrays.toString(a));
        
        int j = 2;
        for (int i = 1; i < a.length; i++) {
            if(n < 2) break;
            if(j < a.length){
                a[i] = a[j];
                j += 2;
            } else{
                a[i] = 0;
            }
        }
        
        System.out.println(Arrays.toString(a));
    }    
}
