package sort;

import com.yd.sort.soringAlgorithm.comparisonSoring.selectSort.SelectSort;
import org.junit.Test;
import source.DataSource;

import java.util.Arrays;

public class SelectSortTest {
    @Test
    public void sortTest(){
        SelectSort<Integer> selectSort = new SelectSort<>();
        Integer[] sort = selectSort.sort(DataSource.convert(DataSource.data3));
        System.out.println(Arrays.toString(sort));
    }
}
