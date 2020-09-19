package paket.citizen.securityservice.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "USERS", schema = "C##SAMET", catalog = "")
public class UsersEntity{
    private String name;
    private String surname;
    private Long age;
    private String email;
    private String phoneNo;
    private String countryCode;
    private String cityCode;
    private String districtCode;
    private String neighborhoodCode;
    private Long bounty;
    private String createdBy;
    private Timestamp createdDate;
    private String updatedBy;
    private Timestamp updatedDate;
    private Boolean isDeleted;
    private String password;
    private String lastIpAddress;
    private Long wrongEntryCount;
    private Boolean isBlocked;

    @Basic
    @Column(name = "NAME", nullable = true, length = 25)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "SURNAME", nullable = true, length = 20)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "AGE", nullable = true, precision = 0)
    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 60)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Id
    @Column(name = "PHONE_NO", nullable = false, length = 50)
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Basic
    @Column(name = "COUNTRY_CODE", nullable = true, length = 3)
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Basic
    @Column(name = "CITY_CODE", nullable = true, length = 10)
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Basic
    @Column(name = "DISTRICT_CODE", nullable = true, length = 10)
    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    @Basic
    @Column(name = "NEIGHBORHOOD_CODE", nullable = true, length = 10)
    public String getNeighborhoodCode() {
        return neighborhoodCode;
    }

    public void setNeighborhoodCode(String neighborhoodCode) {
        this.neighborhoodCode = neighborhoodCode;
    }

    @Basic
    @Column(name = "BOUNTY", nullable = true, precision = 0)
    public Long getBounty() {
        return bounty;
    }

    public void setBounty(Long bounty) {
        this.bounty = bounty;
    }

    @Basic
    @Column(name = "CREATED_BY", nullable = true, length = 30)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "CREATED_DATE", nullable = true)
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "UPDATED_BY", nullable = true, length = 30)
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Basic
    @Column(name = "UPDATED_DATE", nullable = true)
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Basic
    @Column(name = "IS_DELETED", nullable = true, precision = 0)
    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = false, length = 8)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "LAST_IP_ADDRESS", nullable = true, length = 17)
    public String getLastIpAddress() {
        return lastIpAddress;
    }

    public void setLastIpAddress(String lastIpAddress) {
        this.lastIpAddress = lastIpAddress;
    }

    @Basic
    @Column(name = "WRONG_ENTRY_COUNT", nullable = true, precision = 0)
    public Long getWrongEntryCount() {
        return wrongEntryCount;
    }

    public void setWrongEntryCount(Long wrongEntryCount) {
        this.wrongEntryCount = wrongEntryCount;
    }

    @Basic
    @Column(name = "IS_BLOCKED", nullable = true, precision = 0)
    public Boolean getBlocked() {
        return isBlocked;
    }

    public void setBlocked(Boolean blocked) {
        isBlocked = blocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(age, that.age) &&
                Objects.equals(email, that.email) &&
                Objects.equals(phoneNo, that.phoneNo) &&
                Objects.equals(countryCode, that.countryCode) &&
                Objects.equals(cityCode, that.cityCode) &&
                Objects.equals(districtCode, that.districtCode) &&
                Objects.equals(neighborhoodCode, that.neighborhoodCode) &&
                Objects.equals(bounty, that.bounty) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedBy, that.updatedBy) &&
                Objects.equals(updatedDate, that.updatedDate) &&
                Objects.equals(isDeleted, that.isDeleted) &&
                Objects.equals(password, that.password) &&
                Objects.equals(lastIpAddress, that.lastIpAddress) &&
                Objects.equals(wrongEntryCount, that.wrongEntryCount) &&
                Objects.equals(isBlocked, that.isBlocked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, email, phoneNo, countryCode, cityCode, districtCode, neighborhoodCode, bounty, createdBy, createdDate, updatedBy, updatedDate, isDeleted, password, lastIpAddress, wrongEntryCount, isBlocked);
    }
}
