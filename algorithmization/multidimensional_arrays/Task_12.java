package algorithmization.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * МАССИВЫ МАССИВОВ
 * Задача 12 - Отсортировать строки матрицы по возрастанию и убыванию 
 * значений элементов.
 */

public class Task_12 {
    
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
        
        //сортировка элементов матрицы по строкам
        for(int i = 0; i < a.length; i++){
            boolean flag = true;
            while(flag){
                flag = false;
                for(int j = 1; j < a[i].length; j++){
                    if((i + 1)%2 == 0){
                        if(a[i][j - 1] < a[i][j]){
                            int temp = a[i][j - 1];
                            a[i][j - 1] = a[i][j];
                            a[i][j] = temp;
                            flag = true;
                        }
                    }else{
                        if(a[i][j - 1] > a[i][j]){
                            int temp = a[i][j - 1];
                            a[i][j - 1] = a[i][j];
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
