class Contacts {
    private ContactInfo[] contactInfo;
    private int totalContacts;

    Contacts(int totalContacts) {
        this.contactInfo = new ContactInfo[totalContacts];
        this.totalContacts = totalContacts;
    }

    void setContactInfo(int i,ContactInfo contactInfo){
        this.contactInfo[i] = contactInfo;
    }

    ContactInfo getContactInfo(int i){
        return this.contactInfo[i];
    }
}
