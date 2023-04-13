import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
    Project() {
        setSize(1540, 850);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/college.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);

        add(image);
        JMenuBar mb = new JMenuBar();

        // New Information
        JMenu newInformation = new JMenu("New Information");
        mb.add(newInformation);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        newInformation.add(facultyInfo);

        JMenuItem StudentInfo = new JMenuItem("New Student Information");
        StudentInfo.setBackground(Color.WHITE);
        newInformation.add(StudentInfo);

        // Details
        JMenu details = new JMenu("View Details");
        mb.add(details);

        JMenuItem facultyDetail = new JMenuItem("View Faculty Details");
        facultyDetail.setBackground(Color.WHITE);
        details.add(facultyDetail);

        JMenuItem StudentDetail = new JMenuItem("View Student Details");
        StudentDetail.setBackground(Color.WHITE);
        details.add(StudentDetail);

        // Leave
        JMenu Leave = new JMenu("Apply Leave");
        mb.add(Leave);

        JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
        facultyLeave.setBackground(Color.WHITE);
        Leave.add(facultyLeave);

        JMenuItem StudentLeave = new JMenuItem("Student Leave");
        StudentLeave.setBackground(Color.WHITE);
        Leave.add(StudentLeave);

        // LeaveDetail
        JMenu LeaveDetails = new JMenu("Leave Details");
        mb.add(LeaveDetails);

        JMenuItem facultyLeaveDetails = new JMenuItem("Faculty Leave Details");
        facultyLeaveDetails.setBackground(Color.WHITE);
        LeaveDetails.add(facultyLeaveDetails);

        JMenuItem StudentLeaveDetails = new JMenuItem("Student Leave Details");
        StudentLeaveDetails.setBackground(Color.WHITE);
        LeaveDetails.add(StudentLeaveDetails);

        // Exams
        JMenu exam = new JMenu("Examination");
        mb.add(exam);

        JMenuItem examinationDetails = new JMenuItem("Examination Results");
        examinationDetails.setBackground(Color.WHITE);
        exam.add(examinationDetails);

        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        exam.add(entermarks);

        // UpdateInfo
        JMenu updateinfo = new JMenu("Update Details");
        mb.add(updateinfo);

        JMenuItem updatefacultyInfo = new JMenuItem("Update Faculty Details");
        updatefacultyInfo.setBackground(Color.WHITE);
        updateinfo.add(updatefacultyInfo);

        JMenuItem updateStudentInfo = new JMenuItem("Update Student Details");
        updateStudentInfo.setBackground(Color.WHITE);
        updateinfo.add(updateStudentInfo);

         // fee
         JMenu fee = new JMenu("Fee Details");
         mb.add(fee);
 
         JMenuItem feestructure = new JMenuItem("Fee Structure");
         feestructure.setBackground(Color.WHITE);
         fee.add(feestructure);
 
         JMenuItem feeform = new JMenuItem("Student Fee Form");
         feeform.setBackground(Color.WHITE);
         fee.add(feeform);

         // Utility
         JMenu utility = new JMenu("Utility");
         mb.add(utility);
 
         JMenuItem notepad = new JMenuItem("Notepad");
         notepad.setBackground(Color.WHITE);
         notepad.addActionListener(this);
         utility.add(notepad);
 
         JMenuItem calculator = new JMenuItem("Calculator");
         calculator.setBackground(Color.WHITE);
         calculator.addActionListener(this);
         utility.add(calculator);

         // Exit
         JMenu exit = new JMenu("Exit");
         mb.add(exit);
 
         JMenuItem ex = new JMenuItem("Exit");
         ex.setBackground(Color.WHITE);
         ex.addActionListener(this);
         exit.add(ex);
  

        setJMenuBar(mb);

        setVisible(true);
    }
    public void actionPerfomed(ActionEvent ae){
         String msg = ae.getActionCommand();

         if(msg.equals("Exit")){
            setVisible(false);
         }else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){

            }
         }else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){

            }
         }
    }
    public static void main(String args[]) {
        new Project();
    }
}
