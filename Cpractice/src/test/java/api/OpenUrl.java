package api;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenUrl {

	public static void main(String[] args) {
 String url = "https://www.google.com"; // Replace with the URL you want to open
        
        try {
            // Create a URI object from the URL string
            URI uri = new URI(url);
            
            // Check if Desktop is supported (works on Windows, macOS, and Linux)
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(uri);
            } else {
                // Desktop is not supported, handle this case
                System.out.println("Desktop is not supported.");
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }


	}


