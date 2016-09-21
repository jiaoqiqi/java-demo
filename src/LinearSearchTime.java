public class LinearSearchTime {

    public static void main(String[] args) {
        int key = (int)(Math.random() * 100);
        int[] myList = new int[1000];
        for (int i = 0; i < 1000; i++) {
            myList[i] = (int)(Math.random() * 100);
        }

        LinearSearchTime linear = new LinearSearchTime();
        long startTime1 = System.nanoTime();
        linear.LinearSearch(myList, key);
        long endTime1 = System.nanoTime();
        long executionTime = endTime1 - startTime1;
        System.out.println(executionTime);


        long startTime2 = System.nanoTime();
        java.util.Arrays.sort(myList);

        linear.binarySearch(myList,key);

        long endTime2 = System.nanoTime();
        long executionTime2 = endTime2 - startTime2;
        System.out.println(executionTime2);

    }

    public double LinearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }

    public double binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high / 2);
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -low - 1;
    }
}


