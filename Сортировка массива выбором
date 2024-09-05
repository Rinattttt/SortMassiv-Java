import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int[] massiv = new int[20];// Cоздание и объявление массива, состоящего из 20 чисел
                int [] massiv1 = new int[20];//Массив для записи ненулевых значений
                int pos = 0; // Переменная для позиционирования и дальнейшего вывода
                System.out.print("Введите целочисленный массив, состоящий из 20 элементов: ");
                for (int i = 0; i < 20; i++) {
                    massiv[i] = input.nextInt();//Заполнение массива с клавиатуры
                }
                sSort(massiv);//Сортировка заполненного массива по возрастанию
                for (int j = 0; j < 20; j++) {
                    if (massiv[j] != 0) {
                        massiv1[pos] = massiv[j];// Последовательно по позиции ненулевые элементы вставляются в новый массив
                        pos++;
                    }
                }
                System.out.print("Упорядоченный массив: ");
                for (int a = 0; a < pos; a++) {
                    System.out.print(massiv1[a] + " ");// Вывод упорядоченного массива без нулевых элементов
                }
            }
            public static void sSort(int [] massiv){//Метод для сортировки массива ВЫБОРОМ по возрастанию
            for(int i = 0; i < massiv.length; i++){
                int poss = i;
                int min = massiv[i];
                for(int j = i+1; j < massiv.length; j++){
                    if(massiv[j] < min){
                        poss = j;
                        min = massiv[j];
                    }
                }
                massiv[poss] = massiv[i];
                massiv[i] = min;
            }
            }
        }
