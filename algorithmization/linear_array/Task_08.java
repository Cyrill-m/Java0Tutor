package algorithmization.linear_array;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ���������� �������
 * ������ 8 - ���� ������������������ ����� ����� �1 ,�2 ,..., �n. 
 * ���������� ����� ������������������, �������� �� �������� �� �����, 
 * ������� ����� min(�1 ,�2 ,..., �n).
 */

public class Task_08 {
    
    public static void main(String[] args) {
        int n;
        int[] a, b;
        int min;        
        Random rand;
        
        n = 12; 
        a = new int[n];
        rand = new Random();
        
        //������������� ��������� ������� ���������� �������
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(5);
        }
        
        System.out.println(Arrays.toString(a));
        
        //���������� ����������� ���� ������� a
        min = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        
        //���������� ���������� �������� ����� min
        int k = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == min){
                k++;
            }
        }
        
        //��������� ����� ������ b ��� min
        b = new int[a.length - k];
        int j = 0;
        for(int i = 0; i < b.length; i++){
            while(a[j] == min){
                j++;
            }
            b[i] = a[j];
            j++;
        }
        
        System.out.println(Arrays.toString(b));
    }    
}
