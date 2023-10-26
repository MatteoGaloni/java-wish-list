package org.lessons.java.christmas;

public class Gift {

    private String recipient;
    private String description;

    public Gift(String recipient, String description) {
        this.recipient = recipient;
        this.description = description;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  "recipient='" + recipient + '\'' +
                ", description='" + description + '\'';
    }
}
