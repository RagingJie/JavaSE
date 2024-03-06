package PuzzleGame.UI;

import javax.swing.*;
import java.awt.*;

/**
 * @Author Naruto
 * @Date 2024/3/7 0:22
 * @Description: 游戏主界面
 */
public class GameJframe extends JFrame {

    public GameJframe() throws HeadlessException {
        // 构造方法用于初始化
        super("V1.0拼图小游戏");   // 窗体名字
        this.setSize(603, 680);  // 设置窗体的高、宽
        this.setVisible(true);  // 设置窗体是否显示，默认是隐藏的

    }
}
