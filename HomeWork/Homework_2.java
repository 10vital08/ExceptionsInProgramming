package HomeWork;

import java.util.Scanner;

public class Homework_2 {

    // 1
    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
    // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
    // вместо этого, необходимо повторно запросить у пользователя ввод данных.

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
}
