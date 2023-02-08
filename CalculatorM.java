import java.io.IOException;
import java.util.Scanner;
public class CalculatorM {
    public static void main(String[] args) throws ScannerException {
        Scanner enter = new Scanner(System.in);

        String[] massiv2 = new String[] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10","+", "-", "*", "/","1a1"};

        int  i = 0, j=0, k=0, l=0;
        String otvet;

        while (true) {
            System.out.println("Введите выражение:");
            String zapros = enter.nextLine();

            String[] spl = zapros.split(" ");
            i = spl.length;
            if (i != 3) throw new ScannerException("Формат записи не удовлетворяет");

            for(i=0;i<=24;i++)  if (massiv2[i].equals(spl[0])) break;

            if (i==25) throw new ScannerException("Формат записи не удовлетворяет");

            for(j=0;j<=24;j++)  if (massiv2[j].equals(spl[2])) break;

            if (j==25) throw new ScannerException("Формат записи не удовлетворяет");

            if ((i>10)&(j<10)|(i<10)&(j>10)) throw new ScannerException("Разные системы");

            for(i=0;i<=4;i++)  if (massiv2[i+20].equals(spl[1])) break;

            if (i==5) throw new ScannerException("Не математическое выражение");

            otvet = calc(zapros);
            if (otvet.equals("~")) throw new ScannerException("В римской системе нет отрицательных чисел");
            System.out.println(otvet);
        }
    }
    public static String calc (String input) {
        String[] massiv = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C", "+", "-", "*", "/", "1",
                "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};

        int i, j, k = 0, l = 0, a = 0;
        String spl[] = input.split(" ");

        for (i = 0; i < massiv.length; i++)
            if (massiv[i].equals(spl[0])) {
                k = i + 1;
                break;
            }
        for (j = 0; j < massiv.length; j++)
            if (massiv[j].equals(spl[2])) {
                l = j + 1;
                break;
            }

        if (k > 10) {
            k = k - 104; l = l - 104;

             if (spl[1].equals("+")) a = k + l;
             if (spl[1].equals("-")) a = k - l;
             if (spl[1].equals("/")) a = k / l;
             if (spl[1].equals("*")) a = k * l;
           return (String.valueOf(a));
        }
         else {
             if (spl[1].equals("+")) a = k + l;
             if (spl[1].equals("-")) a = k - l;
             if (spl[1].equals("/")) a = k / l;
             if (spl[1].equals("*")) a = k * l;
             if (a < 1) return ("~");
            return (massiv[a - 1]);
        }
    }
}