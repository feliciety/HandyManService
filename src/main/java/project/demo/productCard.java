package project.demo;

import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;

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

    // Creates a VBox (product card) dynamically without a separate controller
    public VBox createProductCard() {
        // Create VBox for product card layout
        VBox productCard = new VBox(10); // 10px spacing

        // Create ImageView for product image
        ImageView productImage = new ImageView(new Image(imagePath));
        productImage.setFitHeight(100);  // You can set the size based on your design
        productImage.setFitWidth(100);

        // Create Labels for product name and price
        Label productName = new Label(name);
        Label productPrice = new Label(price);

        // Add Image and Labels to VBox
        productCard.getChildren().addAll(productImage, productName, productPrice);

        return productCard;
    }
}
