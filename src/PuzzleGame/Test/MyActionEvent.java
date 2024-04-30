package PuzzleGame.Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author
 * @Date 2024/3/13 11:23
 * @Description:
 */
public class MyActionEvent implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("触发点击按钮");
    }
}
