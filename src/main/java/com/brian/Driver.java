import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        list.add(4);
        list.add(1);
        list.add(8);
        list.add(7);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(10);
        list.add(0);

        MergeSort mergeSort=new MergeSort();

        mergeSort.sort(list);
        System.out.println(list);

    }
}
