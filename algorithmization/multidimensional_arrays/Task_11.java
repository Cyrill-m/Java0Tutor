package algorithmization.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * МАССИВЫ МАССИВОВ
 * Задача 11 - Матрицу 10x20 заполнить случайными числами от 0 до 15. 
 * Вывести на экран саму матрицу и номера строк, в которых число 5 
 * встречается три и более раз.
 */

public class Task_11 {
    
    public static void main(String[] args) {
        int[][] a;
        int n, m;   //размерность матрицы        
        Random rand;
        
        n = 10;
        m = 20;        
        a = new int[n][m];
        rand = new Random();
        
        //инициализация элементов массива случайными числами
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = rand.nextInt(15);
            }            
        }
        
        //вывод элементов матрицы на экран
        System.out.println("Исходная матрица:");
        for(int[] a1 : a) {
            System.out.println(Arrays.toString(a1));
        }
        
        for(int i = 0; i < a.length; i++){
            int count5 = 0;
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] == 5){
                    count5++;
                }
            }
            if(count5 > 2){
                System.out.println("строка N: " + (i + 1));
            }
        }
    }
}
