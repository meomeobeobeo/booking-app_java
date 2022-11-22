package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class control_panel extends JFrame {
    private JButton patientsInformationButton;
    private JButton doctorInformationButton;
    private JButton registerButton;
    private JPanel control_main_panel;

    public JPanel getControl_main_panel() {
        return control_main_panel;
    }

    public JButton getPatientsInformationButton() {
        return patientsInformationButton;
    }

    public JButton getDoctorInformationButton() {
        return doctorInformationButton;
    }

    public JButton getRegisterButton() {
        return registerButton;
    }


    public control_panel(){
        this.setContentPane(control_main_panel);


        /*
        patientsInformationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("patients");

            }
        });
        doctorInformationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("doctor");
            }
        });
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("register");
            }
        });
        */
    }
}
