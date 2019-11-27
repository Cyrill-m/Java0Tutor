package algorithmization.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * МАССИВЫ МАССИВОВ
 * Задача 3 - Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task_03 {
    
    public static void main(String[] args) {
        int[][] a;
        int n, m; //размерность матрицы
        int k, p; //искомая строка и столбец
        Random rand;
        
        n = 5;
        m = 7;
        k = 2;
        p = 4;
        a = new int[n][m];
        rand = new Random();
        
        //инициализация элементов массива случайными числами
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = rand.nextInt(10);
            }            
        }
        
        //вывод элементов матрицы на экран
        for(int[] a1 : a) {
            System.out.println(Arrays.toString(a1));
        }
        
        //вывод k-й строки
        System.out.println("Строка: " + k);
        for(int i = 0; i < a[k - 1].length; i++){
            System.out.print(a[k - 1][i] + " ");
        }
        System.out.println();
        
        //вывод p-ого столбца
        System.out.println("Столбец: " + p);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i][p - 1] + " ");
        }
        System.out.println();
    }
}
