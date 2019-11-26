package algorithmization.linear_array;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ���������� �������
 * ������ 9 - � ������� ����� ����� � ����������� ��������� n 
 * ����� �������� ����� ������������� �����. 
 * ���� ����� ����� ���������, �� ���������� ���������� �� ���.
 */

public class Task_09 {
    
    public static void main(String[] args){
        int n;
        int[] a;
        int freq; //�������� ����� ������������� �����
        int quan; //���������� ��������
        Random rand;
        
        n = 12; 
        a = new int[n];
        rand = new Random();
        freq = 0;
        quan = 0;
        
        //������������� ��������� ������� ���������� �������
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(5);
        }
        
        System.out.println(Arrays.toString(a));
        
        for(int i = 0; i < a.length; i++){
            int quan_t = 0;
            int freq_t = a[i];
            for(int j = i; j < a.length; j++){
                if(freq_t == a[j]){
                    quan_t++;
                }
            }
            if(quan < quan_t){
                freq = freq_t;
                quan = quan_t;
            }
            if((quan == quan_t) & (freq > freq_t)){
                freq = freq_t;
            }
        }
        
        System.out.println("�������� ����� ������������� ����� - " + freq);
        System.out.println("(���������� �������� - " + quan + ")");
    }    
}
