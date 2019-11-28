package algorithmization.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * МАССИВЫ МАССИВОВ
 * Задача 9 - Задана матрица неотрицательных чисел. 
 * Посчитать сумму элементов в каждом столбце. 
 * Определить, какой столбец содержит максимальную сумму.
 */

public class Task_09 {
    
    public static void main(String[] args) {
        int[][] a;
        int n, m;   //размерность матрицы
        int ind;    //номер столбца с максимальной суммой
        int sum; 
        Random rand;
        
        n = 5;
        m = 7;
        sum = 0;
        ind = 0;
        a = new int[n][m];
        rand = new Random();
        
        //инициализация элементов массива случайными числами
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = rand.nextInt(10);
            }            
        }
        
        //вывод элементов матрицы на экран
        System.out.println("Исходная матрица:");
        for(int[] a1 : a) {
            System.out.println(Arrays.toString(a1));
        }
        System.out.println("- - -");
        
        for(int j = 0; j < m; j++){
            int sum_t = 0;
            for(int i = 0; i < a.length; i++){
                sum_t += a[i][j];
            }
            System.out.print(" " + sum_t);
            if(sum < sum_t){
                sum = sum_t;
                ind = j + 1;
            }
        }
        
        System.out.println();
        System.out.println("номер столбца с максимальной суммой " + ind);
    }
}
