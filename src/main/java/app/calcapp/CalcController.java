package app.calcapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class CalcController {

    private String operator = ""; // 연산자 뭐 눌렀는지 알아야 하니까.
    private int a = 0; // 최초 숫자
    private Model model = new Model();


    @FXML
    private Text result;

    @FXML
    private void operand(ActionEvent event) {
        result.setText(result.getText() + ((Button) event.getSource()).getText());
    }

    @FXML
    private void operator(ActionEvent event) {
        if (((Button) event.getSource()).getText().equals("=")) {
            result.setText(model.calculate(operator, a, Integer.parseInt(result.getText())) + "");
            //빈 문자열 더함으로써 다시 문자형태로 변환
        } else {
            operator = ((Button) event.getSource()).getText();
            a = Integer.parseInt(result.getText());
            result.setText(""); // 공백 문자열 넣어주기
        }
    }
}
