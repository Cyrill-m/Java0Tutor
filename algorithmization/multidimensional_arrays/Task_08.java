package algorithmization.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kiryl Matusevich
 * 
 * МАССИВЫ МАССИВОВ
 * Задача 8 - В числовой матрице поменять местами два столбца любых столбца, 
 * т. е. все элементы одного столбца поставить на соответствующие им позиции 
 * другого, а его элементы второго переместить в первый. Номера столбцов 
 * вводит пользователь с клавиатуры. 
 */

public class Task_08 {
    
    public static void main(String[] args) {
        int[][] a;
        int n, m;   //размерность матрицы
        int c1, c2; //номера переставляемых столбцов
        Random rand;
        
        n = 5;
        m = 7;
        c1 = 0;
        c2 = 0;
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
                
        System.out.println("Введите номер первого столбца (от 1 по " + m + "):");
        boolean flag = true;
        while(flag){
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()){
                c1 = input.nextInt();
                if((c1 >= 1) && (c1 <= m)){
                    flag = false;
                    //input.close();
                }else{
                    System.out.println("Ошибка ввода! Повторите ввод:");
                }                
            } else {
                System.out.println("Ошибка ввода! Повторите ввод:");                
            }            
        }
        System.out.println("Номер первого столбца: " + c1);
        
        System.out.println("Введите номер второго столбца (от 1 по " + m + ", но не " + c1 + "):");
        flag = true;
        while(flag){
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()){
                c2 = input.nextInt();
                if((c2 >= 1) && (c2 <= m) && (c2 != c1)){
                    flag = false;
                    input.close();
                }else{
                    System.out.println("Ошибка ввода! Повторите ввод:");
                }                
            } else {
                System.out.println("Ошибка ввода! Повторите ввод:");                
            }            
        }
        System.out.println("Номер второго столбца: " + c2);
        
        //перестановка столбцов массива
        for(int i = 0; i < a.length; i++){
            int temp;
            temp = a[i][c1 - 1];
            a[i][c1 - 1] = a[i][c2 - 1];
            a[i][c2 - 1] = temp;
        }
        
        //вывод элементов матрицы на экран
        System.out.println("Преобразованная матрица:");
        for(int[] a1 : a) {
            System.out.println(Arrays.toString(a1));
        }
    }
}
