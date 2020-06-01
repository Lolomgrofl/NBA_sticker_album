package root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class NbaStickerAlbumApplication {

	public static void main(String[] args) {
		SpringApplication.run(NbaStickerAlbumApplication.class, args);
	}

}
