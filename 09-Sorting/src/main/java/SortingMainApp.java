import java.util.Arrays;

public class SortingMainApp {
    public static void main(String[] args) {
        var myarray=new int[]{ 8, 2, 4, 1, 3,0,-1};


        MyMergeSort mSort= new MyMergeSort();
        MyMergeSort.mergeSort(myarray);
        System.out.println(Arrays.toString(myarray));

    }
}
