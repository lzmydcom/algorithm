package sort;

import com.yd.sort.soringAlgorithm.nonComparativeSorting.countSort.CountingSort;
import org.junit.Test;
import source.DataSource;
import com.yd.sort.pojo.Student;

import java.util.Arrays;

public class CountingSortTest {

    @Test
    public void sortTest(){
        CountingSort<Student> countSoring = new CountingSort<>();
        Object[] sort = countSoring.sort(DataSource.data8());
        System.out.println(Arrays.toString(sort));

        CountingSort<Student> countSoring1 = new CountingSort<>();
        Object[] sort1 = countSoring1.sort(DataSource.data7());
        System.out.println(Arrays.toString(sort1));
    }

    @Test
    public void test01(){
        //1 + 2 + 8
        int i = 11 & 0b1;
        int i1 = 11 & 0b10;
        int i2 = 11 & 0b100;
        int i3 = 11 & 0b1000;
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
    @Test
    public void test02(){
        int position = 0;
        int medianValue = 0b0011_1110_1000;
        while(medianValue != 0) {
            medianValue = medianValue >>> 4;
            position++;
        }
        System.out.println(position);
    }
}
