import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    Menu(){
    super("File page");
    setVisible(true);
    setSize(400,350);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);
    setLocationRelativeTo(null);
    JMenu mnuSave=new JMenu("Save");
    JMenuItem mniFull= new JMenuItem("Full"); 
    JMenuItem mniSingle=new JMenuItem("Single");
    JMenu mnuView=new JMenu("View");
    JMenuItem mniWhole=new JMenuItem("Maximize");
    JMenuItem mniNormal=new JMenuItem("Medium");
    JMenuItem mniMinimize=new JMenuItem("Minimize");
    JMenu mnuEdit=new JMenu("Edit");
    JMenuItem mniSelect=new JMenuItem("Selected");
    JMenuItem mniEvery=new JMenuItem("Everything");
    JMenu mnuNext =new JMenu("Next");
    
    menuBar.add(mnuSave);
     menuBar.add(mnuView);
      menuBar.add(mnuEdit);
    
     
    mnuSave.add(mniFull);
    mnuSave.add(mniSingle);
    mnuSave.add(mnuNext);
    mnuView.add(mniWhole);
    mnuView.add(mniNormal);
    mnuView.add(mniMinimize);
    mnuEdit.add(mniSelect);
    mnuEdit.add(mniEvery);
    
}
    public static void main(String[] args){
    new Menu();    
}
    
}