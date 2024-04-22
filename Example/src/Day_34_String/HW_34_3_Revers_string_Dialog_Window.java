package Day_34_String;

import javax.swing.*;

public class HW_34_3_Revers_string_Dialog_Window {
    public static void main(String[] args) {

        // переворот строки с диалоговыми окнами
        String str = JOptionPane.showInputDialog("Enter your string");
        String word_end = "";
        for(int i = str.length()-1; i >= 0;i--){
            word_end = word_end + str.charAt(i);
        }
        JOptionPane.showMessageDialog(null, "Your result is : " + word_end);
    }
}
