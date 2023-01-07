import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ScannerException {

        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение вида 56 + 56: ");
        String stringForConvert = in.nextLine();

        String [] wordForCalc = stringForConvert.split(" ");

        for (String element: wordForCalc) {
            element.trim();
        }
        int k = 0;
        for (int i = 0; i < wordForCalc.length; i++){
            k = k + 1;
        }
        if (k != 3){
            throw new ScannerException("Выражение введено неверно!");

        }
        int a,b;

     try {
         a = Integer.parseInt(wordForCalc[0]);
         b = Integer.parseInt(wordForCalc[2]);
         String ch = wordForCalc[1];

         if (a > 10 && b > 10) {
             throw new ScannerException("Выражение введено неверно!");
         }

         if (ch.equals("*") || ch.equals("+") || ch.equals("-") || ch.equals("/")) {
             int result;

             switch (ch) {
                 case "+":
                     result = a + b;
                     break;
                 case "-":
                     result = a - b;
                     break;
                 case "*":
                     result = a * b;
                     break;
                 default:
                     result = a / b;
                     break;
             }
             System.out.println(result);

         } else {
             try {
                 throw new IOException();
             } catch (IOException e) {
                 System.out.println("Арифметическое действие введено неверно!");
             }

         }
     }
            catch (IllegalArgumentException e){

         }






    }
}