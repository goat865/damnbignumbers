package com.example.damnbignumbers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML public TextField display;

    private DamnBigNumber a = DamnBigNumber.DBN_ZERO;
    private DamnBigNumber b = DamnBigNumber.DBN_ZERO;
    private char operation = '+';

    public void handleAddClick() {
        String displayNumStr = display.getText();
        a = new DamnBigNumber(displayNumStr);
        operation = '+';
    }

    public void handleEqualsClick() {
        String displayNumStr = display.getText();
        b = new DamnBigNumber(displayNumStr);

        switch (operation) {
            case '+':
                DamnBigNumber c = DamnBigNumbers.add(a, b);
                display.setText(c.getNumStr());
                break;

            case '-':

                break;

            case '*':

                break;

            case '/':

                break;
        }
    }

    public void handleDigitClick(ActionEvent actionEvent) {
        Button src = (Button) actionEvent.getSource();
        String value = src.getText();
        int digit = Integer.parseInt(value);
        display.setText(display.getText() + value);
    }
}
