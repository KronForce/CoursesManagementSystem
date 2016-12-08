package view.windows;

import javax.swing.*;

/**
 * Created by mikes on 24.09.2016.
 */
public class BaseFrame extends JFrame {
    public BaseFrame(String titleName, Boolean isCloseOperationCLOSE) {
        //isCloseOperationClose - флаг, отвечающий за варианты хода событий после нажатия кнопки Close (правый верхний угол).
        this.setTitle(titleName);
        this.setSize(1500, 800); //700 ?
        if (isCloseOperationCLOSE) {
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        } else {
            this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        }
        this.setLocationRelativeTo(null);
    }
}
