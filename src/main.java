import javax.swing.*;
import java.util.*;

public class main extends JFrame {
    private JPanel intro;
    private JTextPane introtext;

    public static String cat = "";

    public main() {
        setContentPane(intro);
        setTitle("Intro");
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args)  {
        main frame = new main();
  //      ImageIcon image1 = new ImageIcon ("C:\\Users\\eviel\\Downloads\\IMG_7900.jpeg");
        frame.intro();
        cat_hider( );






    }
    public static void cat_hider(){    //Used to decide where the cat is hiding
        Random rand = new Random();
        int randnum = rand.nextInt(1,6)+1;
        switch(randnum){
            case 1:
                System.out.println("Cat under couch");
                cat = "under couch";
                break;
            case 2:
                System.out.println("Cat under tv");
                cat = "under tv";
                break;
            case 3:
                System.out.println("Cat under bed");
                cat = "under bed";
                break;
            case 4:
                System.out.println("Cat in bed");
                cat = "in bed";
                break;
            case 5:
                System.out.println("Cat under sink");
                cat = "under sink";
                break;
            case 6:
                System.out.println("Cat on fridge");
                cat = "on fridge";
        }
    }

    public void intro(){     //Introduction to the game
        String[] scenes = {
                "\n\n\n\nBad day...\n\n(Press Enter to continue)",
                "\n\n\n\nCats make people happy.\n\n(Press Enter to continue)",
                "\n\n\n\nDirections:\nFind the cat.\n\n(Press Enter to continue)",
                "\n\n\n\nGame starting in"
        };
        playScenes(scenes,0);
    }

    private void playScenes(String[] scenes, int index){
        if (index >= scenes.length) {
            return;
        }

        introtext.setText("");
        typeText(scenes[index]);

        for (var listener : introtext.getKeyListeners()){
            introtext.removeKeyListener(listener);
        }
        introtext.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyPressed(java.awt.event.KeyEvent e) {
                if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
                    playScenes(scenes,index+1);
                }
            }
        });

        introtext.setFocusable(true);
        introtext.requestFocusInWindow();
    }

    private void typeText(String text){
        new Thread(() -> {
            try{
                for (int i = 0; i < text.length(); i++){
                    String current = introtext.getText() + text.charAt(i);

                    javax.swing.SwingUtilities.invokeLater(() -> {
                        introtext.setText(current);
                    });

                    Thread.sleep(25);

                }

            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        });
    }

//    public  void start(String text){
//        introtext.setText("...\n3\n2\n1");
//
//        new Thread(() -> {
//            try{
//                for (int i = 0; i < text.length(); i++){
//                    String current = introtext.getText() + text.charAt(i);
//
//                    javax.swing.SwingUtilities.invokeLater(() -> {
//                        introtext.setText(current);
//                    });
//
//                    Thread.sleep(2000);
//
//                }
//
//            }
//            catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        });
//
//    }




}

