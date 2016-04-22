package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.AnagrammiModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnagrammiController {
	
	private AnagrammiModel model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private TextArea txtResult;

    @FXML
    void doAnagramma(ActionEvent event) {

    	String s = txtParola.getText();
    	if(s.length()==0)
    	{
    		txtResult.setText("Inserire parola.");
    		return;
    	}
    	
    	List<String> permutazioni = new ArrayList<String>();
    	permutazioni = model.permutation(s);
    	
    	String result="";
    	for(String st: permutazioni)
    	{
    		if(model.ifEsistente(st))
    		{
    			result += st;
    		}
    		else
    		{
    			result += st; //in rosso
    		}
    	}
    	txtResult.setText(result);
    	
    }

    @FXML
    void doReset(ActionEvent event) {

    	txtParola.clear();
    	txtResult.clear();
    	model.getPermutazioni().clear();
    }

    public void setModel(AnagrammiModel model) {
    	this.model=model;
    }
    
    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Anagrammi.fxml'.";

        model = new AnagrammiModel();
    }
}
