package algorithmization.linear_array;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ���������� �������
 * ������ 6 - ������ ������������������ N ������������ �����. 
 * ��������� ����� �����, ���������� ������ ������� �������� �������� �������.
 */

public class Task_06 {
    
    public static void main(String[] args) {
        int n;
        double[] a;
        double sum;        
        Random rand;
        
        n = 12; 
        a = new double[n];
        rand = new Random();
        
        //������������� ��������� ������� ���������� �������
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextDouble()* 10;
        }
        
        System.out.println(Arrays.toString(a));
        
        sum = 0;
        if(n > 1){
            for(int i = 1; i < a.length; i++){
                int nomer = i + 1;
                boolean flag = true;
                for(int j = 2; j < nomer; j++){
                    if(nomer%j == 0){
                        flag = false; 
                        break;
                    }
                }
                if(flag){
                    System.out.println("���������� ����� " + nomer + "\t�������� " + a[i]);
                    sum = sum + a[i];
                }
            }
        }
        System.out.println("����� �������� " + sum);
    }    
}
