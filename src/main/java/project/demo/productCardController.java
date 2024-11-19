package project.demo;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;

public class productCardController {

    @FXML
    private ImageView productImage;

    @FXML
    private Label productName;

    @FXML
    private Label productPrice;

    public void setProductDetails(String name, String imagePath, String price) {
        productName.setText(name);
        productImage.setImage(new javafx.scene.image.Image(imagePath));
        productPrice.setText(price);
    }
}
