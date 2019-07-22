package sample.com.socialconnect.Object;

public class WhatsApp {
    String name;
    boolean status;

    public WhatsApp(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public boolean isStatus() {
        return status;
    }
}
