package project.demo;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;

public class productCardController {

    @FXML
    private ImageView productImage;  // ImageView to display product image

    @FXML
    private Label productName;  // Label to display product name

    @FXML
    private Label productPrice;  // Label to display product price

    // Method to initialize the product card with data
    public void initialize(String imagePath, String name, String price) {
        // Set the image for the product card
        Image image = new Image(getClass().getResource(imagePath).toExternalForm());
        productImage.setImage(image);

        // Set the name and price for the product card
        productName.setText(name);
        productPrice.setText(price);
    }
}
