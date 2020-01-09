package algorithmization.linear_array_sorting;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ОДНОМЕРНЫЕ МАССИВЫ. СОРТИРОВКИ
 * Задача 1 - Заданы два одномерных массива с различным количеством элементов и 
 * натуральное число k. Объединить их в один массив, включив второй массив 
 * между k-м и (k+1)- м элементами первого, при этом не используя дополнительный 
 * массив.
 */

public class Task_01 {
    
    public static void main(String[] args) {
        int[] a, b, ab;
        int k;
        Random rand;
        
        a = new int[10];
        b = new int[12];
        ab = new int[a.length + b.length];
        k = 5;
        rand = new Random();
        
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(2);
        }
        
        for(int i = 0; i < b.length; i++){
            b[i] = rand.nextInt(2) + 3;
        }
        
        for(int i = 0; i < ab.length; i++){
            if(i < k){
                ab[i] = a[i];
                continue;
            }
            if((i >= k)&&(i < k + b.length)){
                ab[i] = b[i - k];                
            }else{
                ab[i] = a[i - b.length];
            }
        }
        
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(ab));
    }
}
