import java.util.List;

//Merge Sort with O(1) space complexity and O(log n) time complexity
public class MergeSort {

    public void sort(List<Integer> list){
        if(list.size()>1)
            divide(list, 0, list.size()-1);
    }

    private void divide(List<Integer> list, int start, int end){
        int length=end-start+1;

        if (length==1 ){
            return;
        }

        int middle=(start+end)/2;

       divide(list,start, middle);
       divide(list,middle+1, end);

       merge(list, start, middle, middle+1, end);
    }

    private void merge(List<Integer>     list, int leftStart, int leftEnd, int rightStart, int rightEnd){
        int i=leftStart;
        int j=rightStart;

        int temp=0;
        int leftVal=0;
        int rightVal=0;
        for(; i<=leftEnd && j<=rightEnd; i++){
            leftVal=list.get(i);
            rightVal=list.get(j);
            //sorting in ascending order
            //
            if(leftVal>rightVal){
                //add index, element
                temp=rightVal;
                int k=j;
                while(k>i){
                    list.set(k, list.get(k-1));
                    k--;
                }
                list.set(i, temp);
                j++;
            }
        }

        if(j==rightEnd){
            if(list.get(rightEnd)<list.get(rightEnd-1)){
                temp=list.get(rightEnd-1);
                list.set(rightEnd-1, list.get(rightEnd));
                list.set(rightEnd, temp);
            }
        }
    }
}
