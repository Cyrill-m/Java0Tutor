package algorithmization.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * МАССИВЫ МАССИВОВ
 * Задача 10 - Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task_10 {
    
    public static void main(String[] args) {
        int[][] a;
        int n;   //размерность матрицы        
        Random rand;
        
        n = 5;        
        a = new int[n][n];
        rand = new Random();
        
        //инициализация элементов массива случайными числами
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = (int)(rand.nextGaussian() * 10);
            }            
        }
        
        //вывод элементов матрицы на экран
        System.out.println("Исходная матрица:");
        for(int[] a1 : a) {
            System.out.println(Arrays.toString(a1));
        }
        
        System.out.println("Положительные элементы главной диагонали:");
        for(int i = 0; i < a.length; i++){            
            if(a[i][i] >= 0){
                System.out.print(a[i][i] + "  ");
            }                        
        }
        System.out.println();
    }
}
