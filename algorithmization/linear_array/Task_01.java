package algorithmization.linear_array;

import java.util.Arrays;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ОДНОМЕРНЫЕ МАССИВЫ
 * Задача 1 - В массив A [N] занесены натуральные числа. 
 * Найти сумму тех элементов, которые кратны данному К.
 */

public class Task_01 {
    
    public static void main(String[] args) {
        
        int[] a = {2, 5, 8, 12, 10, 15, 18};
        int k = 3;
        int sum = 0;
        
        System.out.println(Arrays.toString(a));
        
        for (int i = 0; i < a.length; i++){
            int kratn;
            kratn = a[i] % k;
            if (kratn == 0){
                sum = sum + a[i];
                System.out.println("a[" + i + "]=" + a[i] + "\tкратно k=" + k);
            }
        }
        
        System.out.println("Сумма элементов = " + sum);
    }
}
