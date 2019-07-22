package sample.com.socialconnect.Object;

public class Contact {
    String name;
    String pref;

    private Duo duo;
    private Email email;
    private WhatsApp whatsapp;
    private Viber viber;

    public Contact(String name, String pref, Duo duo, Email email, WhatsApp whatsapp, Viber viber) {
        this.name = name;
        this.pref = pref;
        this.duo = duo;
        this.email = email;
        this.whatsapp = whatsapp;
        this.viber = viber;
    }

    public Duo getDuo() {
        return duo;
    }

    public Email getEmail() {
        return email;
    }

    public WhatsApp getWhatsapp() {
        return whatsapp;
    }

    public Viber getViber() {
        return viber;
    }

    public String getName() {
        return name;
    }

    public String getPref() {
        return pref;
    }

    public void setDuo(Duo duo) {
        this.duo = duo;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public void setWhatsapp(WhatsApp whatsapp) {
        this.whatsapp = whatsapp;
    }

    public void setViber(Viber viber) {
        this.viber = viber;
    }
}
