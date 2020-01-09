package algorithmization.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * МАССИВЫ МАССИВОВ
 * Задача 14 - Сформировать случайную матрицу m x n, 
 * состоящую из нулей и единиц, причем в каждом столбце число единиц 
 * равно номеру столбца.
 */

public class Task_14 {
    
    public static void main(String[] args) {
        int[][] a;
        int m, n; //размерность матрицы
        Random rand;
        
        rand = new Random();
        m = 9; //число строк
        n = 7; //число столбцов
        //m = n + rand.nextInt(4);
        a = new int[m][n];
        
        for(int j = 0; j < n; j++){            
            int i = 0;
            while(i < (j + 1)){
                int ind = rand.nextInt(m);
                if(a[ind][j] == 0){
                    a[ind][j] = 1;
                    i++;
                }
            }
        }
        
        for(int[] a1: a){
            System.out.println(Arrays.toString(a1));
        }
    }
}
