package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;



public class FXMLDocumentController {
    
    private String crntArthOpt = "ADD";


    @FXML
    private TextField label;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button div;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button mult;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button sub;

    @FXML
    private Button zero;

    @FXML
    private Button equal;

    @FXML
    private Button add;

    @FXML
    
 void handleButtonAction(ActionEvent event) {
        
if( ((Button)event.getSource() ).getText().equals("1") ){
label.setText(label.getText() + "1");
}
if( ((Button)event.getSource() ).getText().equals("2") ){
label.setText(label.getText() + "2");
}
if( ((Button)event.getSource() ).getText().equals("3") ){
label.setText(label.getText() + "3");
}
if( ((Button)event.getSource() ).getText().equals("4") ){
label.setText(label.getText() + "4");
}
if( ((Button)event.getSource() ).getText().equals("5") ){
label.setText(label.getText() + "5");
}
if( ((Button)event.getSource() ).getText().equals("6") ){
label.setText(label.getText() + "6");
}
if( ((Button)event.getSource() ).getText().equals("7") ){
label.setText(label.getText() + "7");
}
if( ((Button)event.getSource() ).getText().equals("8") ){
label.setText(label.getText() + "8");
}
if( ((Button)event.getSource() ).getText().equals("9") ){
label.setText(label.getText() + "9");
}
if( ((Button)event.getSource() ).getText().equals("0") ){
label.setText(label.getText() + "0");
}


    }
 
  void MultiNums(ActionEvent event) {

    crntArthOpt ="MULTI";

  }
  
  void addNums(ActionEvent event) {

    crntArthOpt="ADD";

  }
  
 void subNums(ActionEvent event) {

    crntArthOpt="SUBTRACT";

  }  
  
  void divNums(ActionEvent event) {

    crntArthOpt="DIVIDE";

  }

    void processOprtn(ActionEvent event) {

        String answer = label.getText();
        int num1 = Integer.parseInt(answer);
        int num2 = Integer.parseInt(answer);
        
            if(crntArthOpt.equals("ADD"))

       label.setText( "" + ( num1 + num2 ) );
            
            if (crntArthOpt.equals("MULTI"))

       label.setText( "" + ( num1 * num2 ) );

            if (crntArthOpt.equals("SUBTRACT"))

       label.setText( "" + ( num1 - num2 ) );            
            
            if (crntArthOpt.equals("DIVIDE"))

       label.setText( "" + ( num1 / num2 ) );
  
    }
}
