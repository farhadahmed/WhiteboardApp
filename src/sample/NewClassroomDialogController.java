package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import sample.Model.Datasource;

public class NewClassroomDialogController {
    @FXML
    private TextField classroomNameTextField;
    @FXML
    private TextField classroomTeacherIdTextField;

    public void createNewClassroom() {
        // Verify teacherId is int
//        classroomTeacherIdTextField.textProperty().addListener(new ChangeListener<String>() {
//            @Override
//            public void changed(ObservableValue<? extends String> observableValue, String oldValue, String newValue) {
//                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
//                    classroomTeacherIdTextField.setText(oldValue);
//                }
//            }
//        });

        // Create classroom
        Datasource.datasource.createClassroom(classroomNameTextField.getText(), Integer.parseInt(classroomTeacherIdTextField.getText()));
    }
}
