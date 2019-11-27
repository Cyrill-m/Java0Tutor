package algorithmization.multidimensional_arrays;

import java.util.Arrays;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ������� ��������
 * ������ 7 - ������������ ���������� ������� ������� N �� �������:
 * A[I,J] = sin((I^2 - J^2)/N)
 * � ���������� ���������� ������������� ��������� � ���.
 */

public class Task_07 {
    
    public static void main(String[] args) {
        double[][] a;
        int n;
        int positive;
        
        n = 4;
        a = new double[n][n];
        positive = 0;
        
        for(int i = 0; i < a.length; i ++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = Math.sin((Math.pow((i + 1), 2) + Math.pow((j + 1), 2))/ n);  
                if(a[i][j] > 0){
                    positive++;
                }
            }             
        }
        
        //����� ��������� ������� �� �����
        for(double[] a1 : a) {
            System.out.println(Arrays.toString(a1));
        }
        System.out.println("���������� ������������� ��������� " + positive);
    }
}
