package HomeWork;

// 1 задание: Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

// 2 задание: Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?











// 3 задание: Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов
// в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
public class Homework_1 {

    public static int[] difference(int[] arr_1, int[] arr_2){
        int[] differenceNumber = new int[arr_1.length];

        try{
            for (int i = 0; i < differenceNumber.length; i++) {
                differenceNumber[i] = arr_1[i] - arr_2[i];
                System.out.println("array_1[" + i + "] - array_2[" + i + "] = " + differenceNumber[i]);
            }
             return differenceNumber;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Массивы не равны!");
            return differenceNumber;
        }
    }

    public static void main(String[] args) {
        int[] array_1 = {1, 2, 3, 4, 5};
        int[] array_2 = {0, 0, 2, 3};
        difference(array_1, array_2);
    }
}
