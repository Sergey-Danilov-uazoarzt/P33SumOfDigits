import java.util.Arrays;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите целое число: ");
            int a = sc.nextInt();
            String s = String.valueOf(a);
            System.out.println(s);
            String[] digits = s.split("");
            for (String digit : digits) {
                System.out.print(digit + " ");
            }
            System.out.println();

            int[] results = new int[digits.length];
            for (int i = 0; i < digits.length; i++) {
                results[i] = Integer.parseInt(digits[i]);
            }
            System.out.println(Arrays.toString(results));

            int sum = 0;
            for (int i : results) {
                sum += i;
            }
            System.out.println("Сумма всех цифр числа равна " + sum);
        }
    }
}



//    int[] numbers = {1,2,3,4};
//    int sum = 0;
//for( int i : numbers) {
//        sum += i;
//        }
//
//        System.out.println(sum);


//        char[] sToArray = s.toCharArray(); // Преобразуем строку s в массив символов (char)
//        // Вывод массива на экран
//        for(int i = 0; i < sToArray.length; i++) {
//            System.out.print(sToArray[i] + " "); // Для наглядности вставим пробел между индексами
//        }
//
//    }
//}