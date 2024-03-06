package PuzzleGame.UI;

import javax.swing.*;

/**
 * @Author
 * @Date 2024/3/7 0:02
 * @Description:
 */
public class Test {
    public static void main(String[] args) {

        // 1.创建一个游戏的主界面
        JFrame gameJframe = new JFrame("V1.0拼图小游戏");
        gameJframe.setSize(603, 680);
        gameJframe.setVisible(true);

        // 2.创建一个登录界面
        JFrame loginJframe = new JFrame("登录");
        loginJframe.setSize(488, 430);
        loginJframe.setVisible(true);

        // 3.创建一个注册界面
        JFrame registerJframe = new JFrame("注册");
        registerJframe.setSize(488, 500);
        registerJframe.setVisible(true);
    }
}
