import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
--------Кучмель Павел------------------------------------------------------------------------------------
        */
        //Array20. Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N). Найти
        //сумму элементов массива с номерами от K до L включительно.
        /*
        System.out.print("Specify the size of the array: ");
        int n = in.nextInt();
        System.out.print("Enter number K: ");
        int k = in.nextInt();
        System.out.print("Enter number L: ");
        int l = in.nextInt();
        int[] array = new int[n];
        for (int i = 0;i<n;i++){
            array[i]=(int)(Math.random()*10);
        }
        int sum = 0;
        for (;k<=l;k++){
            sum+=array[k];
        }
        System.out.println(sum);
         */
        /*
-------------------------------------------------------------------------------------------------------------
         */
        //Array21. Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N).
        //Найти среднее арифметическое элементов массива с номерами от K до L
        //включительно.
        /*
        System.out.print("Specify the size of the array: ");
        int n = in.nextInt();
        System.out.print("Enter number K: ");
        int k = in.nextInt();
        System.out.print("Enter number L: ");
        int l = in.nextInt();
        int[] array = new int[n];
        for (int i = 0;i<n;i++){
            array[i]=(int)(Math.random()*10);
        }
        int sum = 0;
        for (int i = k;i<=l;i++){
            System.out.println(array[i]);
            sum+=array[i];
        }
        System.out.println(Math.round(((double)sum/(l+1-k))*10)/10.0);
         */
        /*
-----------------------------------------------------------------------------------------------------------
         */
        //Array22. Дан массив размера N и целые числа K и L (1 < K ≤ L ≤ N). Найти
        //сумму всех элементов массива, кроме элементов с номерами от K до L
        //включительно.
        /*
        System.out.print("Specify the size of the array: ");
        int n = in.nextInt();
        System.out.print("Enter number K: ");
        int k = in.nextInt();
        System.out.print("Enter number L: ");
        int l = in.nextInt();
        int[] array = new int[n];
        for (int i = 0;i<n;i++){
            array[i]=(int)(Math.random()*10);
        }
        int sum = 0;
        for (int i = 0;i<n;i++){
            System.out.println(array[i]);
            if (i>=k&&i<=l){
                continue;
            }
            else {
                sum+=array[i];
            }
        }
        System.out.println(sum);
         */
        /*
-------------------------------------------------------------------------------------------------------
         */
        //Array23. Дан массив размера N и целые числа K и L (1 < K ≤ L ≤ N).
        //Найти среднее арифметическое всех элементов массива, кроме элементов
        //с номерами от K до L включительно.
        /*
        System.out.print("Specify the size of the array: ");
        int n = in.nextInt();
        System.out.print("Enter number K: ");
        int k = in.nextInt();
        System.out.print("Enter number L: ");
        int l = in.nextInt();
        int[] array = new int[n];
        for (int i = 0;i<n;i++){
            array[i]=(int)(Math.random()*10);
        }
        int sum = 0;
        int num = 0;
        for (int i = 0;i<n;i++){
            System.out.println(array[i]);
            if (i>=k&&i<=l){
                continue;
            }
            else {
                sum+=array[i];
                num+=1;
            }
        }
        System.out.println((Math.round(((double)sum/num)*10)/10.0));
        */
    }
}
