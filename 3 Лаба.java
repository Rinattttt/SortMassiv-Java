//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] massiv = new int[20];// Cоздание и объявление массива, состоящего из 20 чисел
        int pos = 0; // Переменная для позиционирования и дальнейшего заполнения массива нулевыми значениями
        System.out.print("Введите целочисленный массив, состоящий из 20 элементов: ");
        for (int i = 0; i < 20; i++)
        {
            massiv[i] = input.nextInt();//Заполнение массива с клавиатуры
        }
        for (int j = 0; j < 20; j++) {
            if (massiv[j] != 0) {
                massiv[pos] = massiv[j];// Последовательно по позиции "сдвигаются" ненулевые элементы в левую часть массива
                pos++;
            }
        }
        for (int k = pos; k < 20; k++) {
            massiv[k] = 0;// Заполнение оставшейся части массива нулями
        }
        System.out.print("Упорядоченный массив: ");
        for (int vivod : massiv) {
            System.out.print(vivod + " ");// Вывод упорядоченного массива
        }
    }
}