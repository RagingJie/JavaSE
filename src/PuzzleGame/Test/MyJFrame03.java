package PuzzleGame.Test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

/**
 * @Author
 * @Date 2024/4/30 11:31
 * @Description: 键盘监听事件
 */
public class MyJFrame03 extends JFrame implements KeyListener {

    JButton button = new JButton("点击我有惊喜哦！！！！");

    public MyJFrame03() {
        initWindow();
    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/4/30 11:22
     * @description 初始化窗口
     */
    private void initWindow() {

        this.setTitle("键盘键入监听事件");

        this.setSize(480, 500);

        this.setLayout(null);

        this.setLocationRelativeTo(null);

        this.setResizable(false);  // 禁用最大化

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setAlwaysOnTop(true);

        // 给窗口添加键盘键入监听事件
        this.addKeyListener(this);

        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println();
    }

    //    ==================== 重写键盘监听事件方法
    // 一直按着键不松开时，会一直重复触发《keyPressed》方法
    // 每一个按键都对应一个《code编号》
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下按键不松");
    }

    // 松开按键
    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开按键");
        int keyCode = e.getKeyCode();
        System.out.println("输入的按键编号：" + keyCode);
        if (keyCode == 65) {
            System.out.println("按下的键是：A");
        } else if (keyCode == 66) {
            System.out.println("按下的键是：B");
        } else if (keyCode == 67) {
            System.out.println("按下的键是：C");
        } else if (keyCode == 38) {
            System.out.println("按下的键是：↑");
        } else if (keyCode == 40) {
            System.out.println("按下的键是：↓");
        } else if (keyCode == 39) {
            System.out.println("按下的键是：→");
        } else if (keyCode == 37) {
            System.out.println("按下的键是：←");
        } else if (keyCode == 27) {
            System.out.println("按下的键是：Esc");
            System.out.println("关闭JVM，退出系统!");
            System.exit(0);
        }
    }
}
