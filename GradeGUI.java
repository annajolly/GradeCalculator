import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class GradeGUI
{ 
  public GradeGUI(String name)
  {
    
    //Check all that apply
    //If necessary, can add component
    //Combo
    JLabel prompt = new JLabel("Check all that apply:");
    
    midtermsButton = new JCheckBox("Midterm(s)");
    midtermsButton.setSelected(true);
    midtermsButton.setEnabled(true);
    
    assignmentsButton = new JCheckBox("Assignment(s)");
    assignmentsButton.setSelected(true);
    assignmentsButton.setEnabled(true);

    papersButton = new JCheckBox("Paper(s)"); 
    papersButton.setSelected(false);
    papersButton.setEnabled(true);

    finalExamButton = new JCheckBox("Final Exam");
    finalExamButton.setSelected(true);
    finalExamButton.setEnabled(true);
    
    finalPaperButton = new JCheckBox("Final Paper");
    finalPaperButton.setSelected(false);
    finalPaperButton.setEnabled(true);

    labsButton = new JCheckBox("Lab(s)");
    labsButton.setSelected(false);
    labsButton.setEnabled(true);
    
    participationsButton = new JCheckBox("Participation(s)");
    participationsButton.setSelected(false);
    participationsButton.setEnabled(true);
      
    JPanel checks = new JPanel();
    checks.setLayout(new GridLayout(1,4));
    checks.add(midtermsButton);
    checks.add(assignmentsButton);
    checks.add(papersButton);
    checks.add(finalExamButton);
    checks.add(finalPaperButton);
    checks.add(labsButton);
    checks.add(participationsButton);
    
    JPanel submitPanel = new JPanel();
    submitPanel.setLayout(new FlowLayout());
    JButton submitButton = new JButton("Submit");
    
    submitPanel.add(submitButton);
    
    JFrame frame = new JFrame();
    frame.setTitle(name);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(prompt, BorderLayout.NORTH);
    frame.add(checks, BorderLayout.CENTER);
    frame.add(submitPanel, BorderLayout.SOUTH);
    frame.pack();
    frame.setVisible(true);
  }
  
  private JCheckBox midtermsButton;
  private JCheckBox assignmentsButton;
  private JCheckBox papersButton;
  private JCheckBox finalExamButton;
  private JCheckBox finalPaperButton;
  private JCheckBox labsButton;
  private JCheckBox participationsButton;
}