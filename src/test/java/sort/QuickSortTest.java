package sort;

import com.yd.sort.soringAlgorithm.comparisonSoring.quickSort.QuickSort;
import org.junit.Test;
import source.DataSource;

import java.util.Arrays;

public class QuickSortTest {
    @Test
    public void sortTest(){
        QuickSort<Integer> quickSort = new QuickSort<>();
        Integer[] sort = quickSort.sort(DataSource.convert(DataSource.data1));
        System.out.println(Arrays.toString(sort));
    }


}
