package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class register extends JFrame {
    private JTextField doctor_id_field;
    private JTextField registration_day_field;
    private JTextField examination_day_field;
    private JButton registerButton;
    private JButton cancelButton;
    private JLabel patientIdLabel;
    private JLabel doctorIdLabel;
    private JLabel registrationDateLabel;
    private JTextField patient_id_field;
    private JLabel medicalExaminationDayLabel;
    private JPanel register_panel;

    public register(){
        this.setContentPane(register_panel);
        this.setTitle("register infor");
        this.pack();
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
