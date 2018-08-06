package cn.edu.jxufe.entity;

import java.io.Serializable;

/**
 * memberaddress
 * @author 
 */
public class Memberaddress implements Serializable {
    /**
     * 主键
     */
    private Integer addressid;

    /**
     * 省名字
     */
    private String provincename;

    /**
     * 城市名字
     */
    private String cityname;

    /**
     * 区域名字
     */
    private String areaname;

    /**
     * 详细地址
     */
    private String detailaddress;

    /**
     * 所属会员
     */
    private Integer memberid;

    /**
     * 是否默认
     */
    private Integer default;

    private static final long serialVersionUID = 1L;

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public String getDetailaddress() {
        return detailaddress;
    }

    public void setDetailaddress(String detailaddress) {
        this.detailaddress = detailaddress;
    }

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public Integer getDefault() {
        return default;
    }

    public void setDefault(Integer default) {
        this.default = default;
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
        Memberaddress other = (Memberaddress) that;
        return (this.getAddressid() == null ? other.getAddressid() == null : this.getAddressid().equals(other.getAddressid()))
            && (this.getProvincename() == null ? other.getProvincename() == null : this.getProvincename().equals(other.getProvincename()))
            && (this.getCityname() == null ? other.getCityname() == null : this.getCityname().equals(other.getCityname()))
            && (this.getAreaname() == null ? other.getAreaname() == null : this.getAreaname().equals(other.getAreaname()))
            && (this.getDetailaddress() == null ? other.getDetailaddress() == null : this.getDetailaddress().equals(other.getDetailaddress()))
            && (this.getMemberid() == null ? other.getMemberid() == null : this.getMemberid().equals(other.getMemberid()))
            && (this.getDefault() == null ? other.getDefault() == null : this.getDefault().equals(other.getDefault()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAddressid() == null) ? 0 : getAddressid().hashCode());
        result = prime * result + ((getProvincename() == null) ? 0 : getProvincename().hashCode());
        result = prime * result + ((getCityname() == null) ? 0 : getCityname().hashCode());
        result = prime * result + ((getAreaname() == null) ? 0 : getAreaname().hashCode());
        result = prime * result + ((getDetailaddress() == null) ? 0 : getDetailaddress().hashCode());
        result = prime * result + ((getMemberid() == null) ? 0 : getMemberid().hashCode());
        result = prime * result + ((getDefault() == null) ? 0 : getDefault().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", addressid=").append(addressid);
        sb.append(", provincename=").append(provincename);
        sb.append(", cityname=").append(cityname);
        sb.append(", areaname=").append(areaname);
        sb.append(", detailaddress=").append(detailaddress);
        sb.append(", memberid=").append(memberid);
        sb.append(", default=").append(default);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}