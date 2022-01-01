package my.math.pitagorassolver;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField hipotenusa;
    @FXML
    private TextField catetoOp;
    @FXML
    private TextField catetoAdj;

    @FXML
    protected void calculate() {
        System.out.println(hipotenusa.getText());
        System.out.println(catetoOp.getText());
        System.out.println(catetoAdj.getText());

        if(hipotenusa.getText().isEmpty()){
            if(!catetoAdj.getText().isEmpty() && !catetoOp.getText().isEmpty()){
                return; //calculo padrão
            }
        }

    }
}