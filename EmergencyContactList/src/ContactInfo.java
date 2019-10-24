class ContactInfo {
    private PersonalInfo personalInfo;
    private String cellNo, email;
    private Address address;

    ContactInfo(PersonalInfo info, String cellNo, String email, Address address) {
        this.personalInfo = info;
        this.cellNo = cellNo;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return personalInfo.toString() +
                String.format(" | %-12s | %-40s",cellNo,email) +
                address.toString();
    }
}
