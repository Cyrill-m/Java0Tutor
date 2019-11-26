package algorithmization.linear_array;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ���������� �������
 * ������ 3 - ��� ������ �������������� �����, ����������� �������� N. 
 * ����������, ������� � ��� �������������, ������������� � ������� ���������.
 */

public class Task_03 {
    
    public static void main(String[] args) {
        int n;
        double[] a;
        int positive;
        int negative;
        int zero;
        Random rand;
        
        n = 10; 
        a = new double[n];
        rand = new Random();
        positive = 0;
        negative = 0;
        zero = 0;
        
        //������������� ��������� ������� ���������� �������
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextGaussian() * 10;
        }
        
        System.out.println(Arrays.toString(a));
        
        for(int i = 0; i < a.length; i++){
            if(a[i] > 0){
                positive++;
                continue;
            }
            if(a[i] < 0){
                negative++;
            }else{
                zero++;
            }
        }
        
        System.out.println("������������� ���������\t" + negative);
        System.out.println("������������� ���������\t" + positive);
        System.out.println("������� ���������\t" + zero);
    }    
}
