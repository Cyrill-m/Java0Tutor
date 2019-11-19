package basics_of_software_code_development.cycles;

/**
 *
 * @author Kiryl Matusevich
 * 
 * ÖÈÊËÛ
 * Çàäà÷à 6 - Âûâåñòè íà ýêðàí ñîîòâåòñòâèé ìåæäó ñèìâîëàìè è èõ 
 * ÷èñëåííûìè îáîçíà÷åíèÿìè â ïàìÿòè êîìïüþòåðà.
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
