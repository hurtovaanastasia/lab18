import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static <T> void sortArray(T[] array, Comparator<T> comparator) {
        Arrays.sort(array, comparator);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int size = input.nextInt();
        Integer[] numbers = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100);
        }
        Comparator<Integer> ascendingOrder = (a, b) -> a.compareTo(b);
        Comparator<Integer> descendingOrder = (a, b) -> b.compareTo(a);
        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        sortArray(numbers, ascendingOrder);
        System.out.println("По возрастанию: " + Arrays.toString(numbers));
        sortArray(numbers, descendingOrder);
        System.out.println("По убыванию:    " + Arrays.toString(numbers));
    }
}
