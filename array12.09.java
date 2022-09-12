import java.util.Random;
public class Main {
    public static void main(String[] args) {
        /*
--------Кучмель Павел--------------------------------------------------------------------------------
--------Использовал массив с разной длинной строк, что бы было интереснее----------------------------
         */
        int[][] array = createArray();
        fillArray(array);
        showArray(array);
        //Matrix20. Дана матрица размера M × N. Для каждого столбца матрицы найти
        //произведение его элементов
        matrixTwenty(array);
        //Matrix21. Дана матрица размера M × N. Для каждой строки матрицы с нечетным номером (1, 3, . . .)
        //найти среднее арифметическое ее элементов. Условный оператор не использовать.
        matrixTwentyOne(array);
    }
    static void matrixTwentyOne(int[][] arrayName){
        for (int i = 1; i < arrayName.length; i+=2){
            int sumOfSting = 0;
            for (int j = 0; j < arrayName[i].length; j++){
                sumOfSting+=arrayName[i][j];
            }
            showString(arrayName, i);
            System.out.println("avg: "+Math.round(((double)sumOfSting/arrayName[i].length)*100)/100.0);
            sumOfSting = 0;
        }
    }
    static void matrixTwenty (int[][] arrayName){
        for (int i = 0; i < getMaxLenghtString(arrayName); i++){
            int mult = 1;
            for (int j = 0; j < arrayName.length; j++){
                try {
                    mult *= arrayName[j][i];
                }catch (ArrayIndexOutOfBoundsException ex){continue;}
            }
            System.out.print(mult+" ");
            mult = 1;
        }
    }
    static void showString (int[][] arrayName, int indexString){
        for (int i = 0; i < arrayName[indexString].length; i++){
            System.out.print(arrayName[indexString][i]+" ");
        }
    }
    static int getMaxLenghtString (int[][] arrayName){
        int longString = 0;
        for (int i = 0; i < arrayName.length; i++){
            if (longString < arrayName[i].length) longString = arrayName[i].length;
        }
        return longString;
    }
    static int[][] createArray (){
        Random rdm = new Random();
        int[][] array = new int[rdm.nextInt(5)+5][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[rdm.nextInt(5)+5];
        }
        return array;
    }
    static void fillArray (int[][] arrayName){
        Random rdm = new Random();
        for (int i = 0; i < arrayName.length; i++){
            for (int j = 0; j < arrayName[i].length; j++){
                arrayName[i][j] = rdm.nextInt(9)+1;
            }
        }
    }
    static void showArray (int[][] arrayName){
        for (int i = 0; i < arrayName.length; i++){
            for (int j = 0; j < arrayName[i].length; j++){
                System.out.print(arrayName[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
