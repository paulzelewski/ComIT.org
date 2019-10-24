class PersonalInfo {
    private String firstName, lastName, bloodGroup, emergencyContact,emergencyContactNumber;

    PersonalInfo(String firstName, String lastName, String bloodGroup, String emergencyContact,String emergencyContactNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bloodGroup = bloodGroup;
        this.emergencyContact = emergencyContact;
        this.emergencyContactNumber = emergencyContactNumber;
    }

    @Override
    public String toString() {
        return String.format("| %-10s | %-12s | %-10s | %-22s | %-24s",firstName,lastName,bloodGroup,emergencyContact,emergencyContactNumber);
    }
}
