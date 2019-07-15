package basics_of_software_code_development.linear_programs;

import java.util.Scanner;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ЛИНЕЙНЫЕ ПРОГРАММЫ
 * Задача 5 - Дано натуральное число Т, которое представляет 
 * длительность прошедшего времени в секундах. 
 * Вывести данное значение длительности в часах, минутах и секундах 
 * в следующей форме: ННч ММмин SSc
 */

public class Task_05 {
    
    public static void main(String[] args) {
        
        int number;        
        int numberHH;        
        int numberMM;
        int numberSS;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Введите натуральное число прошедшего времени в секундах:");
        if (input.hasNextInt()){
            number = input.nextInt();
            input.close();
        } else {
            System.out.println("Ошибка ввода! Перезапустите программу.");
            input.close();
            return;
        }
        
        numberHH = number / 3600;
        number = number % 3600;
        
        numberMM = number / 60;
        
        numberSS = number % 60;
        
        System.out.printf("%02dч %02dмин %02dс \n", numberHH, numberMM, numberSS);
    }
}
