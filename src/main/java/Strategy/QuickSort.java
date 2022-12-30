package Strategy;

import java.util.ArrayList;
import java.util.List;

public class QuickSort<T extends Comparable> extends SortAlgorithm<T> {

    public int partition(List<T> arr, int l, int r){
        T pivot = arr.get(r);
        int i=l-1;
        for(int j=l;j<r;j++){
            if(arr.get(j).compareTo(pivot)<0){
                swap(arr,++i,j);
            }
        }
        swap(arr,i+1,r);
        return i+1;
    }
    public void sortHelp(List<T> arr,int l, int r) {
        if(l>=r)return;
        int pivotInd = partition(arr,l,r);
        sortHelp(arr,l,pivotInd-1);
        sortHelp(arr,pivotInd+1,r);
    }

    @Override
    public List<T> sort(List<T> arr) {
        var arrCopy = new ArrayList<>(arr);
        sortHelp(arrCopy,0, arr.size()-1);
        return arrCopy;
    }
}
