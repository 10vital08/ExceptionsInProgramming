import java.util.ArrayList;

/*
public class Sem_1 {

    static int arrayLength(int[] array){
        if(array.length<2)
            return -1;
        return array.length;
    }

    public static void main(String[] args) {
        int[] array = {1};
        int length = arrayLength(array);
        if(length<0)
            System.out.println("Length of array less than minumum");
        else
            System.out.println("Length of array: " + length);
        
    }
}
*/

// 2 задача
/*
public static int findElement(int[] array, int value) {
    if (array == null) {
        return -3;
    }
    if (array.length < MINSIZE) {
        return -1;
    }
    for (int i = 0; i < array.length; i++) {
        if (array[i] == value) {
            return i;
        }
    }
    return -2;
}

public static void userInterface(int answer) {
    switch (answer) {
        case -1 -> System.out.println("Длинна массива меньше " + MINSIZE);
        case -2 -> System.out.println("Искомый элемент не найден");
        case -3 -> System.out.println("Массива не существует");
        default -> System.out.println("Индекс искомого элемента равен " + answer);
    }
}
*/


// Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив. 
// Метод должен пройтись по каждому элементу и проверить что он не равен null. 
// А теперь реализуйте следующую логику:
// Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
// Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

public class Sem_1 {
    public static void main(String[] args) {        
        Integer[] arr = { 2, null, null };
        //int[] arr2 = new int[5];
        checkArray(arr);
    }

    public static void checkArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("По индексу " + i + " элемент null");
            }
        }
    }
}