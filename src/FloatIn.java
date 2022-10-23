import java.util.Scanner;

public class FloatIn {
    public static void main(String[] args) {
        System.out.println(enterFloat());
    }

    static float enterFloat() {

        Scanner scanner = new Scanner(System.in);
        float fl=0;
        while (true) {
            try {
                fl = Float.parseFloat(scanner.next());
                break;
            } catch (Exception e) {
                System.out.println("enter again");
            }
        }
        return fl;
    }

}

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//вместо этого, необходимо повторно запросить у пользователя ввод данных.