package basics_of_software_code_development.branching;

import java.util.Random;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ���������
 * ������ 4 - ������ ������� �, � �������������� ��������� � 
 * ������� �, �, z �������. ����������, ������� �� ������ 
 * ����� ���������. 
 */

public class Task_04 {
    
    public static void main(String[] args) {
        
        int a, b;       //������� �������������� ���������
        int x, y, z;    //������� �������
        
        Random rand = new Random();
        final int RANGE = 9;
        
        a = rand.nextInt(RANGE) + 1;
        b = rand.nextInt(RANGE) + 1;
        x = rand.nextInt(RANGE) + 1;
        y = rand.nextInt(RANGE) + 1;
        z = rand.nextInt(RANGE) + 1;
        
        System.out.printf("������� �������������� ���������: %d x %d\n", a, b);
        System.out.printf("������� �������: %d x %d x %d\n", x, y, z);
        
        if (((a >= x || a >= y) && b >= z) ||
            ((a >= x || a >= z) && b >= y) ||
            ((a >= y || a >= z) && b >= x)){
            System.out.println("������ ������� ����� ���������.");
        } else {
            System.out.println("������ �� ������� ����� ���������.");
        }
    }
}
