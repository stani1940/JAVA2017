package components;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.KeyStroke;
import javax.swing.ImageIcon;


public class Demo_1Class {


    int x = 10;
    int y = 10;
    private String title;

    public static void main(String[] args) {
        Demo_1Class demo_1Class= new Demo_1Class();
        demo_1Class.go();
    }



    public void go(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel panel = new MyDrawPanel();

        frame.getContentPane().add(panel);

        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

       frame.setTitle("Glittering ball");
        frame.setBackground(Color.CYAN);
        //frame.setShape(Shape);



        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Settings");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);
        //Build second menu in the menu bar.

        menu = new JMenu("Created");
        menu.setMnemonic(KeyEvent.VK_N);
        menu.getAccessibleContext().setAccessibleDescription(
                "This menu does nothing");
        menuBar.add(menu);
        //show the menu bar
        frame.setJMenuBar(menuBar);

        for (int i = 0; i < 450; i++){
            if (i < 226) {
                x++;
                y++;
                panel.repaint();
                try {
                    Thread.sleep(50);
                } catch (Exception ignored) {
                }
            }else{
                x++;
                y--;
                panel.repaint();
                try{
                    Thread.sleep(50);
                }catch(Exception ignored){

                }
            }
        }

    }



    class MyDrawPanel extends JPanel{
        public void paintComponent(Graphics g){
            //g.setColor(Color.white);
            g.fillRect(0,0, this.getWidth(), this.getHeight());

            int one = (int) (Math.random() * 255);
            int two = (int) (Math.random() * 255);
            int three = (int) (Math.random() * 255);

            Color color = new Color(one, two, three);
            g.setColor(color);
            g.fillOval(x, y, 100, 100);
        }
    }

}