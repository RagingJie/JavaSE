package PuzzleGame.UI;

import javax.swing.*;
import java.awt.*;

/**
 * @Author Naruto
 * @Date 2024/3/7 0:24
 * @Description: 登录界面
 */
public class LoginJframe extends JFrame {

    // （构造方法）创建对象时，初始化窗口
    public LoginJframe() throws HeadlessException {

        // 初始化窗口
        initWindow();

        // 初始化界面
        initPage();
    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/5/21 15:46
     * @description 初始化页面
     */
    private void initPage() {
        String backgroundImageUrl = "image\\login\\background.png";
        JLabel jLabel = new JLabel(new ImageIcon("D:\\WorkSpace\\JavaSE\\image\\login\\background.png"));
        jLabel.setBounds(0, 0, 470, 390);
        jLabel.setVisible(true);

        this.getContentPane().add(jLabel);

    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/5/21 15:46
     * @description 初始化窗口
     */
    private void initWindow() {
        // 构造方法初始化，this是本对象的地址值
        // this.setSize(488, 430);

        // 窗体名字
        this.setTitle("拼图 登录");

        // 设置窗体的高、宽
        this.setSize(485, 427);

        // 设置界面置顶
        this.setAlwaysOnTop(true);

        // 设置界面居中
        this.setLocationRelativeTo(null);

        // 设置关闭模式  点击窗体的×时，程序会停止运行
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 设置窗体是否显示，默认是隐藏的
        this.setVisible(true);
    }
}
