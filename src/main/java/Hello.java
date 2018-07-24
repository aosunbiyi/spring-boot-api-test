
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Hello {

    @RequestMapping("/")
    String home() {
        return "Hello World";
    }

    public  static void main(String[] args) {
        SpringApplication.run(Hello.class, args);
    }

}

//mvn clean install spring-boot:repackage