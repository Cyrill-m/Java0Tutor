package basics_of_software_code_development.cycles;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ЦИКЛЫ
 * Задача 5 - Даны числовой ряд и некоторое число е. 
 * Найти сумму тех членов ряда, модуль которых больше или равен 
 * заданному е. Общий член ряда имеет вид: An = 1/2^n + 1/3^n.
 */

public class Task_05 {
        
    public static void main(String[] args) {
        
        int n;
        double e;
        double sum;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Введите число членов ряда (n > 0):");
        if (input.hasNextInt()){
            n = input.nextInt(); 
            if (n <= 0){
                System.out.println("Число членов ряда должно быть больше нуля! Перезапустите программу.");
                input.close();
                return;
            }
        } else {
            System.out.println("Ошибка ввода! Перезапустите программу.");
            input.close();
            return;
        }
        
        System.out.println("Введите контрольное число е:");
        if (input.hasNextDouble()){
            e = input.nextDouble();
            input.close();
        } else {
            System.out.println("Ошибка ввода! Перезапустите программу.");
            input.close();
            return;
        }
        
        sum = 0;
        for (int i = 0; i <= n; i++) {
            double an;
            an = 1/Math.pow(2, i) + 1/Math.pow(3, i);
            if (Math.abs(an) >= e){
                sum = sum + an;
            }
        }
        
        System.out.printf("сумма членов ряда, модуль которых больше или равен е : %.4f\n", sum);
    }    
}
