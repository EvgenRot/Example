package Day_34_String;

import javax.swing.*;

public class HW_34_3_Revers_string_Dialog_Window {
    public static void main(String[] args) {

        // переворот строки с диалоговыми окнами
        String str = JOptionPane.showInputDialog("Enter your string");

        JOptionPane.showConfirmDialog(null,
                "choose one", "choose one", JOptionPane.YES_NO_OPTION);

        Object[] options = { "OK", "CANCEL" };
        JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);

        Object[] possibleValues = { "First", "Second", "Third" };
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Choose one", "Input",
                JOptionPane.INFORMATION_MESSAGE, null,
                possibleValues, possibleValues[0]);

        String word_end = "";
        for(int i = str.length()-1; i >= 0;i--){
            word_end = word_end + str.charAt(i);
        }
        JOptionPane.showMessageDialog(null, "Your result is : " + word_end);
    }
}
