package algorithmization.multidimensional_arrays;

import java.util.Arrays;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ������� ��������
 * ������ 6 - ������������ ���������� ������� ������� n 
 * �� ��������� �������(n - ������):
 * |1   1   1   ... 1   1   1|
 * |0   1   1   ... 1   1   0|
 * |0   0   1   ... 1   0   0|
 * |...                      |
 * |0   1   1   ... 1   1   0|
 * |1   1   1   ... 1   1   1|
 */

public class Task_06 {
    
    public static void main(String[] args) {
        int[][] a;
        int n;        
        
        n = 8; // n - ������
        a = new int[n][n];        
        
        for(int i = 0; i < a.length; i ++){
            for(int j = 0; j < a[i].length - i * 2; j++){
                a[i][j + i] = 1;
                a[a.length - 1 - i][j + i] = 1;
            }             
        }
        
        //����� ��������� ������� �� �����
        for(int[] a1 : a) {
            System.out.println(Arrays.toString(a1));
        }
    }
}
