package application.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mediaNotaController {

    @FXML private TextField txtNota1;
    @FXML private TextField txtNota2;
    @FXML private TextField txtNota3;
    @FXML private TextField txtNota4;
    @FXML private Button btnCalcular;
    @FXML private Label lblResultado;
    
    @FXML
    public void initialize() {
    	btnCalcular.setOnAction(e->{media();});
    }
    
    private void media() {
    	double nota1=Double.valueOf(txtNota1.getText()),
    	nota2=Double.valueOf(txtNota2.getText()),
    	nota3=Double.valueOf(txtNota3.getText()),
    	nota4=Double.valueOf(txtNota4.getText()),
    	media;
    	
    	media=(nota1+nota2+nota3+nota4)/4;
    	
    	lblResultado.setText("A média das notas é : "+
    	String.valueOf(media));   	   	
    	
    }

}
