package com.recursive.pojo;

import java.io.Serializable;

public class UserVO implements Serializable {
    private Integer userId;

    private String openId;

    private String wechatName;

    private String wechatHead;

    private String taskCode;

    private String trueName;

    private String jobNumber;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getWechatName() {
        return wechatName;
    }

    public void setWechatName(String wechatName) {
        this.wechatName = wechatName == null ? null : wechatName.trim();
    }

    public String getWechatHead() {
        return wechatHead;
    }

    public void setWechatHead(String wechatHead) {
        this.wechatHead = wechatHead == null ? null : wechatHead.trim();
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode == null ? null : taskCode.trim();
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName == null ? null : trueName.trim();
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber == null ? null : jobNumber.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", openId=").append(openId);
        sb.append(", wechatName=").append(wechatName);
        sb.append(", wechatHead=").append(wechatHead);
        sb.append(", taskCode=").append(taskCode);
        sb.append(", trueName=").append(trueName);
        sb.append(", jobNumber=").append(jobNumber);
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
        UserVO other = (UserVO) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
            && (this.getWechatName() == null ? other.getWechatName() == null : this.getWechatName().equals(other.getWechatName()))
            && (this.getWechatHead() == null ? other.getWechatHead() == null : this.getWechatHead().equals(other.getWechatHead()))
            && (this.getTaskCode() == null ? other.getTaskCode() == null : this.getTaskCode().equals(other.getTaskCode()))
            && (this.getTrueName() == null ? other.getTrueName() == null : this.getTrueName().equals(other.getTrueName()))
            && (this.getJobNumber() == null ? other.getJobNumber() == null : this.getJobNumber().equals(other.getJobNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getWechatName() == null) ? 0 : getWechatName().hashCode());
        result = prime * result + ((getWechatHead() == null) ? 0 : getWechatHead().hashCode());
        result = prime * result + ((getTaskCode() == null) ? 0 : getTaskCode().hashCode());
        result = prime * result + ((getTrueName() == null) ? 0 : getTrueName().hashCode());
        result = prime * result + ((getJobNumber() == null) ? 0 : getJobNumber().hashCode());
        return result;
    }
}