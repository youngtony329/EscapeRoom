import javax.swing.*;


public class EscapeRoomGUI {

    static JPanel panel;
    static String storyline;

  

    public static void main(String[] args) {new EscapeRoom();}

        public void EscapeRoom(){

        JFrame frame = new JFrame("Escape Room");
        frame.setSize(300,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


        panel = new JPanel();
        storyline = "It’s been all over the news. There was a brutal stabbing with no evidence other than a police sketch based on the " +
                "only witness’ description of the perp. You are the town’s newest detective, and this is your very first solo-case. " +
                "You have a hunch as to who the escaped murderer is, only thing is you don’t have any evidence to back that claim up… yet." +
                " Use your sleuth and prowess to collect definitive proof he’s your guy and get out of there before he gets home." +
                "Hurry! You only have 20 minutes before he discovers you snooping in his things and makes you his next victim.";






        }

    }

