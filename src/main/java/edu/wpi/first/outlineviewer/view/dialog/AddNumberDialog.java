package edu.wpi.first.outlineviewer.view.dialog;

import javafx.scene.Node;
import javafx.scene.control.TextField;

/**
 * A dialog for adding or editing number entries in network tables.
 */
public class AddNumberDialog extends AddEntryDialog<Double> {

  private TextField numberField;

  public AddNumberDialog() {
    super("Number");
    getDialogPane().getStyleClass().add("add-number-dialog");
  }

  @Override
  protected Node createCustomControl() {
    numberField = new TextField("0.0");
    numberField.setId("numberField");
    return numberField;
  }

  @Override
  protected Double getData() {
    try {
      return Double.parseDouble(numberField.getText());
    } catch (NumberFormatException ex) {
      return null;
    }
  }

}
