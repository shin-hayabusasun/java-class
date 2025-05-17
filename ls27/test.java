public class test {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        setIntArray(array1, 100);
        int[] array5 = cloneIntArray(array1);
        // 必要に応じてこれまでのソートプログラムをコメントアウトせよ
        System.out.println("Quick Sort");
        QuickSort qs = new QuickSort(array5);
        display(array5);
        qs.quickSort();
        display(array5);
    }
    public static void display(int[] array) {
    for (int element: array) {
    System.out.print(element + " ");
    }
    System.out.println();
    }
    public static void setIntArray(int[] array, int n) {
    for (int i = 0; i < array.length; i++) {
    array[i] = (int)(Math.random() * n);
    }
    }
    public static int[] cloneIntArray(int[] array) {
        int[] clone = new int[array.length];
        int i = 0;
        for (int element: array) {
        clone[i++] = element;
        }
        return clone;
        }
        }

    
    