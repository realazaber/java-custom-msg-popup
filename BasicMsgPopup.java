//Simple program that turns user input
//into a pop up message box.

import java.awt.*; //Libraries that make the UI work.
import javax.swing.*;

import java.util.Scanner; //Library to take in user input

public class BasicMsgPopup extends JFrame{

    public BasicMsgPopup(int _x, int _y, int _w, int _h, String _s) { 
        setTitle("Your message"); //Title of the popup box
        setBounds(_x, _y, _w, _h); //Sets the position and size of the ui box, I set the parameters to be the same as the constructor.
        setDefaultCloseOperation(EXIT_ON_CLOSE); //This will make it so when the user closes the dialog box the program ends, saving system resources.
        setVisible(true); //Makes the box actually visible.
        JLabel _j1 = new JLabel (_s); //Creates new UI box.
        
        Font _f1 = _j1.getFont(); //Creates a new Font instance that stores information about the JLabel _j1.
        Font _f2 = new Font (_f1.getName(), Font.BOLD, 100); //Sets the font as bold and size as 100
        _j1.setFont(_f2); //Applies the font to the text.
        add(_j1); //Adds the text to the UI box.
    }

    public static void main(String[] args) {

            Scanner _userInput = new Scanner(System.in); //Creates a scanner so user input is ready.
            System.out.println("Type a message: "); //Prompts the user to input a message.
            String _msg = _userInput.next(); //Takes in the message.
            BasicMsgPopup _popup = new BasicMsgPopup(660, 340, 600, 200, _msg); //Display the message on screen, if you have a 1008p screen this should appear roughly in the middle.
        
    }
}