package code;
public class UIApplication {
    public static void main(String[] args) {
    	UI ui = new UI();
        ui.setBounds(100, 100, 600, 300);
        ui.setVisible(true);
        ui.setResizable(false);
    }
}