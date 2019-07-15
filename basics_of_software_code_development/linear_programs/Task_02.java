package basics_of_software_code_development.linear_programs;

import java.util.Scanner;

/**
 *
 * @author Kiryl Matusevich
 * 
 * �������� ���������
 * ������ 2 - ��������� �������� ��������� �� ������� 
 * (��� ���������� ��������� �������������� ��������):
 * (b + SQRT(b^2 + 4ac))/2a - a^3 * c + b^-2
 * 
 */

public class Task_02 {
    
    public static void main(String[] args) {
        
        double a;
        double b;
        double c;
        double result;
        double resultSqrt;  //��������� ��� ���������� ����������� �����
        double resultZnam;  //��������� ����������� �����
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("������� �������� a:");
        if (input.hasNextDouble()){
            a = input.nextDouble();
        } else {
            System.out.println("������ �����! ������������� ���������.");
            input.close();
            return;
        }
                        
        System.out.println("������� �������� b:");
        if (input.hasNextDouble()){
            b = input.nextDouble();
        } else {
            System.out.println("������ �����! ������������� ���������.");
            input.close();
            return;
        }
        
        System.out.println("������� �������� c:");
        if (input.hasNextDouble()){
            c = input.nextDouble();
        } else {
            System.out.println("������ �����! ������������� ���������.");
            input.close();
            return;
        }
        
        resultSqrt = b * b + 4 * a * c;
        if (resultSqrt < 0){
            System.out.println("������: ������ �� �������������� �����. ������������� ���������.");
            input.close();
            return;
        }
        
        resultZnam = 2 * a;
        if (resultZnam == 0){
            System.out.println("������: ������� �� ����. ������������� ���������.");
            input.close();
            return;
        }
        
        result = (b + Math.sqrt(resultSqrt)) / resultZnam - Math.pow(a, 3) * c + Math.pow(b, -2) ;
        System.out.printf("�������� ������� = %.3f \n", result);
        input.close();
    }    
}
