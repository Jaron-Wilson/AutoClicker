import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;

public class Autoclicker {
    public static void main(String[] args) throws Exception {

        Robot robot = new Robot();

        JFrame jframe = new JFrame();
        jframe.setLayout(new FlowLayout());



        JButton button = new JButton("Clicker");
        jframe.add(button);

        button.addActionListener(e -> {
            int counter = 0;

            robot.delay(1000);
            while (true) {
                robot.mousePress(InputEvent.BUTTON1_MASK);
                robot.delay(0);
                robot.mouseRelease(InputEvent.BUTTON1_MASK);
                if (counter++ > 10000) {
                    System.out.println("finished");

                    jframe.add(new TextArea("" + counter));
                    break;
                }
            }
        });

        JButton button2 = new JButton("clickhold");
        jframe.add(button2);

        button2.addActionListener(e -> {
            int counter2 = 0;

            robot.delay(1000);
            while (true) {
                robot.keyPress(9);
                robot.mousePress(InputEvent.BUTTON1_MASK);
                if (counter2++ > 10000) {
                    System.out.println("finishedhold");

                    jframe.add(new TextArea("" + counter2));
                    break;
                }
            }
        });




        jframe.setSize(400, 350);
        jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jframe.setVisible(true);
    }

}
//}            int counter = 0;
//
//            robot.delay(0);
//                    while (true) {
//                    robot.mousePress(InputEvent.BUTTON1_MASK);
//                    robot.delay(0);
//                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
//                    if (counter++ > 10000) {
//                    System.out.println("finished");
//
//                    return;
//                    }
//                    }


//
//public class Autoclicker {
//
//    public static void main(String[] argv) throws Exception {
//
//        JTextField textField = new JTextField();
//
//        textField.addKeyListener(new MKeyListener());
//
//        JFrame jframe = new JFrame();
//
//        jframe.add(textField);
//
//        jframe.setSize(400, 350);
//
//        jframe.setVisible(true);
//
//    }
//
//}

//class MKeyListener extends KeyAdapter {
//
//    public Robot robot = new Robot();
//    MKeyListener() throws AWTException {
//    }
//
//    @Override
//    public void keyPressed(KeyEvent event) {
//        boolean pressedKey = true;
//
//        char ch = event.getKeyChar();
//
//      if (ch == '[' || ch == ']') {
//          Autoclicker.main();
//            }
//        }
//    }
//        if (event.getKeyCode() == KeyEvent.VK_CAPS_LOCK) {
//
//            System.out.println("Key codes: " + event.getKeyCode());
//
//        }
//    }
//}