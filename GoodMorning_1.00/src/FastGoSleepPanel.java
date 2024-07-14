import javax.swing.*;
import java.awt.*;
import java.util.Objects;

//早寝用の画面。

public class FastGoSleepPanel extends JPanel{
    public static final int PANEL_INDEX = 1;

    FastGoSleepPanel(){
        this.setBackground(Color.CYAN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PANEL_INDEX,this.getBackground());
    }
}