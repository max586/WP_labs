package Strategy;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort<T extends Comparable> extends SortAlgorithm<T>{
    @Override
    public List<T> sort(List<T> arr) {
        var arrCopy = new ArrayList<>(arr);
        for(int i=0;i<arrCopy.size()-1;i++){
            for(int j=0;j<arrCopy.size()-1-i;j++){
                if(arrCopy.get(j).compareTo(arrCopy.get(j+1))>0){
                    swap(arrCopy,j,j+1);
                }
            }
        }
        return arrCopy;
    }
}
