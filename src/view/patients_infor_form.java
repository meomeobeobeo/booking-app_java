package view;

import view.rules.text_field_rules;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class patients_infor_form extends JFrame {

    private JPanel patient_infor;
    private JTextField patient_name_field;
    private JTextField address_patient_field;
    private JTextField phone_number_field;
    private JTextField email_patient_field;
    private JButton saveButton;
    private JButton clearButton;
    private JLabel fullNameOfPatientLabel;
    private JLabel addressOfPatientLabel;
    private JLabel phoneNumberLabel;
    private JLabel emailLabel;

    public JPanel getPatient_infor() {
        return patient_infor;
    }

    public patients_infor_form(){
        this.setContentPane(patient_infor);
        this.setTitle("patient infor");
        this.pack();
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String patient_name_fieldText =  patient_name_field.getText();
                String address_patient_fieldText = address_patient_field.getText();
                String phone_number_fieldText = phone_number_field.getText();
                String email_patient_fieldText = email_patient_field.getText();
                ArrayList<String> err = new ArrayList<String>();



               // check
                text_field_rules rules = new text_field_rules();
                boolean check_required = rules.check_required(patient_name_fieldText)
                        && rules.check_required(patient_name_fieldText)
                        && rules.check_required(phone_number_fieldText)
                        && rules.check_required(email_patient_fieldText) ;;
                boolean check_email = rules.check_isMail(email_patient_fieldText);
                boolean check_number = rules.check_number(phone_number_fieldText);
                AtomicReference<String> errors = new AtomicReference<>("");
                if(!check_required){
                    JOptionPane.showMessageDialog(patient_infor,"Please enter enough information.");
                }
                else {
                    if(!check_email){
                        err.add("Error in email");
                    }
                    if(!check_number){
                        err.add("This is not phone number.");
                    }
                    err.forEach((x) -> {
                        errors.set(errors + " && " + x);
                    });
                }
                if (check_email && check_number && check_required){
                    System.out.println("save");
                    /// call method to save in database
                }
                else{
                    JOptionPane.showMessageDialog(patient_infor,errors);
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new patients_infor_form();
    }
}
