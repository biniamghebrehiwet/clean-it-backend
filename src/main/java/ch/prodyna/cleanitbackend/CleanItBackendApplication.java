package ch.prodyna.cleanitbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The CleanItBackendApplication class is the starting point of the project. It bootstraps the project as a spring boot application
 *
 * @author  Biniam Ghebrehiwet
 * @version 1.0
 * @since   22.06.2022
 */
@SpringBootApplication
public class CleanItBackendApplication {

    /**
     * This method starts the application using specific arguments
     * @param args arguments to start the app
     */
    public static void main(String[] args) {
        SpringApplication.run(CleanItBackendApplication.class, args);
    }

}
