package view;

import javax.swing.*;

public class doctor_infor extends JFrame {
    private JPanel doctor_infor_panel;
    private JTextField name_doctor_field;
    private JTextField ace_doctor_field;
    private JTextField level_doctor_field;
    private JTextField work_place_dr_field;
    private JTextField phone_num_dr_field;
    private JTextField email_dr_field;
    private JTextArea descript_doctor_area;
    private JLabel name_doctor_label;
    private JLabel age_doctor_label;
    private JLabel level_doctor_label;
    private JLabel work_place_dr_label;
    private JLabel phone_num_doctor;
    private JLabel email_dr_label;
    private JLabel descrip_doctor;
    private JButton saveButton;
    private JButton clearButton;
    public doctor_infor (){
        this.setContentPane(doctor_infor_panel);
        this.setTitle("doctor infor");
        this.pack();
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
