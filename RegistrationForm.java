import java.awt.*;
import java.awt.event.*;
// Created By Vanshit Aggarwal
public class RegistrationForm extends Frame {
    // Create labels, text fields, and a button
    Label nameLabel = new Label("Name:");
    TextField nameField = new TextField(30);
    Label genderLabel = new Label("Gender:");
    CheckboxGroup genderGroup = new CheckboxGroup();
    Checkbox maleCheckbox = new Checkbox("Male", genderGroup, false);
    Checkbox femaleCheckbox = new Checkbox("Female", genderGroup, false);
    Label emailLabel = new Label("Email:");
    TextField emailField = new TextField(30);
    Label subjectsLabel = new Label("Subjects:");
    Choice subjectsChoice = new Choice();
    Label passwordLabel = new Label("Password:");
    TextField passwordField = new TextField(30);
    Button submitButton = new Button("Submit");

    public RegistrationForm() {
        // Set the layout to FlowLayout
        setLayout(new FlowLayout());

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(genderLabel);
        add(maleCheckbox);
        add(femaleCheckbox);
        add(emailLabel);
        add(emailField);

        // Add subjects to the Choice
        subjectsChoice.add("Math");
        subjectsChoice.add("Science");
        subjectsChoice.add("History");
        subjectsChoice.add("English");
        add(subjectsLabel);
        add(subjectsChoice);

        add(passwordLabel);
        add(passwordField);
        add(submitButton);

        // Add an action listener to the submit button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle the form submission here
                String name = nameField.getText();
                String gender = maleCheckbox.getState() ? "Male" : "Female";
                String email = emailField.getText();
                String selectedSubjects = subjectsChoice.getSelectedItem();
                String password = passwordField.getText();

                // You can perform further processing here, e.g., saving data to a database
                System.out.println("Name: " + name);
                System.out.println("Gender: " + gender);
                System.out.println("Email: " + email);
                System.out.println("Subjects: " + selectedSubjects);
                System.out.println("Password: " + password);
            }
        });

        // Set the frame properties
        setTitle("Registration Form");
        setSize(400, 250);
        setVisible(true);

        // Add a WindowAdapter to handle window close events
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}   

