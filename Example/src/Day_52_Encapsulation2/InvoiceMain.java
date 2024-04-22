package Day_52_Encapsulation2;
import javax.swing.*;
public class InvoiceMain {
    public static void main(String[] args) {

        Invoice iphone = new Invoice("Iphone", 1500, 3);
        System.out.println(iphone.getTotalPrice());
        Invoice android = new Invoice("Samsung", 1000, 5);
        System.out.println(android.getTotalPrice());

        System.out.println(iphone);
        System.out.println(android);
        JOptionPane.showMessageDialog(null, "Your result is : " + iphone);
        JOptionPane.showMessageDialog(null, "Your result is : " + android);

    }
}
