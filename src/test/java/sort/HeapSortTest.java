package sort;

import com.yd.sort.soringAlgorithm.comparisonSoring.heapSort.HeapSort;
import org.junit.Test;
import source.DataSource;

import java.util.Arrays;

public class HeapSortTest {
    @Test
    public void sortTest(){
        HeapSort<Integer> heapSort = new HeapSort<>();
        Integer[] sort = heapSort.sort(DataSource.convert(DataSource.data2));
        System.out.println(Arrays.toString(sort));
    }
}
