package basics_of_software_code_development.linear_programs;

import java.util.Scanner;

/**
 *
 * @author Kiryl Matusevich
 * 
 * �������� ���������
 * ������ 4 - ���� �������������� ����� R ���� nnn.ddd 
 * (��� �������� ������� � ������� � ����� ������). 
 * �������� ������� ������� � ����� ����� ����� � 
 * ������� ���������� �������� �����. 
 */

public class Task_04 {
    
    public static void main(String[] args) {
        
        double number;        
        double result;        
        int numberNNN;
        int numberDDD;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("������� �������������� ����� ���� nnn,ddd:");
        if (input.hasNextDouble()){
            number = input.nextDouble();
            input.close();
        } else {
            System.out.println("������ �����! ������������� ���������.");
            input.close();
            return;
        }
        
        numberNNN = (int)number;
        if (Math.abs(numberNNN) >= 1000){
            System.out.println("������ �������! ����� ����� ������ 999.");            
            return;
        }
        
        numberDDD = (int)(number * 1000 - numberNNN * 1000);
        result = numberDDD + numberNNN / 1000.0;
        
        //System.out.println("����� �����: " + numberNNN);
        //System.out.println("������� �����: " + numberDDD);
        System.out.printf("����� ���� ddd.nnn: %.3f \n", result);        
    }
}
