public class App {

    // ユーザーの定義。static で定義すれば他クラスでも利用できる。
    static User user;
    static int mode=FastGoSleepPanel.PANEL_INDEX;
    static Window window;
    
    public static void main(String[] args) throws Exception {
        window = new Window("kari");
        System.out.println(window.getComponentCount());
    }
}
