package algorithmization.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ������� ��������
 * ������ 1 - ���� �������. ������� �� ����� ��� �������� �������, 
 * � ������� ������ ������� ������ ����������.  
 */

public class Task_01 {
    
    public static void main(String[] args) {
        int[][] a;
        int n, m;
        Random rand;
        
        n = 5;
        m = 7;
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
        
        for(int j = 0; j < m; j += 2){
            if(a[0][j] > a[n - 1][j]){
                System.out.println("������� " + (j + 1));
                for(int i = 0; i < a.length; i++){
                    System.out.println(a[i][j]);
                }
            }
        }
    }    
}
