package PuzzleGame.Test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @Author
 * @Date 2024/4/30 11:15
 * @Description:
 */
public class MyJFrame02 extends JFrame implements MouseListener {

    JButton button = new JButton();

    public MyJFrame02() {
        initWindow();

        initButton();
    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/4/30 11:22
     * @description 初始化窗口
     */
    private void initWindow() {

        this.setTitle("鼠标监听事件");

        this.setSize(480, 500);

        this.setLayout(null);

        this.setLocationRelativeTo(null);

        this.setResizable(false);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setAlwaysOnTop(true);

        this.setVisible(true);

    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/4/30 11:22
     * @description 初始化按钮
     */
    private void initButton() {

        button.setBounds(0, 0, 100, 50);
        button.setVisible(true);
        button.setText("点击我有惊喜！！！");
        button.addMouseListener(this);

        this.getContentPane().add(button);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按住不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }
}
