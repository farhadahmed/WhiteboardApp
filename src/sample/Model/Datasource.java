package sample.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
This class contains a singleton with methods to retrieve and create students, teachers, and classrooms.
 */

public class Datasource {
    public static final String DB_NAME = "whiteboardapp.db";
    public static final String DB_PATH = "jdbc:sqlite:/Users/farhadahmed/repos/Projects/WhiteboardApp/" + DB_NAME;

    public static final String TABLE_STUDENTS = "students";
    public static final String COLUMN_STUDENT_ID = "_id";
    public static final String COLUMN_STUDENT_FIRST_NAME = "first_name";
    public static final String COLUMN_STUDENT_MIDDLE_NAME = "middle_name";
    public static final String COLUMN_STUDENT_LAST_NAME = "last_name";
    public static final String COLUMN_STUDENT_EMAIL = "email";
    public static final String COLUMN_STUDENT_LOGIN_ID = "login_id";
    public static final String COLUMN_STUDENT_LOGIN_PASSWORD = "login_password";
    public static final int INDEX_STUDENT_ID = 1;
    public static final int INDEX_STUDENT_FIRST_NAME = 2;
    public static final int INDEX_STUDENT_MIDDLE_NAME = 3;
    public static final int INDEX_STUDENT_LAST_NAME = 4;
    public static final int INDEX_STUDENT_EMAIL = 5;
    public static final int INDEX_STUDENT_LOGIN_ID = 6;
    public static final int INDEX_STUDENT_LOGIN_PASSWORD = 7;

    public static final String TABLE_TEACHERS = "teachers";
    public static final String COLUMN_TEACHER_ID = "_id";
    public static final String COLUMN_TEACHER_FIRST_NAME = "first_name";
    public static final String COLUMN_TEACHER_MIDDLE_NAME = "middle_name";
    public static final String COLUMN_TEACHER_LAST_NAME = "last_name";
    public static final String COLUMN_TEACHER_EMAIL = "email";
    public static final String COLUMN_TEACHER_LOGIN_ID = "login_id";
    public static final String COLUMN_TEACHER_LOGIN_PASSWORD = "login_password";
    public static final int INDEX_TEACHER_ID = 1;
    public static final int INDEX_TEACHER_FIRST_NAME = 2;
    public static final int INDEX_TEACHER_MIDDLE_NAME = 3;
    public static final int INDEX_TEACHER_LAST_NAME = 4;
    public static final int INDEX_TEACHER_EMAIL = 5;
    public static final int INDEX_TEACHER_LOGIN_ID = 6;
    public static final int INDEX_TEACHER_LOGIN_PASSWORD = 7;

    public static final String TABLE_CLASSROOMS = "classrooms";
    public static final String COLUMN_CLASSROOM_ID = "_id";
    public static final String COLUMN_CLASSROOM_NAME = "classroom_name";
    public static final String COLUMN_CLASSROOM_TEACHER_ID = "teacher_id";
    public static final int INDEX_CLASSROOM_ID = 1;
    public static final int INDEX_CLASSROOM_NAME = 2;
    public static final int INDEX_CLASSROOM_TEACHER_ID = 3;

    public static final int ORDER_BY_NONE = 1;
    public static final int ORDER_BY_ASC = 2;
    public static final int ORDER_BY_DESC = 3;

    private Connection conn;

    private Datasource() {}

    public static Datasource datasource = new Datasource();

    public Datasource getDatasource() {
        return datasource;
    }

    // Open a connection to the db
    public boolean open() {
        try {
            conn = DriverManager.getConnection(DB_PATH);
            return true;
        }
        catch (SQLException e) {
            System.out.println("ERROR connecting to db: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    // Close connection to db
    public void close() {
        try {
            if (conn != null) {
                conn.close();
            }
        }
        catch (SQLException e) {
            System.out.println("ERROR closing connecting to db: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void createStudent(String firstName, String middleName, String lastName, String email, String loginId, String loginPassword) {
        try (Statement statement = conn.createStatement()) {
            statement.execute("INSERT INTO " + TABLE_STUDENTS +
                    " (" + COLUMN_STUDENT_FIRST_NAME + ", " +
                    COLUMN_STUDENT_MIDDLE_NAME + ", " +
                    COLUMN_STUDENT_LAST_NAME + ", " +
                    COLUMN_STUDENT_EMAIL + ", " +
                    COLUMN_STUDENT_LOGIN_ID + ", " +
                    COLUMN_STUDENT_LOGIN_PASSWORD + ") " +
                    "VALUES('" +firstName+"', '"+middleName+"', '"+lastName+"', '"+email+"', '"+loginId+"', '"+loginPassword+"');");
        }
        catch (SQLException e) {
            System.out.println("ERROR creating student: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void createTeacher(String firstName, String middleName, String lastName, String email, String loginId, String loginPassword) {
        try (Statement statement = conn.createStatement()) {
            statement.execute("INSERT INTO " + TABLE_TEACHERS +
                    " (" + COLUMN_TEACHER_FIRST_NAME + ", " +
                    COLUMN_TEACHER_MIDDLE_NAME + ", " +
                    COLUMN_TEACHER_LAST_NAME + ", " +
                    COLUMN_TEACHER_EMAIL + ", " +
                    COLUMN_TEACHER_LOGIN_ID + ", " +
                    COLUMN_TEACHER_LOGIN_PASSWORD + ") " +
                    "VALUES('" +firstName+"', '"+middleName+"', '"+lastName+"', '"+email+"', '"+loginId+"', '"+loginPassword+"');");
        }
        catch (SQLException e) {
            System.out.println("ERROR creating teacher: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void createClassroom(String classroomName, int teacherId) {
        try (Statement statement = conn.createStatement()) {
            statement.execute("INSERT INTO " + TABLE_CLASSROOMS +
                    " (" + COLUMN_CLASSROOM_NAME + ", " +
                    COLUMN_CLASSROOM_TEACHER_ID + ") " +
                    "VALUES('" +classroomName+"', "+teacherId+");");
        }
        catch (SQLException e) {
            System.out.println("ERROR creating classroom: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
