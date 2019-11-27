package algorithmization.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ������� ��������
 * ������ 3 - ���� �������. ������� k-� ������ � p-� ������� �������.
 */

public class Task_03 {
    
    public static void main(String[] args) {
        int[][] a;
        int n, m; //����������� �������
        int k, p; //������� ������ � �������
        Random rand;
        
        n = 5;
        m = 7;
        k = 2;
        p = 4;
        a = new int[n][m];
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
        
        //����� k-� ������
        System.out.println("������: " + k);
        for(int i = 0; i < a[k - 1].length; i++){
            System.out.print(a[k - 1][i] + " ");
        }
        System.out.println();
        
        //����� p-��� �������
        System.out.println("�������: " + p);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i][p - 1] + " ");
        }
        System.out.println();
    }
}
