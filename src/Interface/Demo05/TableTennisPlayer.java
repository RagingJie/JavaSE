package Interface.Demo05;

/**
 * @Author Naruto
 * @Date 2024/3/4 21:08
 * @Description:
 */
public class TableTennisPlayer extends Athlete implements SpeakEnglish {

    public TableTennisPlayer() {
    }

    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语~");
    }
}
