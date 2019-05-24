package customer.chengcong.entity;

import java.util.Date;

public class Consumeorders {
    private Integer consumeordersId;

    private Integer shopId;

    private Integer usersId;

    private String consumeordersOrdercode;

    private Integer consumeordersOrdertype;

    private Integer memcardsId;

    private String memcardsCardid;

    private Integer exchanggiftsId;

    private Float consumeordersTotalmoney;

    private Float consumeordersDiscountmoney;

    private Integer consumeordersGavepoint;

    private Float consumeordersRecash;

    private String consumeordersRemark;

    private Date consumeordersCreatetime;

    private Integer consumeordersIsdel;
    
    private Memcards memcards;
    
    private Categories categories;
    
    public Memcards getMemcards() {
		return memcards;
	}

	public void setMemcards(Memcards memcards) {
		this.memcards = memcards;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public Integer getConsumeordersId() {
        return consumeordersId;
    }

    public void setConsumeordersId(Integer consumeordersId) {
        this.consumeordersId = consumeordersId;
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

    public String getConsumeordersOrdercode() {
        return consumeordersOrdercode;
    }

    public void setConsumeordersOrdercode(String consumeordersOrdercode) {
        this.consumeordersOrdercode = consumeordersOrdercode == null ? null : consumeordersOrdercode.trim();
    }

    public Integer getConsumeordersOrdertype() {
        return consumeordersOrdertype;
    }

    public void setConsumeordersOrdertype(Integer consumeordersOrdertype) {
        this.consumeordersOrdertype = consumeordersOrdertype;
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

    public Integer getExchanggiftsId() {
        return exchanggiftsId;
    }

    public void setExchanggiftsId(Integer exchanggiftsId) {
        this.exchanggiftsId = exchanggiftsId;
    }

    public Float getConsumeordersTotalmoney() {
        return consumeordersTotalmoney;
    }

    public void setConsumeordersTotalmoney(Float consumeordersTotalmoney) {
        this.consumeordersTotalmoney = consumeordersTotalmoney;
    }

    public Float getConsumeordersDiscountmoney() {
        return consumeordersDiscountmoney;
    }

    public void setConsumeordersDiscountmoney(Float consumeordersDiscountmoney) {
        this.consumeordersDiscountmoney = consumeordersDiscountmoney;
    }

    public Integer getConsumeordersGavepoint() {
        return consumeordersGavepoint;
    }

    public void setConsumeordersGavepoint(Integer consumeordersGavepoint) {
        this.consumeordersGavepoint = consumeordersGavepoint;
    }

    public Float getConsumeordersRecash() {
        return consumeordersRecash;
    }

    public void setConsumeordersRecash(Float consumeordersRecash) {
        this.consumeordersRecash = consumeordersRecash;
    }

    public String getConsumeordersRemark() {
        return consumeordersRemark;
    }

    public void setConsumeordersRemark(String consumeordersRemark) {
        this.consumeordersRemark = consumeordersRemark == null ? null : consumeordersRemark.trim();
    }

    public Date getConsumeordersCreatetime() {
        return consumeordersCreatetime;
    }

    public void setConsumeordersCreatetime(Date consumeordersCreatetime) {
        this.consumeordersCreatetime = consumeordersCreatetime;
    }

    public Integer getConsumeordersIsdel() {
        return consumeordersIsdel;
    }

    public void setConsumeordersIsdel(Integer consumeordersIsdel) {
        this.consumeordersIsdel = consumeordersIsdel;
    }
}