package info.project.demo_backend.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USER
 */
@RestController
public class UserController {
    
    @GetMapping("/users")
    public List getAllUser() {
        return Arrays.asList("HOlas");
    }
}
