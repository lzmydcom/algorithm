package sort;

import com.yd.sort.pojo.Student;
import com.yd.sort.soringAlgorithm.nonComparativeSorting.radixSort.RadixSort;
import org.junit.Test;
import source.DataSource;

import java.util.Arrays;

public class RadixSortTest {
    @Test
    public void sortTest(){
        RadixSort<Student> radixSort = new RadixSort<>();
        radixSort.setElements(DataSource.data8());
        Object[] sort1 = radixSort.sort();
        System.out.println(Arrays.toString(sort1));

        radixSort.setElements(DataSource.data9());
        Object[] sort2 = radixSort.sort();
        System.out.println(Arrays.toString(sort2));
    }
}
