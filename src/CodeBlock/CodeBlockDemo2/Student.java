package CodeBlock.CodeBlockDemo2;

/**
 * @Author Naruto
 * @Date 2023/12/1 0:21
 * @Description:
 */
public class Student {
    private String name;
    private int age;

    //构造代码块
    //随着类的加载而加载，只执行一次
    static  {
        System.out.println("开始创建对象了....");
    }

    //无参构造
    public Student(){
        System.out.println("无参构造....");
    }

    //有参构造
    public Student(String name, int age){
        System.out.println("有参构造....");
        this.name = name;
        this.age = age;
    }
    //单个参数构造
    public Student(String name){
        System.out.println("单个参数构造....");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
