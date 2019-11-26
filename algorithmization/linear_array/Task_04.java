package algorithmization.linear_array;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ���������� �������
 * ������ 4 - ���� �������������� ����� �1, �2,..., �n. 
 * �������� ������� ���������� � ���������� ��������. 
 */

public class Task_04 {
    
    public static void main(String[] args) {
        int n;
        double[] a;            
        Random rand;
        
        n = 10; 
        a = new double[n];
        rand = new Random();
        
        //������������� ��������� ������� ���������� �������
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextDouble()* 10;
        }
        
        System.out.println(Arrays.toString(a));
        
        double min = a[0];
        double max = a[0];
        
        for(int i = 0; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        }
        
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        
        for(int i = 0; i < a.length; i++){
            if(a[i] == max){
                a[i] = min;
                continue;
            }
            if(a[i] == min){
                a[i] = max;
            }
        }
        
        System.out.println(Arrays.toString(a));
    }    
}
