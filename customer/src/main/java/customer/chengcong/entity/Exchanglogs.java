package customer.chengcong.entity;

import java.util.Date;

public class Exchanglogs {
    private Integer exchanglogsId;

    private Integer shopId;

    private Integer usersId;

    private Integer memcardsId;

    private String memcardsCardid;

    private String memcardsName;

    private Integer exchanggiftsId;

    private String exchanggiftsGiftcode;

    private String exchanggiftsGiftname;

    private Integer exchanglogsNumber;

    private Integer exchanglogsPoint;

    private Date exchanglogsCreatetime;

    private Integer exchanglogsIsdel;

    public Integer getExchanglogsId() {
        return exchanglogsId;
    }

    public void setExchanglogsId(Integer exchanglogsId) {
        this.exchanglogsId = exchanglogsId;
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

    public Integer getMemcardsId() {
        return memcardsId;
    }

    public void setMemcardsId(Integer memcardsId) {
        this.memcardsId = memcardsId;
    }

    public String getMemcardsCardid() {
        return memcardsCardid;
    }

    public void setMemcardsCardid(String memcardsCardid) {
        this.memcardsCardid = memcardsCardid == null ? null : memcardsCardid.trim();
    }

    public String getMemcardsName() {
        return memcardsName;
    }

    public void setMemcardsName(String memcardsName) {
        this.memcardsName = memcardsName == null ? null : memcardsName.trim();
    }

    public Integer getExchanggiftsId() {
        return exchanggiftsId;
    }

    public void setExchanggiftsId(Integer exchanggiftsId) {
        this.exchanggiftsId = exchanggiftsId;
    }

    public String getExchanggiftsGiftcode() {
        return exchanggiftsGiftcode;
    }

    public void setExchanggiftsGiftcode(String exchanggiftsGiftcode) {
        this.exchanggiftsGiftcode = exchanggiftsGiftcode == null ? null : exchanggiftsGiftcode.trim();
    }

    public String getExchanggiftsGiftname() {
        return exchanggiftsGiftname;
    }

    public void setExchanggiftsGiftname(String exchanggiftsGiftname) {
        this.exchanggiftsGiftname = exchanggiftsGiftname == null ? null : exchanggiftsGiftname.trim();
    }

    public Integer getExchanglogsNumber() {
        return exchanglogsNumber;
    }

    public void setExchanglogsNumber(Integer exchanglogsNumber) {
        this.exchanglogsNumber = exchanglogsNumber;
    }

    public Integer getExchanglogsPoint() {
        return exchanglogsPoint;
    }

    public void setExchanglogsPoint(Integer exchanglogsPoint) {
        this.exchanglogsPoint = exchanglogsPoint;
    }

    public Date getExchanglogsCreatetime() {
        return exchanglogsCreatetime;
    }

    public void setExchanglogsCreatetime(Date exchanglogsCreatetime) {
        this.exchanglogsCreatetime = exchanglogsCreatetime;
    }

    public Integer getExchanglogsIsdel() {
        return exchanglogsIsdel;
    }

    public void setExchanglogsIsdel(Integer exchanglogsIsdel) {
        this.exchanglogsIsdel = exchanglogsIsdel;
    }
}