package arrays.block.three;

import java.util.Date;

/**
 * Created by Vitalii Kocherga on 18.04.2016.
 */
public class NbookEntry {

    private String lastName;
    private String firstName;
    private String patronymic;
    private String nickName;
    private Group group;
    private String comment;
    private String homePhone;
    private String mobPhone;
    private String email;
    private String skypeLogin;
    private String address;
    private Date addDate;
    private Date correctionDate;

    public NbookEntry() {
        this.lastName = "NA";
        this.firstName = "NA";
        this.patronymic = "NA";
        this.nickName = "NA";
        this.group = Group.OTHER;
        this.comment = "NA";
        this.homePhone = "NA";
        this.mobPhone = "NA";
        this.email = "NA";
        this.skypeLogin = "NA";
        this.address = "NA";
        this.addDate = new Date();
        this.correctionDate = new Date();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobPhone() {
        return mobPhone;
    }

    public void setMobPhone(String mobPhone) {
        this.mobPhone = mobPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkypeLogin() {
        return skypeLogin;
    }

    public void setSkypeLogin(String skypeLogin) {
        this.skypeLogin = skypeLogin;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Date getCorrectionDate() {
        return correctionDate;
    }

    public void setCorrectionDate(Date correctionDate) {
        this.correctionDate = correctionDate;
    }
}
