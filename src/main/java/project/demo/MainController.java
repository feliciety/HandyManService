package project.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainController {

    @FXML
    private ScrollPane scrollPane; // ScrollPane in MainPageStructure.fxml

    // Method to dynamically load an FXML file into the ScrollPane
    private void loadPage(String fxmlFile) {
        try {
            // Load the new page
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            AnchorPane newPage = loader.load();

            // Replace content inside the ScrollPane
            scrollPane.setContent(newPage);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to load page: " + fxmlFile);
        }
    }

    // Called automatically after FXML is loaded
    @FXML
    private void initialize() {
        // Load the default HomePage.fxml when the application starts
        loadPage("/project/demo/FXML/HomePage.fxml");
    }

    // Button click handlers for navigation
    @FXML
    private void handleHomeClick() {
        loadPage("/project/demo/FXML/HomePage.fxml");
    }

    @FXML
    private void handleAboutUsClick() {
        loadPage("/project/demo/FXML/AboutUs.fxml");
    }

    @FXML
    private void handleShopClick() {
        loadPage("/project/demo/FXML/Shop.fxml");
    }

    @FXML
    private void handleServiceClick() {
        loadPage("/project/demo/FXML/Services.fxml");
    }

    @FXML
    private void handleBookServiceClick() {
        loadPage("/project/demo/FXML/bookServices.fxml");
    }
}
