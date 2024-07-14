import javax.swing.*;
import java.awt.*;
import java.util.Objects;

//早寝用の画面。

public class FastGoSleepPanel extends Panel{
    public static final int PANEL_INDEX = 1;

    FastGoSleepPanel(){
        this.setBackground(Color.CYAN);
    }

    @Override
    public int getPanelIndex() {
        return FastGoSleepPanel.PANEL_INDEX;
    }
}