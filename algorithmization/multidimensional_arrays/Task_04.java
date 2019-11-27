package algorithmization.multidimensional_arrays;

import java.util.Arrays;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ������� ��������
 * ������ 4 - ������������ ���������� ������� ������� n 
 * �� ��������� �������(n - ������):
 * |1   2   3   ... n|
 * |n   n-1 n-2 ... 1|
 * |1   2   3   ... n|
 * |...              |
 * |n   n-1 n-2 ... 1|
 */

public class Task_04 {
    
    public static void main(String[] args) {
        int[][] a;
        int n;        
        
        n = 8; // n - ������!!
        a = new int[n][n];        
        
        for(int i = 0; i < a.length; i += 2){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = j + 1;
            } 
            for(int j = 0; j < a[i].length; j++){
                a[i + 1][j] = a[i].length - j;
            }
        }
        
        //����� ��������� ������� �� �����
        for(int[] a1 : a) {
            System.out.println(Arrays.toString(a1));
        }
    }
}
