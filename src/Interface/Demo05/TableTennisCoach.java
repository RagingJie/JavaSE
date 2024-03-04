package Interface.Demo05;

/**
 * @Author naruto
 * @Date 2024/3/4 21:15
 * @Description:
 */
public class TableTennisCoach extends Coach implements SpeakEnglish {

    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球~");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语~");
    }
}
