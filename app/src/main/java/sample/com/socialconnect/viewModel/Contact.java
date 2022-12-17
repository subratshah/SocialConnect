package sample.com.socialconnect.viewModel;

public class Contact {

    String name;
    String viberId;
    String lastSeen;
    String email;
    String app;
    int contact_type;
    int image;
    String availability;


    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getViberId() {
        return viberId;
    }

    public void setViberId(String viberId) {
        this.viberId = viberId;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApp() {
        return app.toUpperCase().concat(" NOT SUPPORTED");
    }

    public void setApp(String app) {
        this.app = app;
        switch (app.toLowerCase().trim()) {
            case "duo":
                contact_type = 1;
                break;

            case "email":
                contact_type = 2;
                break;

            case "whatsapp":
                contact_type = 3;
                break;

            case "viber":
                contact_type = 4;
                break;

            default:
                contact_type = 0;
                break;
        }
    }

    public int getContact_type() {
        return contact_type;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}