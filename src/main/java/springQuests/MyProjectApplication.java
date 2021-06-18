package springQuests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

@Controller
@SpringBootApplication
public class MyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProjectApplication.class, args);
    }

    @RequestMapping("/doctor/{incarnation}")
    @ResponseBody
    public String doctorWho (@PathVariable("incarnation") int i) {
        if (i >= 0 && i <= 8) {
            throw new ResponseStatusException(HttpStatus.SEE_OTHER, "See Other");
        }
        else if (i >= 9 && i <= 13) {

        }
        else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Question Not Found");
        }
        String name = "";
        switch (i) {
            case 9:
                name = "Christopher Eccleston";
            case 10:
                name = "David Tennant";
            case 11:
                name = "Matt Smith";
            case 12:
                name = "Peter Capaldi";
            case 13:
                name = "Jodie Whittaker";
                break;
        }
        return "{\"number\": " + i + ", \"name\": \"" + name + "\"}";
    }
}
