package HomeWork_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class homework3 {

    public static int flag = 1;

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

    // содержит ли ФИО только буквы
    public static String containsNumber(String stringNum){
        if (stringNum.matches("[a-zA-Z]+")){
            return "1";
        }
        else return "0";
    }

    // проверка количества полей и их типов
    public static void conformityCheck(String[] checkArray){
        if (checkArray.length == 5){
            try{
                for (int i = 0; i < 3; i++) {
                    if(containsNumber(checkArray[i]) == "0"){
                        System.out.println("Введите ФИО корректно");
                        flag = 0;
                        break;
                    }
                }
                
                Integer phone = Integer.parseInt(checkArray[3]); // является ли номер числом

                // корректен ли формат пола
                if(checkArray[4].length() == 1){
                    char temp = checkArray[0].charAt(0);
                    if(Character.isDigit(temp)){
                        System.out.println("Введите пол корректно");
                    }
                }
                else System.out.println("Введите пол корректно");
            }
            catch(NumberFormatException e){
                System.out.println("Введите номер телефона корректно");
                flag = 0;
            }
        }
        else{
            System.out.println("Заполните все 5 полей и повторите попытку");
            flag = 0;
        } 
    }

    // Метод проверки существования файла
    public static boolean isFileExists(File file) {
        return file.isFile();
    }

    // запись в новый файл
    public static void WritingToFile(String[] writeString){
        String fio = "";
        // Перевод строки в требуемый вид
        for (int i = 0; i < writeString.length; i++) {
            fio += "<" + writeString[i] + ">";
        }
        // Создание файла, если он не существует
        File file = new File("C:\\Users\\vital\\Desktop\\GB_progr reserved\\" + writeString[0] + ".txt");
        try
        {
            if (!isFileExists(file)){
                boolean created = file.createNewFile();
                if(created){
                    System.out.println("Файл создан");
                }
                // запись в файл
                FileWriter writer = new FileWriter("C:\\Users\\vital\\Desktop\\GB_progr reserved\\" 
                                    + writeString[0] + ".txt", false);
                writer.write(fio);
                writer.flush();
            }
            else{
                // запись в конец файла с новой строки, если такая фамилия уже имеется
                FileWriter writer = new FileWriter("C:\\Users\\vital\\Desktop\\GB_progr reserved\\" 
                                    + writeString[0] + ".txt", true);
                writer.write("\n" + fio);
                writer.flush();
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
            System.out.println("Ошибка записи файла");
        } 
    }
    
    public static void main(String[] args) {
        System.out.println("Введите данные о себе через пробел в виде 'Фамилия Имя Отчество датарождения номертелефона пол':");
        String data = pollingData();
        String[] dataPeaples = stringSplitting(data);
        conformityCheck(dataPeaples);
        if (flag == 1){
            WritingToFile(dataPeaples);
        }
    }
}
