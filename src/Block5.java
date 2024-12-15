import java.util.Arrays;

public class Block5 {

    /*
    5.1 Поиск первого значения. Дана следующая сигнатура метода:
    public static int findFirst(int[] arr, int x);
    Необходимо реализовать метод таким образом, чтобы он возвращал индекс первого вхождения числа x в массив arr. Если число не входит в массив – возвращается -1.
*/
    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) return i;
        }
        return -1;
    }

    /*  5.2 Поиск последнего значения. Дана следующая сигнатура метода:
      public static int findLast(int[] arr, int x);
      Необходимо реализовать метод таким образом, чтобы он возвращал индекс последнего вхождения числа x в массив arr. Если число не входит в массив – возвращается -1.
  */
    public static int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (x == arr[i]) return i;
        }
        return -1;
    }

    /* 5.3 Поиск максимального. Дана следующая сигнатура метода:
       public static int maxAbs(int[] arr);
       Необходимо реализовать метод таким образом, чтобы он возвращал наибольшее по модулю (то есть без учета знака) значение массива arr.
   */
    public static int maxAbs(int[] arr) {
        int maxValue = 0;
        for (int x : arr) {
            if (Math.abs(x) > Math.abs(maxValue)) maxValue = x;
        }
        return maxValue;
    }

    /*   5.4 Подсчет позитива. Дана следующая сигнатура метода:
       public static int countPositive(int[] arr);
       Необходимо реализовать метод таким образом, чтобы он возвращал количество положительных элементов массива arr.
   */
    public static int countPositive(int[] arr) {
        int counter = 0;
        for (int x : arr) {
            if (x > 0) counter++;
        }
        return counter;
    }

    /* 5.5 Палиндром. Дана следующая сигнатура метода:
     public static boolean palindrom(int[] arr);
     Необходимо реализовать метод таким образом, чтобы он возвращал true, если массив arr является палиндромом, то есть справа-налево и наоборот читается одинаково
 */
    public static boolean palindrom(int[] arr) {
        for (int i = 0, j = arr.length - 1; i <= arr.length / 2; i++, j--) {
            if (arr[i] != arr[j]) return false;
        }
        return true;
    }

    /*  5.6 Реверс. Дана следующая сигнатура метода:
       public static void reverse(int[] arr);
       Необходимо реализовать метод таким образом, чтобы он изменял массив arr. После проведенных изменений массив должен быть записан задом-наперед
   */
    public static void reverse(int[] arr) {
        int temp;
        for (int i = 0, j = arr.length - 1; i <= arr.length / 2; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    /*
       5.7 Возвратный реверс. Дана следующая сигнатура метода:
       public static int[] reverseBack(int[] arr);
       Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором значения массива arr записаны задом наперед.
    */

    public static int[] reverseBack(int[] arr) {
        int[] out = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            out[i] = arr[arr.length - 1 - i];
        }
        return out;
    }
    /*
        5.8 Объединение. Дана следующая сигнатура метода:
        public static int[] concat(int[] arr1, int[] arr2);
        Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором сначала идут элементы первого массива (arr1), а затем второго (arr2).
    */
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] out = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            out[i] = arr1[i];
        }
        for (int i = arr1.length, j = 0; i < out.length; i++, j++) {
            out[i] = arr2[j];
        }
        return out;
    }

    /*5.9 Все вхождения. Дана следующая сигнатура метода:
    public static int[] findAll(int[] arr, int x);
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором записаны индексы всех вхождений числа x в массив arr.*/

    public static int[] findAll(int[] arr, int x) {
        int[] entries = new int[arr.length];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                entries[counter] = i;
                counter++;
            }
        }
        return Arrays.copyOfRange(entries, 0, counter);
    }

    /*5.10 Удалить негатив. Дана следующая сигнатура метода:
    public static int[] deleteNegative(int[] arr);
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором записаны все элементы массива arr кроме отрицательных.*/

    public static int[] deleteNegative(int[] arr) {
        int[] tmp = new int[arr.length];
        int newLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                tmp[newLength] = arr[i];
                newLength++;
            }
        }
        int[] outArray = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            outArray[i] = tmp[i];
        }
        return outArray;

    }

    /*5.11 Добавление в массив. Дана следующая сигнатура метода:
    public static int[] add(int[] arr, int x, int pos);
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, который будет содержать все элементы массива arr, однако в позицию pos будет вставлено значение x.*/

    public static int[] add(int[] arr, int x, int pos) {
        int[] out = new int[arr.length + 1];
        for (int i = 0, j = 0; i < out.length; i++, j++) {
            out[i] = arr[j];
            if (i == pos) {
                out[i] = x;
                j--;
            }
        }
        return out;
    }

    /*5.12 Добавление массива в массив. Дана следующая сигнатура метода:
    public static int[] add(int[] arr, int[] ins, int pos);
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, который будет содержать все элементы массива arr, однако в позицию pos будут вставлены значения массива ins.*/

    public static int[] add(int[] arr, int[] ins, int pos) {
        int[] out = new int[arr.length + ins.length];
        for (int i = 0, j = 0; i < out.length; i++, j++) {
            if (i == pos) {
                for (int k = 0; k < ins.length; k++, i++) {
                    out[i] = ins[k];
                }
            }
            out[i] = arr[j];
        }
        return out;
    }




}
