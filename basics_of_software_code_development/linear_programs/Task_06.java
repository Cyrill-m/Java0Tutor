package basics_of_software_code_development.linear_programs;

import java.util.Scanner;

/**
 *
 * @author Kiryl Matusevich
 * 
 * �������� ���������
 * ������ 6 - ��� ������ ������� ��������� �������� ���������, 
 * ������� �������� true, ���� ����� � ������������ (�, �) ����������� 
 * ����������� �������, � false � � ��������� ������
 */

public class Task_06 {
    
    public static void main(String[] args) {
        
        int coordX;
        int coordY;
        boolean result;
        boolean conditionTop;
        boolean conditionBottom;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("������� ���������� X �����:");
        if (input.hasNextInt()){
            coordX = input.nextInt();            
        } else {
            System.out.println("������ �����! ������������� ���������.");
            input.close();
            return;
        }
        
        System.out.println("������� ���������� Y �����:");
        if (input.hasNextInt()){
            coordY = input.nextInt();
            input.close();
        } else {
            System.out.println("������ �����! ������������� ���������.");
            input.close();
            return;
        }
        
        conditionTop = (Math.abs(coordX) <= 2) && (coordY > 0 && coordY <= 4);
        conditionBottom = (Math.abs(coordX) <= 4) && (coordY >= -3 && coordY <= 0);
        
        result = conditionTop || conditionBottom;
        System.out.println(result);
    }
}
