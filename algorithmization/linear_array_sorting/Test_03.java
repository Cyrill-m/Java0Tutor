package algorithmization.linear_array_sorting;

import java.util.Arrays;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ���������� �������. ����������
 * ������ 3 - ���� ������������������ ����� a1 < a2 < ... < an. 
 * ��������� ����������� �������� ���, ����� ��� ���� ����������� �� ��������. 
 * ��� ����� � �������, ������� � �������, ���������� ���������� ������� � 
 * �������� �� ������ �����, � ������ - �� ����� �����������. �����, 
 * ������� �� �������, ��� ��������� �����������. 
 * �������� �������� ���������� �������.
 */

public class Test_03 {
    
    public static void main(String[] args) {
        int[] a;
        
        a = new int[]{1, 2, 2, 4, 5, 9, 11, 11, 17};
        
        System.out.println(Arrays.toString(a));
        
        for(int i = 0; i < a.length; i++){
            int max = a[i];
            int ind = i;
            for(int j = i; j < a.length; j++){
                if (a[j] > max){
                    max = a[j];
                    ind = j;
                }
            }
            a[ind] = a[i];
            a[i] = max;
        }
        
        System.out.println(Arrays.toString(a));
    }
}
