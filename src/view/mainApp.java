package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainApp extends JFrame {
    private JPanel mainApp;

    private final control_panel control_panel;
    private final searchForm searchForm;


    public mainApp() {


        control_panel = new control_panel();
        searchForm = new searchForm();
        JPanel control = control_panel.getControl_main_panel();
        control.setLocation(12, 100);
        this.setContentPane(mainApp);
        this.setTitle("main frame");
        this.setSize(900, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.add(control);
        this.add(searchForm.getSearch_panel());


    }

    public static void main(String[] args) {
        mainApp mainApp = new mainApp();

        mainApp.control_panel.getPatientsInformationButton().addActionListener(e -> {
            System.out.println("patients");
            patients_infor_form patients_infor_form = new patients_infor_form();
            patients_infor_form.setLocationRelativeTo(mainApp);


        });
        mainApp.control_panel.getDoctorInformationButton().addActionListener(e -> {

            System.out.println("doctor");
            doctor_infor doctor_infor = new doctor_infor();
            doctor_infor.setLocationRelativeTo(mainApp);
        });
        mainApp.control_panel.getRegisterButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("register");
                register registerForm = new register();
                registerForm.setLocationRelativeTo(mainApp);
            }
        });
    }

    public JPanel getMainApp() {
        return mainApp;
    }

    public view.control_panel getControl_panel() {
        return control_panel;
    }
}
