package Class.Student;

/*
        定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        学生的属性:学号，姓名，年龄。
        要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        要求2:添加完毕之后，遍历所有学生信息。
        要求3:通过id删除学生信息     如果存在，则删除，如果不存在，则提示删除失败。
        要求4:删除完毕之后，遍历所有学生信息。
        要求5:查询数组id为heima002”的学生，如果存在，则将他的年龄+1岁
*/

/**
 * 完成要求 3  4
 */
public class StudentTest2 {
    public static void main(String[] args) {
        Student[] stu = new Student[3];
        Student s1 = new Student("heima001", "一号学员", 18);
        Student s2 = new Student("heima002", "二号学员", 20);
        Student s3 = new Student("heima003", "三号学员", 23);
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;

        int count = getCount(stu);
        Student[] stuNew = deleteInfo(stu, "heima003");
        int count1 = getCount(stuNew);
        if (count == count1) {
            System.out.println("删除失败！！！");
        } else {
            System.out.println("删除成功！！！");
            for (int i = 0; i < stuNew.length; i++) {
                if (stu[i] != null) {
                    System.out.println("学号：" + stuNew[i].getId() + "，姓名：" + stuNew[i].getName() + "，年龄" + stuNew[i].getAge());
                }
            }
        }

    }

    //判断数组中是否存在指定id的对象
    public static boolean contains(Student[] arr, String id) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getId().equals(id)) {
                flag = true;
            }
        }
        return flag;
    }

    //找到指定id存在的索引
    public static int getIndex(Student[] arr, String id) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getId().equals(id)) {
                index = i;
            }
        }
        return index;
    }

    //删除指定id的学生信息
    public static Student[] deleteInfo(Student[] arr, String id) {
        boolean contains = contains(arr, id);
        if (contains) {
            int index = getIndex(arr, id);
            if (index == arr.length - 1) {
                arr[index] = null;
                return arr;
            } else {
                Student[] sNew = new Student[arr.length - 1];
                int j = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (i != index) {
                        sNew[j] = arr[i];
                        j++;
                    }
                }
                return sNew;
            }
        } else {
            System.out.println("学号为：" + id + "的学生不存在~");
            return arr;
        }
    }

    //获取数组中有几个学生对象
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }
}
