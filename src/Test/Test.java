package Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author
 * @Date 2024/4/1 15:52
 * @Description:
 */
public class Test {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        int i = 0;
        try {
            for (; ; ) {
                books.add(new Book("book"));
//             System.out.println(i++);
                i++;
            }
        } finally {
            System.out.println(i);
        }

    }
}

class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }
}
