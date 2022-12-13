package ZipCodeDB;

import javax.swing.*;

public class GUIMain {

    public static void main(String[] args) {
        JFrame frame = new JFrame("CS219 Weather App");
        frame.add(new GUIPanel());
        frame.setVisible(true);

        //when user clicks X in title bar. It stops the program
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack(); // makes the JFrame the size of the internal components
    }
}
