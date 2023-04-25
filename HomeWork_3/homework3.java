package HomeWork_3;

import java.util.Scanner;

public class homework3 {

    public static String pollingData(){
        Scanner iOScanner = new Scanner(System.in);
        String dataString = iOScanner.nextLine();
        iOScanner.close();
        return dataString;
    }

    public static void main(String[] args) {
        System.out.println("Введите данные о себе: ");
        // String data = new String();
        String data = pollingData();
    }
}
