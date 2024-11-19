package project.demo;

import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

import java.io.IOException;

public class productCard {

    private final String name;
    private final String imagePath;
    private final String price;

    public productCard(String name, String imagePath, String price) {
        this.name = name;
        this.imagePath = imagePath;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getPrice() {
        return price;
    }

    // Creates a VBox (product card) dynamically using ProductCard.fxml
    public VBox createProductCard() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("productCard.fxml"));
            VBox productCard = loader.load();

            // Lookup and set values
            ((ImageView) productCard.lookup("#productImage")).setImage(new Image(imagePath));
            ((Label) productCard.lookup("#productName")).setText(name);
            ((Label) productCard.lookup("#productPrice")).setText(price);

            return productCard;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
