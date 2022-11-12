package aplication.cadastrobugs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class CadastroBugsController {

    @FXML
    ComboBox<String> box_system;

    @FXML
    ComboBox<String> box_priority;

    @FXML
    private Button buttonClose;

    @FXML
    private Button buttonLimpar;

    @FXML
    private TextField mail;

    @FXML
    private TextField name;

    @FXML
    private TextField titulo;

    @FXML
    private Button buttonOk;

    @FXML
    private TextArea descricao;

    @FXML
    void handleBtnOk(ActionEvent event) {
        // data/hora atual
        LocalDateTime now = LocalDateTime.now();

        // formatar a data
        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd-MM-uuuu");
        String newDate = formatterData.format(now);

        // formatar a hora
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String newHour = formatterHora.format(now);
        String message = "Data: " + newDate;
        message += "\nHora: " + newHour;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Bug Cadastrado com Sucesso!!");
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    void handleBtnLimpar(ActionEvent event) {
        name.setText("");
        mail.setText("");
        titulo.setText("");
        descricao.setText("");
//        Stage stage = (Stage) buttonCancel.getScene().getWindow(); //Obtendo a janela atual
//        stage.close(); //Fechando o Stage
    }

    @FXML
    void handleBtnClose(ActionEvent event) {
        System.exit(0);
    }


}

