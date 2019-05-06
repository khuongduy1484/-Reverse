import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = scanner.nextInt();
        int number;
        int []array = new  int[size];
        for (int i = 0;i<array.length;i++){
            System.out.format("Enter number %d : ",i+1);
            array[i] = scanner.nextInt();
        }
        System.out.print("\nMang sau khi tao xong :");
        for (int x:array) {
            System.out.printf("% d \t",x);
        }
        for (int i =0;i<array.length - 1;i++){
            for (int j = i+1;j< array.length;j++){
                if (array[i] > array[j]){
                    int x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }

            }
        }
        System.out.print("\nMang sau khi sap xep: ");
        for (int y :array) {
            System.out.printf("%d \t" , y);

        }

    }
}
