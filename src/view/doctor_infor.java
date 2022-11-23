package view;

import view.rules.text_field_rules;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

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
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name_doctor_fieldText = name_doctor_field.getText();
                String ace_doctor_fieldText = ace_doctor_field.getText();
                String level_doctor_fieldText = level_doctor_field.getText();
                String work_place_dr_fieldText = work_place_dr_field.getText();
                String phone_num_dr_fieldText = phone_num_dr_field.getText();
                String email_dr_fieldText = email_dr_field.getText();
                String descript_doctor_areaText = descript_doctor_area.getText();


                text_field_rules rules = new text_field_rules();
                boolean check_isRequired = rules.check_required(name_doctor_fieldText)
                        && rules.check_required(ace_doctor_fieldText)
                        && rules.check_required(level_doctor_fieldText)
                        && rules.check_required(work_place_dr_fieldText)
                        && rules.check_required(phone_num_dr_fieldText)
                        && rules.check_required(email_dr_fieldText)
                        && rules.check_required(descript_doctor_areaText);
                boolean check_isEmail = rules.check_isMail(email_dr_fieldText);
                boolean check_isPhoneNum = rules.check_number(phone_num_dr_fieldText);
                boolean check_isAge = rules.check_isAge(ace_doctor_fieldText);

                ArrayList<String> err = new ArrayList<String>();
                AtomicReference<String> errors = new AtomicReference<>("");


                if(!check_isRequired){
                    JOptionPane.showMessageDialog(doctor_infor_panel,"Please enter enough information.");
                }
                else {
                    if(!check_isEmail){
                        err.add("Error in email");
                    }

                    if(!check_isPhoneNum){
                        err.add("This is not phone number.");
                    }
                    // age không hợp lệ
                    if(!check_isAge){
                        err.add("Age is Illegal.");
                    }
                    err.forEach((x) -> {
                        errors.set(errors + " && " + x);
                    });
                }
                if (check_isEmail && check_isRequired && check_isPhoneNum && check_isAge){
                    System.out.println("save");
                    /// call method to save in database
                }
                else{
                    if(err.size() != 0){
                        JOptionPane.showMessageDialog(doctor_infor_panel,errors);
                    }
                }
            }



        });
    }

    public static void main(String[] args) {
        new doctor_infor();
    }
}
