package sample.com.socialconnect.Object;

public class Contact {
    String name;
    String pref;

    private Duo duo;
    private Email email;
    private WhatsApp whatsApp;
    private Viber viber;

    public Contact(String name, String pref) {
        this.name = name;
        this.pref = pref;
    }

    public Duo getDuo() {
        return duo;
    }

    public void setDuo(Duo duo) {
        this.duo = duo;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public WhatsApp getWhatsApp() {
        return whatsApp;
    }

    public void setWhatsApp(WhatsApp whatsApp) {
        this.whatsApp = whatsApp;
    }

    public Viber getViber() {
        return viber;
    }

    public void setViber(Viber viber) {
        this.viber = viber;
    }
}
