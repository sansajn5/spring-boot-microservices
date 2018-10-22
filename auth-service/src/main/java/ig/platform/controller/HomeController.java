package ig.platform.controller;

import com.netflix.discovery.converters.Auto;
import ig.platform.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired
    private Environment env;


    @GetMapping()
    private String test() {
        return env.getProperty("local.server.port");
    }


    @RequestMapping("/images")
    public List<Image> getImages() {
        List<Image> images = Arrays.asList(
                new Image(Long.parseLong("1"), "Treehouse of Horror V", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),
                new Image(Long.parseLong("2"), "The Town", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"),
                new Image(Long.parseLong("3"), "The Last Traction Hero", "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112"));
        return images;
    }
}
