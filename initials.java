import javax.swing.*;
import java.awt.*;

public class initials {
    public static void main(String args[]) {
        String FirstName;
        String LastName;
        String MiddleName;
        JOptionPane paneObject =new JOptionPane();
        FirstName=paneObject.showInputDialog("Enter your first name here: ");
        MiddleName= paneObject.showInputDialog("Enter your second name here: "); 
        LastName=paneObject.showInputDialog("Enter your last name here: "); 
        Frame anything = new Frame(FirstName,MiddleName,LastName);
    }
}

class Frame extends JFrame{
   String FirstName;
   String MiddleName;
   String LastName;
   char   firstChar;
   char   secondChar;
   char   lastChar;

   public Frame(String a,String b,String c){
       this.FirstName=a;
       this.MiddleName=b;
       this.LastName=c;
       firstChar=a.charAt(0);
       secondChar=b.charAt(0);
       lastChar= c.charAt(0);
    
    JOptionPane obj= new JOptionPane();
    obj.showMessageDialog(null,"Your initials are "+ c + " "+firstChar+"."+secondChar);
    
    }
}