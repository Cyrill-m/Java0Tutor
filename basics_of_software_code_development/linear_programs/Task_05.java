package basics_of_software_code_development.linear_programs;

import java.util.Scanner;

/**
 *
 * @author Kiryl Matusevich
 * 
 * �������� ���������
 * ������ 5 - ���� ����������� ����� �, ������� ������������ 
 * ������������ ���������� ������� � ��������. 
 * ������� ������ �������� ������������ � �����, ������� � �������� 
 * � ��������� �����: ��� ����� SSc
 */

public class Task_05 {
    
    public static void main(String[] args) {
        
        int number;        
        int numberHH;        
        int numberMM;
        int numberSS;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("������� ����������� ����� ���������� ������� � ��������:");
        if (input.hasNextInt()){
            number = input.nextInt();
            input.close();
        } else {
            System.out.println("������ �����! ������������� ���������.");
            input.close();
            return;
        }
        
        numberHH = number / 3600;
        number = number % 3600;
        
        numberMM = number / 60;
        
        numberSS = number % 60;
        
        System.out.printf("%02d� %02d��� %02d� \n", numberHH, numberMM, numberSS);
    }
}
