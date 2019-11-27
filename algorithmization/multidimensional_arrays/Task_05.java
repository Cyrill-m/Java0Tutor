package algorithmization.multidimensional_arrays;

import java.util.Arrays;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ������� ��������
 * ������ 5 - ������������ ���������� ������� ������� n 
 * �� ��������� �������(n - ������):
 * |1   1   1   ... 1   1   1|
 * |2   2   2   ... 2   2   0|
 * |3   3   3   ... 3   0   0|
 * |...                      |
 * |n   0   0   ... 0   0   0|
 */

public class Task_05 {
    
    public static void main(String[] args) {
        int[][] a;
        int n;        
        
        n = 8;
        a = new int[n][n];        
        
        for(int i = 0; i < a.length; i ++){
            for(int j = 0; j < a[i].length - i; j++){
                a[i][j] = i + 1;
            }             
        }
        
        //����� ��������� ������� �� �����
        for(int[] a1 : a) {
            System.out.println(Arrays.toString(a1));
        }
    }
}
