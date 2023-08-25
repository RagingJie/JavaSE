package String;

/**
 * 屏蔽敏感词
 */
public class StringDemo12 {
    public static void main(String[] args) {
        String talk = "TMD，你玩的这么菜，以后别玩了~";

        String tmd = talk.replace("TMD", "***");

        System.out.println(tmd);
    }
}
