package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import sample.Model.Datasource;

public class NewStudentDialogController {
    @FXML
    private TextField studentFirstNameTextField;
    @FXML
    private TextField studentMiddleNameTextField;
    @FXML
    private TextField studentLastNameTextField;
    @FXML
    private TextField studentEmailTextField;
    @FXML
    private TextField studentLoginIdTextField;
    @FXML
    private TextField studentLoginPasswordTextField;

    public void createNewStudent() {
        // Create student
        Datasource.datasource.createStudent(studentFirstNameTextField.getText(), studentMiddleNameTextField.getText(), studentLastNameTextField.getText(), studentEmailTextField.getText(), studentLoginIdTextField.getText(), studentLoginPasswordTextField.getText());
    }
}
