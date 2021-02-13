package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;

import java.io.IOException;
import java.util.Optional;

public class Controller {
    public void showCreateStudentDialog(ActionEvent actionEvent) {
//        Dialog<ButtonType> dialog = new Dialog<>();
//        // initOwner() sets an owner for the dialog we want to create.
//        dialog.initOwner(mainBorderPane.getScene().getWindow());
//
//        // FXMLLoader is used to load fxml files.
//        FXMLLoader fxmlLoader = new FXMLLoader();
//        fxmlLoader.setLocation(getClass().getResource("newNoteDialog.fxml"));
//
//        try {
//            dialog.getDialogPane().setContent(fxmlLoader.load());
//        }
//        catch (IOException e) {
//            System.out.println("IOException: Couldn't load New Note Dialog");
//            e.printStackTrace();
//        }
//
//        // Adding OK and CANCEL buttons to dialog pane
//        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
//        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
//
//        Optional<ButtonType> result = dialog.showAndWait();
//
//        if (result.isPresent() && result.get() == ButtonType.OK) {
//            DialogController controller = fxmlLoader.getController();
//            controller.processNewNote();
//
//            // Reset the contents of <ListView> with the ArrayList from NoteService which now contains
//            // the new note object created by processNewNot()
//            notesListView.getItems().setAll(NoteService.getInstance().getNotes());
//            System.out.println("New note created!");
//        }
//        else {
//            System.out.println("New note cancelled...");
//        }
    }

    public void showCreateTeacherDialog(ActionEvent actionEvent) {
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
