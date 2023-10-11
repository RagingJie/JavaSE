package Static.Demo03_Utils;

import java.util.ArrayList;

public class MaxAgeUtil {
    private MaxAgeUtil(){}

    public static int getMaxAge(ArrayList<Student> arr){
        int maxAge = 0;
        for (Student student : arr) {
            if (student.getAge() > maxAge){
                maxAge = student.getAge();
            }
        }
        return maxAge;
    }
}
