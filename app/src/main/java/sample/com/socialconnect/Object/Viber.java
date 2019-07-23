package sample.com.socialconnect.Object;

import android.media.Image;

public class Viber {
    Image image;
    String viberID;
    String lastSeen;

    public Viber(int image, String viberID, String lastSeen) {
        this.image = image;
        this.viberID = viberID;
        this.lastSeen = lastSeen;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getViberID() {
        return viberID;
    }

    public void setViberID(String viberID) {
        this.viberID = viberID;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }
}
