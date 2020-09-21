package SortArrayExercise;

public class SortArray {

    public static void sortingArray(int[] array) {
        int help;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] > array[i]) {
                    help = array[j];
                    array[j] = array[i];
                    array[i] = help;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 50, 2, 44};
        sortingArray(array);
    }
}