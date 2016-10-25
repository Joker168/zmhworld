package com.recursive.pojo;

import java.io.Serializable;
import java.util.Date;

public class TaskVO implements Serializable {
    private Integer taskId;

    private String taskCode;

    private Integer salonInfoId;

    private Date taskCreateTime;

    private Date taskFinishTime;

    private Byte taskType;

    private String taskComment;

    private static final long serialVersionUID = 1L;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode == null ? null : taskCode.trim();
    }

    public Integer getSalonInfoId() {
        return salonInfoId;
    }

    public void setSalonInfoId(Integer salonInfoId) {
        this.salonInfoId = salonInfoId;
    }

    public Date getTaskCreateTime() {
        return taskCreateTime;
    }

    public void setTaskCreateTime(Date taskCreateTime) {
        this.taskCreateTime = taskCreateTime;
    }

    public Date getTaskFinishTime() {
        return taskFinishTime;
    }

    public void setTaskFinishTime(Date taskFinishTime) {
        this.taskFinishTime = taskFinishTime;
    }

    public Byte getTaskType() {
        return taskType;
    }

    public void setTaskType(Byte taskType) {
        this.taskType = taskType;
    }

    public String getTaskComment() {
        return taskComment;
    }

    public void setTaskComment(String taskComment) {
        this.taskComment = taskComment == null ? null : taskComment.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taskId=").append(taskId);
        sb.append(", taskCode=").append(taskCode);
        sb.append(", salonInfoId=").append(salonInfoId);
        sb.append(", taskCreateTime=").append(taskCreateTime);
        sb.append(", taskFinishTime=").append(taskFinishTime);
        sb.append(", taskType=").append(taskType);
        sb.append(", taskComment=").append(taskComment);
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
        TaskVO other = (TaskVO) that;
        return (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
            && (this.getTaskCode() == null ? other.getTaskCode() == null : this.getTaskCode().equals(other.getTaskCode()))
            && (this.getSalonInfoId() == null ? other.getSalonInfoId() == null : this.getSalonInfoId().equals(other.getSalonInfoId()))
            && (this.getTaskCreateTime() == null ? other.getTaskCreateTime() == null : this.getTaskCreateTime().equals(other.getTaskCreateTime()))
            && (this.getTaskFinishTime() == null ? other.getTaskFinishTime() == null : this.getTaskFinishTime().equals(other.getTaskFinishTime()))
            && (this.getTaskType() == null ? other.getTaskType() == null : this.getTaskType().equals(other.getTaskType()))
            && (this.getTaskComment() == null ? other.getTaskComment() == null : this.getTaskComment().equals(other.getTaskComment()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getTaskCode() == null) ? 0 : getTaskCode().hashCode());
        result = prime * result + ((getSalonInfoId() == null) ? 0 : getSalonInfoId().hashCode());
        result = prime * result + ((getTaskCreateTime() == null) ? 0 : getTaskCreateTime().hashCode());
        result = prime * result + ((getTaskFinishTime() == null) ? 0 : getTaskFinishTime().hashCode());
        result = prime * result + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        result = prime * result + ((getTaskComment() == null) ? 0 : getTaskComment().hashCode());
        return result;
    }
}