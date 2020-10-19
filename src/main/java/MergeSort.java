import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    private List<Integer> datasource;

    public MergeSort(List<Integer> datasource) {
        this.datasource = datasource;
    }

    public List<Integer> sort(){
        mergeSort(datasource, datasource.size() );
        return datasource;
    }

    private void mergeSort(List<Integer> datasource , int size){
        if (size < 2){
            return;
        }
        int mid = size / 2;
        List<Integer> leftSubArray = fillArray(0 , mid , datasource);
        List<Integer> rightSubArray = fillArray(mid , size ,datasource);

        mergeSort(leftSubArray,mid);
        mergeSort(rightSubArray,size - mid);

        merge(datasource , leftSubArray ,rightSubArray,mid , size - mid);
    }

    private void merge(List<Integer> datasource,
                       List<Integer> leftSubArray,
                       List<Integer> rightSubArray,
                       int left,
                       int right) {
        int i = 0 , j= 0 ,k =0 ;
        while( i < left && j < right){
            if (leftSubArray.get(i) <= rightSubArray.get(j)){
                datasource.set(k , leftSubArray.get(i));
                k++;
                i++;
            }else{
                datasource.set(k , rightSubArray.get(j));
                k++;
                j++;
            }
        }
        while(i < left){
            datasource.set(k , leftSubArray.get(i));
            k++;
            i++;
        }
        while(j < right){
            datasource.set(k , rightSubArray.get(j));
            k++;
            j++;
        }
    }

    private List<Integer> fillArray(int from, int to ,List<Integer> datasource) {
        List<Integer> currentArray = new ArrayList<>();
        for (int i  = from ; i < to ; i++){
            currentArray.add(datasource.get(i));
        }
        return currentArray;
    }
}
