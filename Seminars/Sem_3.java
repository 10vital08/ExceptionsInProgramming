/**
 * Sem_3
 */


// 1
//  Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1. 
// Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. Подумайте, 
// что должно происходить при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс. 
// При попытке вызвать add() у закрытого ресурса, должен выброситься IOException


// 2
// Создайте класс исключения, который будет выбрасываться при делении на 0. 
// Исключение должно отображать понятное для пользователя сообщение об ошибке.
// Создайте класс исключений, которое будет возникать при обращении к пустому элементу
//  в массиве ссылочного типа. Исключение должно отображать понятное для пользователя сообщение об ошибке
// Создайте класс исключения, которое будет возникать при попытке открыть
//  несуществующий файл. Исключение должно отображать понятное для пользователя сообщение об ошибке.

public class Sem_3 {
    public static void main(String[] args) {
        try {
            tryRead();
        } catch (ExceptionFileIsNotFound e) {
            System.out.println(e.getMessage());
        }
        Integer[] array = {1,null,3};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                throw new ExceptionNullPointer();
            }
        }
        int a = 10;
        int b = 0;
        if(b == 0){
            throw new ExceptionDivisionByZero("Деление на ноль");
        }
    }
    
    public static void tryRead() throws ExceptionFileIsNotFound {
        FileReader reader;
        try {
            reader = new FileReader("test.txt");
        } catch (IOException e) {
            throw new ExceptionFileIsNotFound();
        }
    }




    public class ExceptionDivisionByZero extends ArithmeticException{
        public ExceptionDivisionByZero(String message) {
            super(message);
        }
    }



    public class ExceptionFileIsNotFound extends FileNotFoundException {
        public ExceptionFileIsNotFound() {
            System.out.println("Файл не найден");
        }
    }

    public class ExceptionNullPointer extends NullPointerException {
        public ExceptionNullPointer() {
            super("Элемент масива - null");
        }
    
        public ExceptionNullPointer(String s) {
            super(s);
        }
    }
}





// ----------------------------------------------------------
// 3
public class MyArrayDataException extends Exception{
    public MyArrayDataException(int x, int y) {
        super("Неправильные данные на следующей позиции: x = " + x + "; y = " + y);
    }
}



public class MyArraySizeException extends Exception{
    public MyArraySizeException() {
        super("Размер массива не 4*4");
    }
}



public static void main(String[] args) {
    String[][] array = {
            {"1","2","null","4"},
            {"2","3","3","5"},
            {"3","4","5","6"},
            {"0","5","6","8"}};
    try {
        checkSizeOfArray(array);
        System.out.printf("%d - сумма всех элементов массива",summaryOfElements(array));
    } catch (MyArraySizeException | MyArrayDataException e) {
        System.out.println(e.getMessage());
    }
}

public static void checkSizeOfArray(String[][] array) throws MyArraySizeException {
    if(array.length == 4 && array[0].length == 4) {
        System.out.println("Размер массива правильный");
    } else {
        throw new MyArraySizeException();
    }
}

public static int summaryOfElements(String[][] array) throws MyArrayDataException{
    int result = 0;
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            try {
                result += Integer.parseInt(array[i][j]);
            } catch (Exception e) {
                throw new MyArrayDataException(i,j);
            }
        }
    }
    return result;
}