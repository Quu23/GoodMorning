import javax.swing.*;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

public class Window extends JFrame{

    // 各パネルはインデックス(添え字)で管理する。その添え字は定数にする？
    List<JPanel> panels = new ArrayList<>();

    Window(String name){
        this.setTitle(name);
        this.setSize(800,800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        // panelsのセットアップ
        

        // 以下Panelを張る。 panels を使う。
        

        this.setVisible(true);
    }
}