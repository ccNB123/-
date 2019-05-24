package customer.chengcong.entity;

import java.util.Date;

public class Memcards {
    private Integer memcardsId;

    private Integer cardlevelsId;

    private Integer shopId;

    private String memcardsCardid;

    private String memcardsPassword;

    private String memcardsName;

    private String memcardsSex;

    private String memcardsMobile;

    private String memcardsPhoto;

    private Integer memcardsBirthdayMonth;

    private Integer memcardsBirthdayDay;

    private Integer memcardsBirthdaytype;

    private Integer memcardsIspast;

    private Date memcardsPasttime;

    private Integer memcardsPoint;

    private Float memcardsMoney;

    private Float memcardsTotalmoney;

    private Integer memcardsTotalcount;

    private Integer memcardsState;

    private Integer memcardsIspointauto;

    private Integer memcardsRefererid;

    private String memcardsReferercard;

    private String memcardsReferername;

    private Date memcardsCreatetime;

    private Integer memcardsIsdel;
    
    private Categories categories;
    
    private Cardlevels cardlevels;
    

    public Cardlevels getCardlevels() {
		return cardlevels;
	}

	public void setCardlevels(Cardlevels cardlevels) {
		this.cardlevels = cardlevels;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public Integer getMemcardsId() {
        return memcardsId;
    }

    public void setMemcardsId(Integer memcardsId) {
        this.memcardsId = memcardsId;
    }

    public Integer getCardlevelsId() {
        return cardlevelsId;
    }

    public void setCardlevelsId(Integer cardlevelsId) {
        this.cardlevelsId = cardlevelsId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getMemcardsCardid() {
        return memcardsCardid;
    }

    public void setMemcardsCardid(String memcardsCardid) {
        this.memcardsCardid = memcardsCardid == null ? null : memcardsCardid.trim();
    }

    public String getMemcardsPassword() {
        return memcardsPassword;
    }

    public void setMemcardsPassword(String memcardsPassword) {
        this.memcardsPassword = memcardsPassword == null ? null : memcardsPassword.trim();
    }

    public String getMemcardsName() {
        return memcardsName;
    }

    public void setMemcardsName(String memcardsName) {
        this.memcardsName = memcardsName == null ? null : memcardsName.trim();
    }

    public String getMemcardsSex() {
        return memcardsSex;
    }

    public void setMemcardsSex(String memcardsSex) {
        this.memcardsSex = memcardsSex == null ? null : memcardsSex.trim();
    }

    public String getMemcardsMobile() {
        return memcardsMobile;
    }

    public void setMemcardsMobile(String memcardsMobile) {
        this.memcardsMobile = memcardsMobile == null ? null : memcardsMobile.trim();
    }

    public String getMemcardsPhoto() {
        return memcardsPhoto;
    }

    public void setMemcardsPhoto(String memcardsPhoto) {
        this.memcardsPhoto = memcardsPhoto == null ? null : memcardsPhoto.trim();
    }

    public Integer getMemcardsBirthdayMonth() {
        return memcardsBirthdayMonth;
    }

    public void setMemcardsBirthdayMonth(Integer memcardsBirthdayMonth) {
        this.memcardsBirthdayMonth = memcardsBirthdayMonth;
    }

    public Integer getMemcardsBirthdayDay() {
        return memcardsBirthdayDay;
    }

    public void setMemcardsBirthdayDay(Integer memcardsBirthdayDay) {
        this.memcardsBirthdayDay = memcardsBirthdayDay;
    }

    public Integer getMemcardsBirthdaytype() {
        return memcardsBirthdaytype;
    }

    public void setMemcardsBirthdaytype(Integer memcardsBirthdaytype) {
        this.memcardsBirthdaytype = memcardsBirthdaytype;
    }

    public Integer getMemcardsIspast() {
        return memcardsIspast;
    }

    public void setMemcardsIspast(Integer memcardsIspast) {
        this.memcardsIspast = memcardsIspast;
    }

    public Date getMemcardsPasttime() {
        return memcardsPasttime;
    }

    public void setMemcardsPasttime(Date memcardsPasttime) {
        this.memcardsPasttime = memcardsPasttime;
    }

    public Integer getMemcardsPoint() {
        return memcardsPoint;
    }

    public void setMemcardsPoint(Integer memcardsPoint) {
        this.memcardsPoint = memcardsPoint;
    }

    public Float getMemcardsMoney() {
        return memcardsMoney;
    }

    public void setMemcardsMoney(Float memcardsMoney) {
        this.memcardsMoney = memcardsMoney;
    }

    public Float getMemcardsTotalmoney() {
        return memcardsTotalmoney;
    }

    public void setMemcardsTotalmoney(Float memcardsTotalmoney) {
        this.memcardsTotalmoney = memcardsTotalmoney;
    }

    public Integer getMemcardsTotalcount() {
        return memcardsTotalcount;
    }

    public void setMemcardsTotalcount(Integer memcardsTotalcount) {
        this.memcardsTotalcount = memcardsTotalcount;
    }

    public Integer getMemcardsState() {
        return memcardsState;
    }

    public void setMemcardsState(Integer memcardsState) {
        this.memcardsState = memcardsState;
    }

    public Integer getMemcardsIspointauto() {
        return memcardsIspointauto;
    }

    public void setMemcardsIspointauto(Integer memcardsIspointauto) {
        this.memcardsIspointauto = memcardsIspointauto;
    }

    public Integer getMemcardsRefererid() {
        return memcardsRefererid;
    }

    public void setMemcardsRefererid(Integer memcardsRefererid) {
        this.memcardsRefererid = memcardsRefererid;
    }

    public String getMemcardsReferercard() {
        return memcardsReferercard;
    }

    public void setMemcardsReferercard(String memcardsReferercard) {
        this.memcardsReferercard = memcardsReferercard == null ? null : memcardsReferercard.trim();
    }

    public String getMemcardsReferername() {
        return memcardsReferername;
    }

    public void setMemcardsReferername(String memcardsReferername) {
        this.memcardsReferername = memcardsReferername == null ? null : memcardsReferername.trim();
    }

    public Date getMemcardsCreatetime() {
        return memcardsCreatetime;
    }

    public void setMemcardsCreatetime(Date memcardsCreatetime) {
        this.memcardsCreatetime = memcardsCreatetime;
    }

    public Integer getMemcardsIsdel() {
        return memcardsIsdel;
    }

    public void setMemcardsIsdel(Integer memcardsIsdel) {
        this.memcardsIsdel = memcardsIsdel;
    }
}