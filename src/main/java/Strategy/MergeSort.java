package Strategy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class MergeSort<T extends Comparable> extends SortAlgorithm<T>{
    private List<T> merge(List<T> arr1, List<T> arr2){
        int ind1=0,ind2=0,i=0;
        List<T> rez = new ArrayList<T>(Collections.nCopies(arr1.size()+arr2.size(), null));
        while(i< rez.size()&&ind1< arr1.size() && ind2< arr2.size()){
            if(arr1.get(ind1).compareTo(arr2.get(ind2))<=0){
                rez.set(i++,arr1.get(ind1++));
            } else{
                rez.set(i++,arr2.get(ind2++));
            }
        }
        int ind;
        List<T> arr;
        if(ind1< arr1.size()){
            ind=ind1;
            arr=arr1;
        } else {
            ind = ind2;
            arr=arr2;
        }
        for(int j=ind;j<arr.size();j++){
            rez.set(i++,arr.get(j));
        }
        return rez;
    }

    private List<T> sortHelp(List<T> arr){
        if(arr.size()<=1)return arr;
        int mid = arr.size()/2;
        var leftArr = sortHelp(arr.subList(0,mid));
        var rightArr = sortHelp(arr.subList(mid,arr.size()));
        return merge(leftArr,rightArr);
    }

    @Override
    public List<T> sort(List<T> arr) {
        return sortHelp(new ArrayList<>(arr));
    }
}
