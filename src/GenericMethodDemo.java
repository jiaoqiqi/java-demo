public class GenericMethodDemo  {
    public static <T  extends Comparable<T>> void insertionSort(T[] list) {
        for (int i = 1; i < list.length; i++) {
            T currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k].compareTo(currentElement)>0 ; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }
}

