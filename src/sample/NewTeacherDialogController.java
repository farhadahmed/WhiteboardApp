package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import sample.Model.Datasource;

public class NewTeacherDialogController {
    @FXML
    private TextField teacherFirstNameTextField;
    @FXML
    private TextField teacherMiddleNameTextField;
    @FXML
    private TextField teacherLastNameTextField;
    @FXML
    private TextField teacherEmailTextField;
    @FXML
    private TextField teacherLoginIdTextField;
    @FXML
    private TextField teacherLoginPasswordTextField;

    public void createNewTeacher() {
        // Create teacher
        Datasource.datasource.createTeacher(teacherFirstNameTextField.getText(), teacherMiddleNameTextField.getText(), teacherLastNameTextField.getText(), teacherEmailTextField.getText(), teacherLoginIdTextField.getText(), teacherLoginPasswordTextField.getText());
    }
}
