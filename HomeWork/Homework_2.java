package HomeWork;

import java.io.IOException;
import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

public class Homework_2 {

    // 1
    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
    // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
    // вместо этого, необходимо повторно запросить у пользователя ввод данных.
    /*
    public static float floatWrite(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число");

        try{
            float number = Float.parseFloat(scanner.nextLine());
            return number;
        }
        catch (NumberFormatException e){
            return -1;
        }
    }

    public static void main(String[] args) {
        float result = floatWrite();
        if (result == -1){
            System.out.println("Введите корректно дробное число");
        }
        else{
            System.out.println(result);
        }
        
    }
    */



    
    // Задание 2 - поправить код
    /*
    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
     } catch (ArithmeticException e) {  // или ClassCastException, потому что double на int делим?
        System.out.println("Catching exception: " + e);
     }
     */




     // Задание 3 - поправить код
     /* 
     public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
     }
     public static void printSum(Integer a, Integer b) throws IllegalArgumentException {
        System.out.println(a + b);
     }
     */




    // 4
    // Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

     public static void white(){
        String word = new String();
        System.out.println("Введите строку: ");
        Scanner iOScanner = new Scanner(System.in);
            word = iOScanner.nextLine();
        if (word.isEmpty()){
            throw new IllegalArgumentException("Строку нельзя оставлять пустой");
        }
     } 

    public static void main(String[] args) {
        white();
    }


}
