import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML public Button login_btn;
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label alertMsg;

    @FXML
    private void login() {

        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("") || password == null) {
            alertMsg.setText("Access Denied");
        } else {
            MySQL.connect(username, password);
            if (MySQL.getConn() == null) {
                alertMsg.setText("Access Denied");
            } else {
               Main.changeScene("./main_section.fxml");
            }
        }



    }

}
