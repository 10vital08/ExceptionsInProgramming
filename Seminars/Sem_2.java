// Запишите в файл следующие строки:
// Анна=4
// Елена=5
// Марина=6
// Владимир=?
// Константин=?
// Иван=4
// Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив 
// (либо HashMap, если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных,
//  если сохранено значение ?, заменить его на соответствующее число.Если на каком-то месте встречается символ,
//   отличный от числа или ?, бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.

public class Sem_2 {
    public static void main(String[] args) {
        System.out.println("Hi");
    }
    
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < 5; j++) {
            int val = Integer.parseInt(arr[i][j]);
            sum += val;
          }
        }
      return sum;
      }
}

