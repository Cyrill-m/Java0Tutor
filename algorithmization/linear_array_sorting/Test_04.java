package algorithmization.linear_array_sorting;

import java.util.Arrays;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ���������� �������. ����������
 * ������ 4 - ���� ������������������ ����� a1 < a2 < ... < an. 
 * ��������� ����������� ����� � ������� �����������. ��� ����� 
 * ������������ ��� �������� ����� ai � ai+1. ���� ai > ai+1, 
 * �� �������� ������������. ��� ������������ �� ��� ���, ���� ��� �������� 
 * �� ������ ����������� � ������� �����������. ��������� �������� ����������, 
 * ����������� ��� ���� ���������� ������������.
 */

public class Test_04 {
    
    public static void main(String[] args) {
        int[] a;
        
        a = new int[]{21, 12, 12, 11, 9, 9, 7, 3, 1};
        
        System.out.println(Arrays.toString(a));
        
        boolean flag = true;
        int amt = 0;
        while(flag){
            flag = false;
            for(int i = 1; i < a.length; i++){
                if(a[i - 1] > a[i]){
                    int temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                    flag = true;
                    amt++;
                }
            }
        }
        
        System.out.println("���������� ������������ " + amt);
        System.out.println(Arrays.toString(a));
    }
}
