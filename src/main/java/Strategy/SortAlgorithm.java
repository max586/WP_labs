package Strategy;

import java.util.List;
import java.util.List;

public abstract class SortAlgorithm<T extends Comparable> {
    public void swap(List<T> arr, int ind1, int ind2){
        T buf=arr.get(ind1);
        arr.set(ind1,arr.get(ind2));
        arr.set(ind2,buf);
    }
    public abstract List<T> sort(List<T> arr);
}
