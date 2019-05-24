package customer.chengcong.entity;

import java.util.Date;

public class Transferlogs {
    private Integer transferlogsId;

    private Integer shopId;

    private Integer usersId;

    private Integer transferlogsFrommcId;

    private String transferlogsFrommcCardid;

    private Integer transferlogsTomcId;

    private String transferlogsTomcCardid;

    private Float transferlogsTransfermoney;

    private String transferlogsRemark;

    private Date transferlogsCreatetime;

    private Integer transferlogsIsdel;

    public Integer getTransferlogsId() {
        return transferlogsId;
    }

    public void setTransferlogsId(Integer transferlogsId) {
        this.transferlogsId = transferlogsId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getTransferlogsFrommcId() {
        return transferlogsFrommcId;
    }

    public void setTransferlogsFrommcId(Integer transferlogsFrommcId) {
        this.transferlogsFrommcId = transferlogsFrommcId;
    }

    public String getTransferlogsFrommcCardid() {
        return transferlogsFrommcCardid;
    }

    public void setTransferlogsFrommcCardid(String transferlogsFrommcCardid) {
        this.transferlogsFrommcCardid = transferlogsFrommcCardid == null ? null : transferlogsFrommcCardid.trim();
    }

    public Integer getTransferlogsTomcId() {
        return transferlogsTomcId;
    }

    public void setTransferlogsTomcId(Integer transferlogsTomcId) {
        this.transferlogsTomcId = transferlogsTomcId;
    }

    public String getTransferlogsTomcCardid() {
        return transferlogsTomcCardid;
    }

    public void setTransferlogsTomcCardid(String transferlogsTomcCardid) {
        this.transferlogsTomcCardid = transferlogsTomcCardid == null ? null : transferlogsTomcCardid.trim();
    }

    public Float getTransferlogsTransfermoney() {
        return transferlogsTransfermoney;
    }

    public void setTransferlogsTransfermoney(Float transferlogsTransfermoney) {
        this.transferlogsTransfermoney = transferlogsTransfermoney;
    }

    public String getTransferlogsRemark() {
        return transferlogsRemark;
    }

    public void setTransferlogsRemark(String transferlogsRemark) {
        this.transferlogsRemark = transferlogsRemark == null ? null : transferlogsRemark.trim();
    }

    public Date getTransferlogsCreatetime() {
        return transferlogsCreatetime;
    }

    public void setTransferlogsCreatetime(Date transferlogsCreatetime) {
        this.transferlogsCreatetime = transferlogsCreatetime;
    }

    public Integer getTransferlogsIsdel() {
        return transferlogsIsdel;
    }

    public void setTransferlogsIsdel(Integer transferlogsIsdel) {
        this.transferlogsIsdel = transferlogsIsdel;
    }
}