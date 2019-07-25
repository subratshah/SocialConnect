package sample.com.socialconnect.model;

public class App {
    Integer image;
    String id;
    String status;
    String app;

    public App(Integer image, String id, String status, String app) {
        this.image = image;
        this.id = id;
        this.status = status;
        this.app = app;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }
}
