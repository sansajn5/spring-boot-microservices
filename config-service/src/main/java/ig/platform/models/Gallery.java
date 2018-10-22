package ig.platform.models;

import java.util.ArrayList;
import java.util.List;

public class Gallery {

    public int id;
    public List<Object> images = new ArrayList<>();

    public Gallery() {

    }

    public Gallery(int id, List<Object> list) {
        this.id = id;
        this.images = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Object> getImages() {
        return images;
    }

    public void setImages(List<Object> images) {
        this.images = images;
    }
}
