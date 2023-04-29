package source;

import com.yd.sort.pojo.Student;

public class DataSource {

    public static final int[] data1 = {49, 100, 1, 109, 50, 194, 22, 30, 24, 43, 25,
            158, 174, 69, 148, 70, 87, 198, 62, 89, 40, 6, 131, 187, 197, 129, 179,
            54, 170, 137, 10, 9, 102, 128, 44, 2, 121, 162, 124, 15, 180, 11, 183,
            75, 169, 34, 4, 178, 72, 91, 126, 78, 92, 95, 181, 166, 199, 139, 168,
            12, 42};

    public static final int[] data2 = {140, 58, 166, 141, 160, 65, 151, 106, 179,
            165, 184, 185, 76, 169, 137, 63, 92, 103, 24, 121, 93, 152, 23, 130,
            42, 100, 43, 15, 194, 197, 113, 70, 127, 144, 11, 67, 131, 35, 200,
            28, 77, 188, 18, 111, 29, 105, 32, 6, 12, 97, 108, 107, 148, 46, 145,
            17, 126, 3, 82, 8, 75, 123, 40, 1, 38, 182, 10, 89, 41, 50, 117, 79,
            153, 124, 4, 57, 13, 149, 175, 54, 33, 189};

    public static final int[] data3 = {157, 187, 116, 29, 51, 143, 44, 166, 144, 47,
            172, 140, 81, 156, 108, 35, 24, 102, 66, 139, 70, 64, 32, 26, 162, 195,
            120, 37, 72, 179, 10, 4, 75, 63, 188, 107, 52, 85, 133, 91, 46, 82, 196,
            153, 79, 86, 39, 59, 74, 142, 41, 54, 193, 42, 96, 22, 170, 38, 198, 128,
            100, 115, 69, 98, 15, 28, 184};

    public static final int[] data4 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static final int[] data5 = {2, 9, 7, 4, 0, 5, 6, 8, 3, 4};

    public static final int[] data6 = {-2, 4, 6, 8, 3, 11, 10, 12, 4, 12};

    public static Integer[] convert(int[] data) {
        Integer[] integers = new Integer[data.length];
        for (int i = 0; i < data.length; i++) {
            integers[i] = data[i];
        }
        return integers;
    }

    public static Student[] data7(){
        Integer[] integers = convert(data6);
        Student[] students = new Student[integers.length];
        int index = 0;
        for (Integer integer : integers){
            Student student = new Student(integer);
            students[index++] = student;
        }
        students[0].setName("张三");
        students[1].setName("李四");
        students[2].setName("王五");
        students[3].setName("赵六");
        students[4].setName("lisa");
        students[5].setName("jack");
        students[6].setName("juli");
        students[7].setName("ais");
        students[8].setName("珍丽");
        students[9].setName("鲍威尔");
        return students;
    }

    public static Student[] data8(){
        Integer[] integers = convert(data5);
        Student[] students = new Student[integers.length];
        int index = 0;
        for (Integer integer : integers){
            Student student = new Student(integer);
            students[index++] = student;
        }
        students[0].setName("张三");
        students[1].setName("李四");
        students[2].setName("王五");
        students[3].setName("赵六");
        students[4].setName("lisa");
        students[5].setName("jack");
        students[6].setName("juli");
        students[7].setName("ais");
        students[8].setName("珍丽");
        students[9].setName("鲍威尔");
        return students;
    }

    public static Student[] data9(){
        Integer[] integers = convert(data2);
        Student[] students = new Student[integers.length];
        int index = 0;
        for (Integer integer : integers){
            Student student = new Student(integer);
            students[index++] = student;
        }
        for (int i = 0; i < students.length; i++) {
            students[i].setName("学生" + i + "号");
        }
        return students;
    }
}
