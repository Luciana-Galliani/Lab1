package it.polito.tdp.Lab01;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.Lab01.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnInserisci;

    @FXML
    private Button btnReset;
    
    @FXML
    //aggiungo
    private Button btnCancella;

    @FXML
    private TextField txtParola;

    @FXML
    private TextArea txtResult;
    
    @FXML
    //aggiungo
    private TextArea txtTempo;

    @FXML
    void doInsert(ActionEvent event) {
    	long tempo1= System.nanoTime();
    	String s="";
    	String parola= this.txtParola.getText();
    	elenco.addParola(parola);
    	for(String str: elenco.getElenco()) {
    		if(s!="")
    			s+="\n";
    		s+= str;
    	this.txtResult.setText(s);
    	}
    	long tempo2= System.nanoTime();
    	long differenza= tempo2-tempo1;
    	this.txtTempo.appendText(differenza+"\n");

    }

    @FXML
    void doReset(ActionEvent event) {
    	this.txtResult.clear();
    	this.txtTempo.clear();
    	this.txtParola.clear();
    	elenco.reset();

    }
    
    @FXML
    void doCancella(ActionEvent event) {
    	long tempo1= System.nanoTime();
    	String s="";
    	String selezionato= this.txtResult.getSelectedText();
    	for(String str: elenco.getLista(selezionato)) {
    		if(s!="")
    			s+="\n";
    		s+= str;
    	this.txtResult.setText(s);
    	long tempo2= System.nanoTime();
    	long differenza= tempo2-tempo1;
    	this.txtTempo.appendText(differenza+"\n");
    	}
    	
    }

    @FXML
    void initialize() {
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTempo != null : "fx:id=\"txtTempo\" was not injected: check your FXML file 'Scene.fxml'.";
        
        elenco = new Parole() ;
    }

}
