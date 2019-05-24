package customer.chengcong.entity;

public class Exchanggifts {
    private Integer exchanggiftsId;

    private Integer shopId;

    private String exchanggiftsGiftcode;

    private String exchanggiftsGiftname;

    private String exchanggiftsPhoto;

    private Integer exchanggiftsPoint;

    private Integer exchanggiftsInteger;

    private Integer exchanggiftsExchangnum;

    private String exchanggiftsRemark;

    private Integer exchanggiftsState;

    private Integer exchanggiftsIsdel;

    public Integer getExchanggiftsId() {
        return exchanggiftsId;
    }

    public void setExchanggiftsId(Integer exchanggiftsId) {
        this.exchanggiftsId = exchanggiftsId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
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

    public String getExchanggiftsPhoto() {
        return exchanggiftsPhoto;
    }

    public void setExchanggiftsPhoto(String exchanggiftsPhoto) {
        this.exchanggiftsPhoto = exchanggiftsPhoto == null ? null : exchanggiftsPhoto.trim();
    }

    public Integer getExchanggiftsPoint() {
        return exchanggiftsPoint;
    }

    public void setExchanggiftsPoint(Integer exchanggiftsPoint) {
        this.exchanggiftsPoint = exchanggiftsPoint;
    }

    public Integer getExchanggiftsInteger() {
        return exchanggiftsInteger;
    }

    public void setExchanggiftsInteger(Integer exchanggiftsInteger) {
        this.exchanggiftsInteger = exchanggiftsInteger;
    }

    public Integer getExchanggiftsExchangnum() {
        return exchanggiftsExchangnum;
    }

    public void setExchanggiftsExchangnum(Integer exchanggiftsExchangnum) {
        this.exchanggiftsExchangnum = exchanggiftsExchangnum;
    }

    public String getExchanggiftsRemark() {
        return exchanggiftsRemark;
    }

    public void setExchanggiftsRemark(String exchanggiftsRemark) {
        this.exchanggiftsRemark = exchanggiftsRemark == null ? null : exchanggiftsRemark.trim();
    }

    public Integer getExchanggiftsState() {
        return exchanggiftsState;
    }

    public void setExchanggiftsState(Integer exchanggiftsState) {
        this.exchanggiftsState = exchanggiftsState;
    }

    public Integer getExchanggiftsIsdel() {
        return exchanggiftsIsdel;
    }

    public void setExchanggiftsIsdel(Integer exchanggiftsIsdel) {
        this.exchanggiftsIsdel = exchanggiftsIsdel;
    }
}