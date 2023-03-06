public class Contacts {

    private String contactName;
    private int contactNumber;

    public Contacts(String contactName, int contactNumber){
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public String getContactName(){
        return contactName;
    }
    public int getContactNumber(){
        return contactNumber;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }
}
