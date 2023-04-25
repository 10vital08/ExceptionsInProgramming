package HomeWork_3;

import java.util.Scanner;

public class homework3 {

    // опрос данных пользователя
    public static String pollingData(){
        Scanner iOScanner = new Scanner(System.in);
        String dataString = iOScanner.nextLine();
        iOScanner.close();
        return dataString;
    }

    // разбиение данных на поля
    public static String[] stringSplitting(String dataWords){
        String[] words = dataWords.split(" ");
        return words;
    } 

    public static void main(String[] args) {
        System.out.println("Введите данные о себе через пробел в виде 'Фамилия Имя Отчество датарождения номертелефона пол':");
        String data = pollingData();
        String[] dataPeaples = stringSplitting(data);
        
        System.out.println(data);
        // for(String word : dataPeaples){
        //     System.out.println(word);
        // }
    }
}
