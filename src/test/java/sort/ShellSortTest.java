package sort;

import com.yd.sort.soringAlgorithm.comparisonSoring.shellSort.ShellSort;
import org.junit.Test;
import source.DataSource;

import java.util.Arrays;

public class ShellSortTest {
    @Test
    public void sortTest(){
        ShellSort<Integer> shellSort = new ShellSort<>();
        shellSort.setElements(DataSource.convert(DataSource.data3));
        shellSort.sort();
        System.out.println(Arrays.toString(shellSort.getElements()));
    }
}
