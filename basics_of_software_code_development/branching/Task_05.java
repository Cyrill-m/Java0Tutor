package basics_of_software_code_development.branching;

import java.util.Scanner;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ���������
 * ������ 5 - ��������� �������� ������� F(x)= 
 * x^2 - 3x + 9, ���� x <= 3
 * 1/(x^3 + 6), ���� x > 3.
 */

public class Task_05 {
    
    public static void main(String[] args) {
        
        double func;
        double x;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("������� �������� ��������� x:");
        if (input.hasNextDouble()){
            x = input.nextDouble();
            input.close();
        } else {
            System.out.println("������ �����! ������������� ���������.");
            input.close();
            return;
        }
        
        if (x > 3){
            func = 1/(Math.pow(x, 3) + 6);
        } else {
            func = x*x - 3*x + 9;
        }
        
        System.out.printf("�������� ������� F(x)= %.3e\n", func);
    }
    
}
