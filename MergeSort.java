package homework5;

public class MergeSort {
    // Задача 4. Сортировка слиянием
    // Напишите программу, которая реализует сортировку слиянием. Программа
    // должна содержать два основных метода: merge для объединения двух
    // отсортированных массивов в один отсортированный, и mergeSort для
    // сортировки массива с использованием сортировки слиянием.

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr1, 0, result, arr1.length, arr2.length);

        return result;
    }

    public static int[] sort(int[] arr) {
        int[] sortedArray = arr.clone();

        for (int i = 0; i < sortedArray.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[j] < sortedArray[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[minIndex];
            sortedArray[minIndex] = temp;
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        int[] array1 = { 38, 27, 43, 3, 9, 82, 10, 1, 3, 2 };
        int[] array2 = { 3, 16, 43, 3, 90, 820, 1 };

        int[] sortedArray1 = sort(array1);
        int[] sortedArray2 = sort(array2);

        int[] mergedArrays = merge(sortedArray1, sortedArray2);
        int[] sortedArray = sort(mergedArrays);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }

    }

}
