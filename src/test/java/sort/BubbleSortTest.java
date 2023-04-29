package sort;

import com.yd.sort.soringAlgorithm.comparisonSoring.bubbleSort.BubbleSort;
import org.junit.Test;
import source.DataSource;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    public void sortTest(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        Integer[] afterSort1 = bubbleSort.sort(DataSource.convert(DataSource.data1));
        System.out.println(Arrays.toString(afterSort1));
        Integer[] afterSort2 = bubbleSort.sort(DataSource.convert(DataSource.data2));
        System.out.println(Arrays.toString(afterSort2));
        Integer[] afterSort3 = bubbleSort.sort(DataSource.convert(DataSource.data3));
        System.out.println(Arrays.toString(afterSort3));
        Integer[] afterSort4 = bubbleSort.sort(DataSource.convert(DataSource.data4));
        System.out.println(Arrays.toString(afterSort4));
    }
}
