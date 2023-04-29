package sort;

import com.yd.sort.pojo.Student;
import com.yd.sort.soringAlgorithm.nonComparativeSorting.bucketSort.BucketSort;
import org.junit.Test;
import source.DataSource;

import java.util.Arrays;

public class BucketSortTest {
    @Test
    public void sortTest(){
        BucketSort<Student> bucketSort = new BucketSort<>();
        bucketSort.setElements(DataSource.data9());
        Object[] sort = bucketSort.sort();
        System.out.println(Arrays.toString(sort));
    }
}