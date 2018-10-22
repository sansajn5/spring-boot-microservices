package ig.platform.controller;

import ig.platform.dto.User;
import ig.platform.service.EmailService;
import ig.platform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class WebController {

    @Autowired
    private UserService userService;
    @Autowired
    private EmailService emailService;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/user/", method = RequestMethod.POST)
    public ResponseEntity<String> sendEmail(@RequestBody User user) {
        userService.sendEmail(user);
        return new ResponseEntity<>("Email Successfully sent", HttpStatus.OK);
    }

    @RequestMapping(value = "/email/{toAddress}", method = RequestMethod.POST)
    public ResponseEntity<Void> sendEmail(@PathVariable String toAddress) {
        emailService.sendEmail(toAddress);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
