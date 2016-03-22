package com.platform.models;

import java.io.Serializable;
import java.util.Date;

public class MdBrand implements Serializable {
    private Integer id;

    private Integer advertiserid;

    private String name;

    private String industry;

    private String comments;

    private Boolean delflg;

    private Integer createuser;

    private Integer updateuser;

    private Date createtime;

    private Date updatetime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdvertiserid() {
        return advertiserid;
    }

    public void setAdvertiserid(Integer advertiserid) {
        this.advertiserid = advertiserid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public Boolean getDelflg() {
        return delflg;
    }

    public void setDelflg(Boolean delflg) {
        this.delflg = delflg;
    }

    public Integer getCreateuser() {
        return createuser;
    }

    public void setCreateuser(Integer createuser) {
        this.createuser = createuser;
    }

    public Integer getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(Integer updateuser) {
        this.updateuser = updateuser;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        return "MdBrand{" +
                "id=" + id +
                ", advertiserid=" + advertiserid +
                ", name='" + name + '\'' +
                ", industry='" + industry + '\'' +
                ", comments='" + comments + '\'' +
                ", delflg=" + delflg +
                ", createuser=" + createuser +
                ", updateuser=" + updateuser +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                '}';
    }
}