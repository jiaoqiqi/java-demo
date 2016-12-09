//21-2
public class BinarySearch{
    //非递归
    public static <T extends Comparable<T>> int binarySearch(T[] a,int fromIndex,int toIndex,T value){
        int low=fromIndex;
        int high=toIndex-1;
        while(low<=high){
            int mid=(low+high)/2;
            T midVal=a[mid];
            if(midVal.compareTo(value)<0)
                low=mid+1;
            else if(midVal.compareTo(value)>0)
                high=mid-1;
            else
                return mid;
        }
        return 0;
    }
    //递归
    public static <T extends Comparable<T>> int  binarySearch1(T[] a,int fromIndex,int toIndex,T value){
        if(fromIndex>toIndex)
            return -1;
        int mid=(fromIndex+toIndex)>>>1;
        if(a[mid].compareTo(value)<0){
            return binarySearch1(a,mid+1,toIndex,value);
        }else if(a[mid].compareTo(value)>0){
            return binarySearch1(a,fromIndex,mid-1,value);
        }else{
            return mid;
        }
    }
    public static void main(String[] args){
        Integer[] a={2,3,5,7,9,13,18};
        System.out.println(binarySearch(a,0,7,13));
        System.out.println(binarySearch1(a,0,7,18));
    }
}

