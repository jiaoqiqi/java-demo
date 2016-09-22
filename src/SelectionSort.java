public class SelectionSort {
    public static void selectionSort(double[] list){
        for(int i=0 ; i<list.length ; i++){
            double currentMax = list[i];
            int currentMaxIndex = i;

            for(int j=i+1 ; j<list.length ; j++){
                if(currentMax < list[j]){
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            if(currentMaxIndex != i){
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
    public static  void main(String []args){
        SelectionSort sort = new SelectionSort();
        double[] list = {1,9,4.5,6.6,6,3.5,9,2,4.8,7.5};
        sort.selectionSort(list);
        for(double n:list){
            System.out.println(n);
        }
    }
}

