package algorithmization.linear_array;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ���������� �������
 * ������ 5 - ���� ����� ����� �1, �2,..., �n. 
 * ������� �� ������ ������ �� �����, ��� ������� �i > i.
 */

public class Task_05 {
    
    public static void main(String[] args){
        int n;
        int[] a;               
        Random rand;
        
        n = 12; 
        a = new int[n];
        rand = new Random();
        
        //������������� ��������� ������� ���������� �������
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(7);
        }
        
        System.out.println(Arrays.toString(a));
        
        for(int i = 0; i < a.length; i++){
            if (a[i] > i + 1){
                System.out.println("������� a[" + (i + 1) + "] = " + a[i]);
            }
        }
    }    
}
