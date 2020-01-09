package algorithmization.linear_array_sorting;

import java.util.Arrays;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ОДНОМЕРНЫЕ МАССИВЫ. СОРТИРОВКИ
 * Задача 4 - Дана последовательность чисел a1 < a2 < ... < an. 
 * Требуется переставить числа в порядке возрастания. Для этого 
 * сравниваются два соседних числа ai и ai+1. Если ai > ai+1, 
 * то делается перестановка. Так продолжается до тех пор, пока все элементы 
 * не станут расположены в порядке возрастания. Составить алгоритм сортировки, 
 * подсчитывая при этом количества перестановок.
 */

public class Test_04 {
    
    public static void main(String[] args) {
        int[] a;
        
        a = new int[]{21, 12, 12, 11, 9, 9, 7, 3, 1};
        
        System.out.println(Arrays.toString(a));
        
        boolean flag = true;
        int amt = 0;
        while(flag){
            flag = false;
            for(int i = 1; i < a.length; i++){
                if(a[i - 1] > a[i]){
                    int temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                    flag = true;
                    amt++;
                }
            }
        }
        
        System.out.println("количество перестановок " + amt);
        System.out.println(Arrays.toString(a));
    }
}
