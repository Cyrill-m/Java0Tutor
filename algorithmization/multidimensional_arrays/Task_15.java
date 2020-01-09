package algorithmization.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * МАССИВЫ МАССИВОВ
 * Задача 15 - Найдите наибольший элемент матрицы и заменить 
 * все нечетные элементы на него.
 */

public class Task_15 {
    
    public static void main(String[] args) {
        int[][] a;
        int n, m;
        int max;
        Random rand;
        
        n = 5;
        m = 8;
        a = new int[n][m];
        rand = new Random();
        
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = rand.nextInt(20);
            }
        }
        
        for(int[] a1: a){
            System.out.println(Arrays.toString(a1));
        }
        
        max = a[0][0];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(max < a[i][j]){
                    max = a[i][j];
                }                
            }
        }
        
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] % 2 != 0){
                    a[i][j] = max;
                }                
            }
        }
        
        System.out.println("max = " + max);
        for(int[] a1: a){
            System.out.println(Arrays.toString(a1));
        }
    }
}
