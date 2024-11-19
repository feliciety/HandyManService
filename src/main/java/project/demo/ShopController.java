package project.demo;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.util.List;

public class ShopController {

    @FXML
    private GridPane gridPane; // Linked to your GridPane in shop.fxml

    public void initialize() {
        // Initialize the product cards
        initializeProductCards();
    }

    private void initializeProductCards() {
        // Fixed number of columns
        final int maxColumns = 3;
        int column = 0;
        int row = 0;

        // Product list with corrected file paths
        List<productCard> products = List.of(
                new productCard("Cordless Drill", getClass().getResource("/project/demo/Images/CordlessDrill.png").toExternalForm(), "$18.20 - $18.75"),
                new productCard("Hand Drill", getClass().getResource("/project/demo/Images/handdrill.png").toExternalForm(), "$15.00 - $16.50"),
                new productCard("Hand Saw", getClass().getResource("/project/demo/Images/handsaw.png").toExternalForm(), "$12.00 - $10.00"),
                new productCard("Hand Vacuum", getClass().getResource("/project/demo/Images/HandVacuum.png").toExternalForm(), "$15.50 - $16.30"),
                new productCard("Helmet", getClass().getResource("/project/demo/Images/helmet.png").toExternalForm(), "$12.85 - $12.70"),
                new productCard("Metal Hand Jigsaw", getClass().getResource("/project/demo/Images/metalhandjigsaw.png").toExternalForm(), "$20.00 - $21.50"),
                new productCard("Metal Shovel", getClass().getResource("/project/demo/Images/metalshovel.png").toExternalForm(), "$10.75 - $11.00"),
                new productCard("Pipe Wrench", getClass().getResource("/project/demo/Images/pipewrench.png").toExternalForm(), "$9.70 - $10.60"),
                new productCard("Rubber Hand Gloves", getClass().getResource("/project/demo/Images/ruberhandgloves.png").toExternalForm(), "$5.00 - $6.50"),
                new productCard("Steel Hammer", getClass().getResource("/project/demo/Images/steelhammer.png").toExternalForm(), "$7.50 - $8.20"),
                new productCard("Steel Plier", getClass().getResource("/project/demo/Images/steelplier.png").toExternalForm(), "$9.70 - $10.60"),
                new productCard("Toolbox", getClass().getResource("/project/demo/Images/toolbox.png").toExternalForm(), "$25.00 - $26.50")
        );

        // Add product cards to GridPane
        for (productCard product : products) {
            VBox productCardVBox = product.createProductCard();
            gridPane.add(productCardVBox, column, row);

            column++;
            if (column == maxColumns) {
                column = 0;
                row++;
            }
        }
    }
}
