package Strategy;

import java.util.List;

public class test {

    public static void main(String[] args) {
        var arr1 = List.of(10,6,4,8,6,1,2,3);
        var arr2 = List.of("qjk","wsw","ccb","aba","aab","aaa");
        var arr3 = List.of('t','0','w','d','3','N','C','-');

        SortAlgorithm<Integer> sort1 = new QuickSort<>();
        SortAlgorithm<String> sort2 = new MergeSort<>();
        SortAlgorithm<Character>sort3 = new BubbleSort<>();

        arr1=sort1.sort(arr1);
        arr2=sort2.sort(arr2);
        arr3=sort3.sort(arr3);

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);
    }
}
