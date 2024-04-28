package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class AddBookControlor implements Initializable{

    @FXML
    private Pane TableView;

    @FXML
    private TextField tfLastName;

    @FXML
    private TextField tfFirstName;

    @FXML
    private TextField tfEmail;

    @FXML
    private Button addBtn;

    @FXML
    private TableView<Person> table;

    @FXML
    private TableColumn<Person, String> lastNameCol;

    @FXML
    private TableColumn<Person, String> firstNameCol;

    @FXML
    private TableColumn<Person, String> emailCol;

    @FXML
    private Button removeBtn;

    @FXML
    private Button importBtn;

    @FXML
    private Button exportBtn;

    @FXML
    private Button quitBtn;

}
 
   public void add(){
	   String nom=tfLastName.getText();
	   String prenom=tfFirstName.getText();
	    String  email=tfEmail.getText();
	    table.getItems().add(new Person(nom,prenom,email));

	   
    	
    }
   
	@Override
	public void initialize() {
		lastNameCol.setCellValueFactory(new PropretyVallueFactory("nom"));
	}


}