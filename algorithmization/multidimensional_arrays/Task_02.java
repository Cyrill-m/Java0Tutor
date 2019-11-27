package algorithmization.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * МАССИВЫ МАССИВОВ
 * Задача 2 - Дана квадратная матрица. Вывести на экран элементы, 
 * стоящие на диагонали. 
 */

public class Task_02 {
    
    public static void main(String[] args) {
        int[][] a;
        int n;
        Random rand;
        
        n = 5;        
        a = new int[n][n];
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
        
        System.out.println("Первая диагональ: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i][i] + " ");
        }
        
        System.out.println("\nВторая диагональ: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i][n - 1 - i] + " ");
        }
        System.out.println();
    }
}
