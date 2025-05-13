import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    @FunctionalInterface
    interface Functional{
        boolean comp(int a, int b);
    }
    public static void insertionSort(int[] SortArr,Functional one){
        for(int i=1; i<SortArr.length;i++){
            int temp =SortArr[i];
            int j;
            for(j=i; j>0 && one.comp(temp, SortArr[j-1]); j--){
                SortArr[j]=SortArr[j-1];
            }
            SortArr[j]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int size = input.nextInt();
        int[] sortir = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            sortir[i] = random.nextInt(100);
        }
        System.out.println("Введите 1 для сортировки по возрастанию, и 2 для сортировки по убыванию");
        int select = input.nextInt();
        if(select ==1){
            insertionSort(sortir,(a,b) -> a < b);
            System.out.println("Результат сортировки по возрастанию "+ Arrays.toString(sortir));
        }
        else if(select ==2){
            insertionSort(sortir,(a,b) -> a > b );
            System.out.println("Результат сортировки по убыванию "+ Arrays.toString(sortir));
        }
        else{
            System.out.println("Такой операции нет");
        }
    }
}
