package springQuests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// Systematically created in a new Spring Boot project.
// It is the entry point through which the program will start when it is launched

@Controller //For mapping to be taken into account
@SpringBootApplication
// this annotation allows Spring to automatically configure itself according to
// the project dependencies described in the pom.xml
//@Configuration + @ComponentScan + @EnableAutoConfiguration
public class MyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProjectApplication.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        {
            return "  <ul>\n" +
                    "    <li><a href='http://localhost:8080/doctor/1'>First Doctor</a></li>\n" +
                    "    <li><a href='http://localhost:8080/doctor/2'>Second Doctor</a></li>\n" +
                    "    <li><a href='http://localhost:8080/doctor/3'>Third Doctor</a></li>\n" +
                    "    <li><a href='http://localhost:8080/doctor/4'>Fourth Doctor</a></li>\n" +
                    "  </ul>";
        }
    }

    @RequestMapping("/doctor/1")
    @ResponseBody
    public String firstDoctor () {
                return "William Hartnell";
    }

    @RequestMapping("/doctor/2")
    @ResponseBody
    public String secondDoctor () {
                return "Patrick Troughton";
    }

    @RequestMapping("/doctor/3")
    @ResponseBody
    public String thirdDoctor () {
                return "Jon Pertwee";
    }

    @RequestMapping("/doctor/4")
    @ResponseBody
    public String fourthDoctor () {
                return "Tom Baker";
    }

}
