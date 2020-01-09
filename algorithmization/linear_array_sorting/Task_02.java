package algorithmization.linear_array_sorting;

import java.util.Arrays;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ОДНОМЕРНЫЕ МАССИВЫ. СОРТИРОВКИ
 * Задача 2 - Даны две последовательности a1 < a2 < ... < an и b1 < b2 < ... < bn. 
 * Образовать из них новую последовательность чисел так, чтобы она тоже была 
 * неубывающей. Примечание. Дополнительный массив не использовать.
 */

public class Task_02 {
    
    public static void main(String[] args) {
        int[] a, b, ab;
        
        a = new int[]{1, 2, 2, 4, 5, 9};
        b = new int[]{3, 4, 5, 7, 8};
        
        ab = new int[a.length + b.length];
        
        int ai = 0;
        int bi = 0;
        
        for(int i = 0; i < ab.length; i++){
            if(ai >= a.length){
                ab[i] = b[bi];
                bi++;
                continue;
            }
            if(bi >= b.length){
                ab[i] = a[ai];
                ai++;
                continue;
            }
            if(a[ai] < b[bi]){
                ab[i] = a[ai];
                ai++;
            }else{
                ab[i] = b[bi];
                bi++;
            }
        }
        
        /* либо так
        for(int i = 0; i < ab.length; i++){
            if(i < a.length){
                ab[i] = a[i];
            }else{
                ab[i] = b[i - a.length];
            }
        }
        
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 1; i < ab.length; i++){
                if(ab[i - 1] > ab[i]){
                    int temp = ab[i];
                    ab[i] = ab[i - 1];
                    ab[i - 1] = temp;
                    flag = true;
                }
            }
        }
        */
        
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(ab));
    }
}
