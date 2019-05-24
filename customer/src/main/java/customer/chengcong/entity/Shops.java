package customer.chengcong.entity;

import java.util.Date;

public class Shops {
	public static final int HAS_ADMIN=1;
	public static final int HASNOT_ADMIN=0;
	
    private Integer shopId;

    private String shopName;

    private Integer shopCategoryId;

    private String shopContactname;

    private String shopContacttel;

    private String shopAddress;

    private String shopRemark;

    private Integer shopIshassetadmin;

    private Date shopCreatetime;

    private Integer shopIsdel;
    
    private Categories categories;
    

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public Integer getShopCategoryId() {
        return shopCategoryId;
    }

    public void setShopCategoryId(Integer shopCategoryId) {
        this.shopCategoryId = shopCategoryId;
    }

    public String getShopContactname() {
        return shopContactname;
    }

    public void setShopContactname(String shopContactname) {
        this.shopContactname = shopContactname == null ? null : shopContactname.trim();
    }

    public String getShopContacttel() {
        return shopContacttel;
    }

    public void setShopContacttel(String shopContacttel) {
        this.shopContacttel = shopContacttel == null ? null : shopContacttel.trim();
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress == null ? null : shopAddress.trim();
    }

    public String getShopRemark() {
        return shopRemark;
    }

    public void setShopRemark(String shopRemark) {
        this.shopRemark = shopRemark == null ? null : shopRemark.trim();
    }

    public Integer getShopIshassetadmin() {
        return shopIshassetadmin;
    }

    public void setShopIshassetadmin(Integer shopIshassetadmin) {
        this.shopIshassetadmin = shopIshassetadmin;
    }

    public Date getShopCreatetime() {
        return shopCreatetime;
    }

    public void setShopCreatetime(Date shopCreatetime) {
        this.shopCreatetime = shopCreatetime;
    }

    public Integer getShopIsdel() {
        return shopIsdel;
    }

    public void setShopIsdel(Integer shopIsdel) {
        this.shopIsdel = shopIsdel;
    }
}