package sort;

import com.yd.sort.soringAlgorithm.comparisonSoring.mergeSort.MergeSort;
import org.junit.Test;
import source.DataSource;

import java.util.Arrays;

public class MergeSortTest {
    @Test
    public void sortTest(){
        MergeSort<Integer> mergeSort = new MergeSort<>();
        Integer[] sort = mergeSort.sort(DataSource.convert(DataSource.data2));
        System.out.println(Arrays.toString(sort));
    }
}
