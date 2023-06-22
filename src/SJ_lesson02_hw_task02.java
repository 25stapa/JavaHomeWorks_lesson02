/*
Реализуйте алгоритм сортировки пузырьком числового массива,
результат после каждой итерации запишите в лог-файл.
 */

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class SJ_lesson02_hw_task02 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(SJ_lesson02_hw_task02.class.getName());
        FileHandler fh = new FileHandler("SJ_lesson02_hw_task02.log");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sorting array");
        int[] arr = {23, 4, -8, -25, 2, 89, 64, 16, 7, 0, 12, 34, 56, 78, 90,};
        System.out.println(Arrays.toString(arr));
        int[] sorted = listSort(arr);
        System.out.println("Sorted array\n");
        System.out.println(Arrays.toString(arr));
    }

    public static int[] listSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}