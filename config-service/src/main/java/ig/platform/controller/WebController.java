package ig.platform.controller;

import ig.platform.models.Gallery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class WebController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Environment env;

    @GetMapping()
    public String home() {
        return "from config service";
    }

    @GetMapping("/admin")
    public String homeAdmin() {
        return "This is the admin area of Gallery service running at port: " + env.getProperty("local.server.port");
    }

    @GetMapping("/{id}")
    public Gallery getGallery(@PathVariable final int id) {
        // create gallery object
        Gallery gallery = new Gallery();
        gallery.setId(id);

        // get list of available images
        List<Object> images = restTemplate.getForObject("http://auth-service/images/", List.class);
        gallery.setImages(images);

        return gallery;
    }
}
