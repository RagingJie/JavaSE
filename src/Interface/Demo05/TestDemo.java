package Interface.Demo05;

/**
 * @Author Naruto
 * @Date 2024/3/4 21:16
 * @Description:
 */
public class TestDemo {
    public static void main(String[] args) {
        TableTennisCoach tableTennisCoach = new TableTennisCoach("乒乓球教练", 35);
        System.out.println(tableTennisCoach.getName() + "，" + tableTennisCoach.getAge());
        tableTennisCoach.speakEnglish();
        tableTennisCoach.teach();

        System.out.println();

        TableTennisPlayer tableTennisPlayer = new TableTennisPlayer("乒乓球运动员", 20);
        System.out.println(tableTennisPlayer.getName() + "，" + tableTennisPlayer.getAge());
        tableTennisPlayer.speakEnglish();
        tableTennisPlayer.study();

        System.out.println();

        BasketballPlayer basketballPlayer = new BasketballPlayer("篮球运动员", 19);
        System.out.println(basketballPlayer.getName() + "，" + basketballPlayer.getAge());
        basketballPlayer.study();

        System.out.println();

        BasketballCoach basketballCoach = new BasketballCoach("篮球教练", 50);
        System.out.println(basketballCoach.getName() + "，" + basketballCoach.getAge());
        basketballCoach.teach();
    }
}
