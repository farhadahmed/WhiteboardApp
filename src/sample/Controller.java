package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Optional;

public class Controller {
    @FXML
    private BorderPane mainBorderPane;

    public void showCreateStudentDialog(ActionEvent actionEvent) {
        Dialog<ButtonType> dialog = new Dialog<>();
        // initOwner() sets an owner for the dialog we want to create.
        dialog.initOwner(mainBorderPane.getScene().getWindow());

        // FXMLLoader is used to load fxml files.
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("new-student-dialog.fxml"));

        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        }
        catch (IOException e) {
            System.out.println("IOException: Couldn't load New Student Dialog");
            e.printStackTrace();
        }

        // Adding OK and CANCEL buttons to dialog pane
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.OK) {
            NewStudentDialogController controller = fxmlLoader.getController();
            controller.createNewStudent();

            System.out.println("New student created!");
        }
        else {
            System.out.println("New student cancelled...");
        }
    }

    public void showCreateTeacherDialog(ActionEvent actionEvent) {
        Dialog<ButtonType> dialog = new Dialog<>();
        // initOwner() sets an owner for the dialog we want to create.
        dialog.initOwner(mainBorderPane.getScene().getWindow());

        // FXMLLoader is used to load fxml files.
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("new-teacher-dialog.fxml"));

        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        }
        catch (IOException e) {
            System.out.println("IOException: Couldn't load New Student Dialog");
            e.printStackTrace();
        }

        // Adding OK and CANCEL buttons to dialog pane
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.OK) {
            NewTeacherDialogController controller = fxmlLoader.getController();
            controller.createNewTeacher();

            System.out.println("New teacher created!");
        }
        else {
            System.out.println("New teacher cancelled...");
        }
    }

    public void showCreateClassroomDialog(ActionEvent actionEvent) {
    }

    public void closeApplication(ActionEvent actionEvent) {
    }

    public void getStudents(ActionEvent actionEvent) {
    }

    public void getTeachers(ActionEvent actionEvent) {
    }

    public void getClassrooms(ActionEvent actionEvent) {
    }
}
