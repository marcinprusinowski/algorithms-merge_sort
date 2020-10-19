import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MergeSortTest {

    @Test
    public void shouldReturnSortedArray(){
        List<Integer> numbers = new ArrayList<>(List.of(15,2,51,6,75,1));
        List<Integer> expected = new ArrayList<>(List.of(1,2,6,15 ,51,75));
        MergeSort mergeSort = new MergeSort(numbers);

        numbers = mergeSort.sort();

        Assertions.assertIterableEquals(expected , numbers);
    }
}