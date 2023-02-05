import java.util.Scanner;
public class CalculatorM {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        String[] massiv = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C","+","-", "*","/","1",
                "2","3","4", "5","6","7","8","9","10","11"};

        int a = 555, b, c, d, i=0, j, first, second,p;
        double ans=0;

        while (a == 555) {
            System.out.println("Введите выражение:");
            String zapros = enter.nextLine();
            String[] spl = zapros.split(" ");

            try {  if (spl[3].hashCode() > 0) {a=1; System.out.println("Формат записи не удовлетворяет условиям задачи");}}
            catch (ArrayIndexOutOfBoundsException v) {
                try {

                    if ((spl[2].hashCode() >48)&(spl[0].hashCode()>48)&(spl[1].hashCode()<48)&(spl[1].hashCode()>41)) {

                        for (j = 0; j < 115; j++) {
                            i = j + 1;
                            if (massiv[j].equals(spl[0])) j = 116;
                        }

                        first = i;
                        if ((first > 10) & (first < 100)) {
                            System.out.println("Принимаются числа от I до X");
                            a = 1;
                        }
                        if ((first > 114)&(a==555)) {
                            System.out.println("Принимаются числа от 1 до 10");
                            a = 1;
                        }
                        for (j = 0; j < 115; j++) {
                            i = j + 1;
                            if (massiv[j].equals(spl[2])) j = 115;
                        }

                        second = i;

                        p = first + second;

                        if ((second > 10) & (second < 100) & (a == 555)) {
                            System.out.println("Принимаются числа от I до X");
                            a = 1;
                        }
                        if ((second > 114)&(a==555)) {
                            System.out.println("Принимаются числа от 1 до 10");
                            a = 1;
                        }

                        if ((p > 1) & (p < 21)) {

                            if (massiv[100].equals(spl[1])) ans = first + second;
                            if (massiv[101].equals(spl[1])) ans = first - second;
                            if (massiv[103].equals(spl[1])) ans = first / second;
                            if (massiv[102].equals(spl[1])) ans = first * second;

                            i = (int) ans - 1;

                            try {
                                System.out.println(massiv[i]);
                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("В римской системе нет отрицательных чисел");
                            }

                        } else {
                            if ((first < 115) & (second < 115) & (a == 555)) {

                                first = first - 104;
                                second = second - 104;
                                if (massiv[100].equals(spl[1])) ans = first + second;
                                if (massiv[101].equals(spl[1])) ans = first - second;
                                if (massiv[103].equals(spl[1])) ans = first / second;
                                if (massiv[102].equals(spl[1])) ans = first * second;

                                i = (int) ans; if (i<-10) {System.out.println("Разные системы"); a=1;}
                                else {
                                    System.out.println(i);}
                            }
                        }
                    }
                    else {System.out.println("Формат не удовлетворяет условиям задачи"); a=1;}
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Формат не удовлетворяет условиям задачи");
                    a = 2;
                }
            }
        }
        enter.close ();
    }
}