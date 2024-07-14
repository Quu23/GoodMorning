import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class Window extends JFrame{

    // 各パネルはインデックス(添え字)で管理する。その添え字は定数にする？
    List<Panel> panels = new ArrayList<>();
    int panelIndex;

    Window(String name){
        this.setTitle(name);
        this.setSize(800,800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        // panelsのセットアップ
        panels.add(new BreakfastPanel()); 
        panels.add(new FastGoSleepPanel());
        panels.add(new FastWakeUpPanel());
        panels.add(new UserPanel());   
        panels.add(new SidebarPanel());    

        // 以下Panelを張る。 panels を使う。
        this.add(panels.get(UserPanel.PANEL_INDEX),BorderLayout.EAST);
        this.add(panels.get(SidebarPanel.PANEL_INDEX),BorderLayout.WEST);
        this.add(panels.get(FastGoSleepPanel.PANEL_INDEX),BorderLayout.CENTER);
        this.panelIndex = FastGoSleepPanel.PANEL_INDEX;
        this.setVisible(true);
    }

    //ふかんぜん。いろかわったりかわらなかったり。画面サイズ買えたら色かわる。
    public void panelsChange(int after){
        this.remove(panels.get(panelIndex));

        this.add(panels.get(after));
        
        this.panelIndex = after;
        this.repaint();
    }
}