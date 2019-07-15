package basics_of_software_code_development.linear_programs;

import java.util.Scanner;

/**
 *
 * @author Kiryl Matusevich
 * 
 * �������� ���������
 * ������ 3 - ��������� �������� ��������� �� ������� 
 * (��� ���������� ��������� �������������� ��������):
 * (sin x + cos y)/(cos x - sin y) * tg xy
 * 
 */

public class Task_03 {
    
    public static void main(String[] args) {
        
        double x;
        double y;
        double result;        
        double resultZnam;  //��������� ����������� �����
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("������� �������� x:");
        if (input.hasNextDouble()){
            x = input.nextDouble();
        } else {
            System.out.println("������ �����! ������������� ���������.");
            input.close();
            return;
        }
                        
        System.out.println("������� �������� y:");
        if (input.hasNextDouble()){
            y = input.nextDouble();
        } else {
            System.out.println("������ �����! ������������� ���������.");
            input.close();
            return;
        }
        
        resultZnam = Math.cos(x) - Math.sin(y);
        if (resultZnam == 0){
            System.out.println("������: ������� �� ����. ������������� ���������.");
            input.close();
            return;
        }
        
        result = (Math.sin(x) + Math.cos(y))/resultZnam * Math.tan(x * y);
        System.out.printf("�������� ������� = %.3e \n", result);
        input.close();
    }    
}
