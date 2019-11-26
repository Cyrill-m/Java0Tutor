package algorithmization.linear_array;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ���������� �������
 * ������ 10 - ��� ������������� ������ � ����������� ��������� �. 
 * ����� ������, �������� �� ���� ������ ������ ������� 
 * (�������������� �������� ��������� ������). 
 * ����������. �������������� ������ �� ������������.
 */

public class Task_10 {
    
    public static void main(String[] args){
        int n;
        int[] a;
        Random rand;
        
        n = 12; // n ������ ���� > 1
        a = new int[n];
        rand = new Random();
        
        //������������� ��������� ������� ���������� �������
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(20) + 1; //��� ����������� ��� �����
        }
        
        System.out.println(Arrays.toString(a));
        
        int j = 2;
        for (int i = 1; i < a.length; i++) {
            if(n < 2) break;
            if(j < a.length){
                a[i] = a[j];
                j += 2;
            } else{
                a[i] = 0;
            }
        }
        
        System.out.println(Arrays.toString(a));
    }    
}
