import javax.swing.*;
import java.awt.*;
import java.util.Objects;

//朝ごはん用の画面。
public class BreakfastPanel extends Panel{
    public static final int PANEL_INDEX = 0;
    
    BreakfastPanel(){
        this.setBackground(Color.YELLOW);
    }

    @Override
    public int getPanelIndex() {
        return BreakfastPanel.PANEL_INDEX;
    }
}
