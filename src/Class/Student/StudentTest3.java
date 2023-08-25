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
 * 完成要求 5
 */
public class StudentTest3 {
    public static void main(String[] args) {
        Student[] stu = new Student[3];
        Student s1 = new Student("heima001", "一号学员", 18);
        Student s2 = new Student("heima002", "二号学员", 20);
        Student s3 = new Student("heima003", "三号学员", 23);
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;

        printArr(stu);
        System.out.println("**************************************");
        String id = "heima005";
        boolean flag = contains(stu, id);
        if (flag){
            int index = getIndex(stu, id);
            stu[index].setAge(stu[index].getAge()+1);
            printArr(stu);
        }else {
            System.out.println("学号为：" + id + "的学生不存在~");
            System.out.println("修改失败！");
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

    //遍历数组
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null){
                System.out.println("学号：" + arr[i].getId() + "，姓名：" + arr[i].getName() + "，年龄" + arr[i].getAge());
            }
        }
    }
}
