package basics_of_software_code_development.cycles;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ЦИКЛЫ
 * Задача 6 - Вывести на экран соответствий между символами и их 
 * численными обозначениями в памяти компьютера.
 */

public class Task_06 {
    
    public static void main(String[] args) {
        
        final int CHAR_ANSII = 127;
        final int CHAR_ISO = 255;
        final int CHAR_UNICODE = 65536;
        
        for (int i = 0; i <= CHAR_ANSII; i++) {
            System.out.println("Символ: " + (char)i + "\tКод: " + i);
        }
    }
}
