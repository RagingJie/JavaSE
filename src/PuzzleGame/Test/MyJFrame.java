package PuzzleGame.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author
 * @Date 2024/3/13 9:30
 * @Description:
 */
public class MyJFrame extends JFrame {

    public MyJFrame() throws HeadlessException {

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
        JButton jButton = new JButton();
        jButton.setText("点击我");
        jButton.setBounds(0, 0, 100, 50);
        jButton.setVisible(true);
        // 1-创建接口去实现监听事件
//        jButton.addActionListener(new MyActionEvent());
        // 2-直接使用匿名内部类实现监听事件    actionListener 只能监听鼠标的左键和空格键
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("使用匿名内部类的形式实现监听事件");
            }
        });
        this.getContentPane().add(jButton);
    }


}
