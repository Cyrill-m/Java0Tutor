package algorithmization.multidimensional_arrays;

import java.util.Arrays;

/**
 *
 * @author Kiryl Matusevich
 * 
 * МАССИВЫ МАССИВОВ
 * Задача 16 - Магическим квадратом порядка n называется квадратная матрица 
 * размера nxn, составленная из чисел 1, 2, 3,..., n^2 так, что суммы 
 * по каждому столбцу, каждой строке и каждой из двух больших диагоналей 
 * равны между собой. Построить такой квадрат. 
 * Пример магического квадрата порядка 3:
 * |6   1   8|
 * |7   5   3|
 * |2   9   4|
 */

public class Task_16 {
    
    public static void main(String[] args) {
        int[][] a;
        int n;        
        
        n = 7; // 
        a = new int[n][n];        
        
        for(int i = 0; i < a.length; i ++){
            for(int j = 0; j < a[i].length; j++){
                int it = i + 1;
                int jt = j + 1;                
                a[i][j] = 1 + ((it+jt-1+(n-1)/2)%n)*n + ((it+2*jt+2)%n);                
            }             
        }
        
        //вывод элементов матрицы на экран
        for(int[] a1 : a) {
            System.out.println(Arrays.toString(a1));
        }
    }
}
