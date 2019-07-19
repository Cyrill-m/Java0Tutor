package basics_of_software_code_development.cycles;

import java.util.Scanner;

/**
 *
 * @author Kiryl Matusevich
 * 
 * �����
 * ������ 1 - �������� ���������, ��� ������������ ������ 
 * ����� ����� ������������� �����. � ��������� ��������� 
 * ��� ����� �� 1 �� ���������� ������������� �����. 
 */

public class Task_01 {
    
    public static void main(String[] args) {
        
        int number;        
        long summa;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("������� ����� ������������� �����:");
        if (input.hasNextInt()){
            number = input.nextInt();
            input.close();
        } else {
            System.out.println("������ �����! ������������� ���������.");
            input.close();
            return;
        }
        
        summa = 0;
        if (number > 0){            
            for (int i = 0; i <= number; i++) {
                summa = summa + i;
            }
        }
        
        System.out.println("����� �����: " + summa);
    }    
}
