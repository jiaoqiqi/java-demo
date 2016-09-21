public class SelectionSort {
    public static void selectionSort(double[] list){
        for(int i=0 ; i<list.length ; i++){
            double currrentMin = list[i];
            int currentMinIndx = i;

            for(int j=i+1 ; j<list.length ; j++){
                if(currrentMin > list[j]){
                    currrentMin = list[j];
                    currentMinIndx = j;
                }
            }
            if(currentMinIndx != i){
                list[currentMinIndx] = list[i];
                list[i] = currrentMin;
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
