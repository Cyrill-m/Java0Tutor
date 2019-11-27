package algorithmization.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ������� ��������
 * ������ 2 - ���� ���������� �������. ������� �� ����� ��������, 
 * ������� �� ���������. 
 */

public class Task_02 {
    
    public static void main(String[] args) {
        int[][] a;
        int n;
        Random rand;
        
        n = 5;        
        a = new int[n][n];
        rand = new Random();
        
        //������������� ��������� ������� ���������� �������
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = rand.nextInt(10);
            }            
        }
        
        //����� ��������� ������� �� �����
        for(int[] a1 : a) {
            System.out.println(Arrays.toString(a1));
        }
        
        System.out.println("������ ���������: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i][i] + " ");
        }
        
        System.out.println("\n������ ���������: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i][n - 1 - i] + " ");
        }
        System.out.println();
    }
}
