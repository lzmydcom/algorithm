package sort;

import com.yd.sort.soringAlgorithm.comparisonSoring.insertionSort.InsertionSort;
import org.junit.Test;
import source.DataSource;

import java.util.Arrays;

public class InsertionSortTest {
    @Test
    public void sortTest(){
        InsertionSort<Integer> insert = new InsertionSort<>();
        Integer[] sort = insert.sort(DataSource.convert(DataSource.data2));
        System.out.println(Arrays.toString(sort));
    }
}
