package com.recursive.pojo;

import java.io.Serializable;

public class InfoVO implements Serializable {
    private Integer salonInfoId;

    private String salonName;

    private String salonAddress;

    private String contacts;

    private String contactPhone;

    private String salonWechatPublicNo;

    private String contactsOpenId;

    private String contactsWechatName;

    private String contactsWechatHead;

    private Byte salonIntention;

    private String brandName;

    private Byte contactsSex;

    private Integer staffSize;

    private String salonComment;

    private static final long serialVersionUID = 1L;

    public Integer getSalonInfoId() {
        return salonInfoId;
    }

    public void setSalonInfoId(Integer salonInfoId) {
        this.salonInfoId = salonInfoId;
    }

    public String getSalonName() {
        return salonName;
    }

    public void setSalonName(String salonName) {
        this.salonName = salonName == null ? null : salonName.trim();
    }

    public String getSalonAddress() {
        return salonAddress;
    }

    public void setSalonAddress(String salonAddress) {
        this.salonAddress = salonAddress == null ? null : salonAddress.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getSalonWechatPublicNo() {
        return salonWechatPublicNo;
    }

    public void setSalonWechatPublicNo(String salonWechatPublicNo) {
        this.salonWechatPublicNo = salonWechatPublicNo == null ? null : salonWechatPublicNo.trim();
    }

    public String getContactsOpenId() {
        return contactsOpenId;
    }

    public void setContactsOpenId(String contactsOpenId) {
        this.contactsOpenId = contactsOpenId == null ? null : contactsOpenId.trim();
    }

    public String getContactsWechatName() {
        return contactsWechatName;
    }

    public void setContactsWechatName(String contactsWechatName) {
        this.contactsWechatName = contactsWechatName == null ? null : contactsWechatName.trim();
    }

    public String getContactsWechatHead() {
        return contactsWechatHead;
    }

    public void setContactsWechatHead(String contactsWechatHead) {
        this.contactsWechatHead = contactsWechatHead == null ? null : contactsWechatHead.trim();
    }

    public Byte getSalonIntention() {
        return salonIntention;
    }

    public void setSalonIntention(Byte salonIntention) {
        this.salonIntention = salonIntention;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public Byte getContactsSex() {
        return contactsSex;
    }

    public void setContactsSex(Byte contactsSex) {
        this.contactsSex = contactsSex;
    }

    public Integer getStaffSize() {
        return staffSize;
    }

    public void setStaffSize(Integer staffSize) {
        this.staffSize = staffSize;
    }

    public String getSalonComment() {
        return salonComment;
    }

    public void setSalonComment(String salonComment) {
        this.salonComment = salonComment == null ? null : salonComment.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", salonInfoId=").append(salonInfoId);
        sb.append(", salonName=").append(salonName);
        sb.append(", salonAddress=").append(salonAddress);
        sb.append(", contacts=").append(contacts);
        sb.append(", contactPhone=").append(contactPhone);
        sb.append(", salonWechatPublicNo=").append(salonWechatPublicNo);
        sb.append(", contactsOpenId=").append(contactsOpenId);
        sb.append(", contactsWechatName=").append(contactsWechatName);
        sb.append(", contactsWechatHead=").append(contactsWechatHead);
        sb.append(", salonIntention=").append(salonIntention);
        sb.append(", brandName=").append(brandName);
        sb.append(", contactsSex=").append(contactsSex);
        sb.append(", staffSize=").append(staffSize);
        sb.append(", salonComment=").append(salonComment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        InfoVO other = (InfoVO) that;
        return (this.getSalonInfoId() == null ? other.getSalonInfoId() == null : this.getSalonInfoId().equals(other.getSalonInfoId()))
            && (this.getSalonName() == null ? other.getSalonName() == null : this.getSalonName().equals(other.getSalonName()))
            && (this.getSalonAddress() == null ? other.getSalonAddress() == null : this.getSalonAddress().equals(other.getSalonAddress()))
            && (this.getContacts() == null ? other.getContacts() == null : this.getContacts().equals(other.getContacts()))
            && (this.getContactPhone() == null ? other.getContactPhone() == null : this.getContactPhone().equals(other.getContactPhone()))
            && (this.getSalonWechatPublicNo() == null ? other.getSalonWechatPublicNo() == null : this.getSalonWechatPublicNo().equals(other.getSalonWechatPublicNo()))
            && (this.getContactsOpenId() == null ? other.getContactsOpenId() == null : this.getContactsOpenId().equals(other.getContactsOpenId()))
            && (this.getContactsWechatName() == null ? other.getContactsWechatName() == null : this.getContactsWechatName().equals(other.getContactsWechatName()))
            && (this.getContactsWechatHead() == null ? other.getContactsWechatHead() == null : this.getContactsWechatHead().equals(other.getContactsWechatHead()))
            && (this.getSalonIntention() == null ? other.getSalonIntention() == null : this.getSalonIntention().equals(other.getSalonIntention()))
            && (this.getBrandName() == null ? other.getBrandName() == null : this.getBrandName().equals(other.getBrandName()))
            && (this.getContactsSex() == null ? other.getContactsSex() == null : this.getContactsSex().equals(other.getContactsSex()))
            && (this.getStaffSize() == null ? other.getStaffSize() == null : this.getStaffSize().equals(other.getStaffSize()))
            && (this.getSalonComment() == null ? other.getSalonComment() == null : this.getSalonComment().equals(other.getSalonComment()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSalonInfoId() == null) ? 0 : getSalonInfoId().hashCode());
        result = prime * result + ((getSalonName() == null) ? 0 : getSalonName().hashCode());
        result = prime * result + ((getSalonAddress() == null) ? 0 : getSalonAddress().hashCode());
        result = prime * result + ((getContacts() == null) ? 0 : getContacts().hashCode());
        result = prime * result + ((getContactPhone() == null) ? 0 : getContactPhone().hashCode());
        result = prime * result + ((getSalonWechatPublicNo() == null) ? 0 : getSalonWechatPublicNo().hashCode());
        result = prime * result + ((getContactsOpenId() == null) ? 0 : getContactsOpenId().hashCode());
        result = prime * result + ((getContactsWechatName() == null) ? 0 : getContactsWechatName().hashCode());
        result = prime * result + ((getContactsWechatHead() == null) ? 0 : getContactsWechatHead().hashCode());
        result = prime * result + ((getSalonIntention() == null) ? 0 : getSalonIntention().hashCode());
        result = prime * result + ((getBrandName() == null) ? 0 : getBrandName().hashCode());
        result = prime * result + ((getContactsSex() == null) ? 0 : getContactsSex().hashCode());
        result = prime * result + ((getStaffSize() == null) ? 0 : getStaffSize().hashCode());
        result = prime * result + ((getSalonComment() == null) ? 0 : getSalonComment().hashCode());
        return result;
    }
}