package algorithmization.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * МАССИВЫ МАССИВОВ
 * Задача 13 - Отсотрировать стобцы матрицы по возрастанию и убыванию 
 * значений эементов.
 */

public class Task_13 {
    
    public static void main(String[] args) {
        int[][] a;
        int n, m;   //размерность матрицы        
        Random rand;
        
        n = 5;
        m = 7;        
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
        
        //сортировка элементов матрицы по столбцам
        for(int j = 0; j < m; j++){
            boolean flag = true;
            while(flag){
                flag = false;
                for(int i = 1; i < a.length; i++){
                    if((j + 1)%2 == 0){
                        if(a[i - 1][j] < a[i][j]){
                            int temp = a[i - 1][j];
                            a[i - 1][j] = a[i][j];
                            a[i][j] = temp;
                            flag = true;
                        }
                    }else{
                        if(a[i - 1][j] > a[i][j]){
                            int temp = a[i - 1][j];
                            a[i - 1][j] = a[i][j];
                            a[i][j] = temp;
                            flag = true;
                        }
                    }
                } 
            }                       
        }
        
        System.out.println("Отсортированная матрица:");
        for(int[] a1 : a) {
            System.out.println(Arrays.toString(a1));
        }
    }
}
