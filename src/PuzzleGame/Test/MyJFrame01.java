package PuzzleGame.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * @Author
 * @Date 2024/3/13 9:30
 * @Description:
 */
public class MyJFrame01 extends JFrame implements ActionListener {

    JButton jButton1 = new JButton();

    JButton jButton2 = new JButton();

    public MyJFrame01() throws HeadlessException {

        initWindow();

        addButton();

    }

    public void initWindow() {

        // 窗户标题
        this.setTitle("测试窗口");

        // 窗口大小
        this.setSize(408, 480);

        // 关闭窗口时，程序停止
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 设置组件布局,取消居中显示（个人理解，里面的容器）
        this.setLayout(null);

        // 不能最大化
        this.setResizable(false);

        // 居中显示
        this.setLocationRelativeTo(null);

        // 界面置顶 无论什么页面打开，这个界面总是在最上面
        this.setAlwaysOnTop(true);

        // 显示窗口
        this.setVisible(true);
    }

    public void addButton() {

        jButton1.setText("点击我变大");
        jButton1.setBounds(0, 0, 100, 50);
        jButton1.setVisible(true);
        jButton1.addActionListener(this);


        jButton2.setText("点我随机出现");
        jButton2.setBounds(100, 0, 100, 50);
        jButton2.setVisible(true);
        jButton2.addActionListener(this);

        this.getContentPane().add(jButton1);
        this.getContentPane().add(jButton2);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();
        if (source == jButton1) {
            jButton1.setBounds(0, 0, 150, 100);
            System.out.println("jButton11111点击事件触发");
        }
        if (source == jButton2) {
            Random random = new Random();
            jButton2.setBounds(random.nextInt(400), random.nextInt(400), 100, 50);
            System.out.println("jButton22222点击事件触发");
        }

    }
}
