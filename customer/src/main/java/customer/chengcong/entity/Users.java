package customer.chengcong.entity;

public class Users {
    private Integer usersId;

    private Integer shopId;

    private String usersLoginname;

    private String usersPassword;

    private String usersRealname;

    private String usersSex;

    private String usersTelephone;

    private Integer usersRole;

    private Integer usersCandelete;

    private Integer usersIsdel;
    
    private Categories categories;
    
    private Shops shop;
    
    
    
    public Shops getShop() {
		return shop;
	}

	public void setShop(Shops shop) {
		this.shop = shop;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getUsersLoginname() {
        return usersLoginname;
    }

    public void setUsersLoginname(String usersLoginname) {
        this.usersLoginname = usersLoginname == null ? null : usersLoginname.trim();
    }

    public String getUsersPassword() {
        return usersPassword;
    }

    public void setUsersPassword(String usersPassword) {
        this.usersPassword = usersPassword == null ? null : usersPassword.trim();
    }

    public String getUsersRealname() {
        return usersRealname;
    }

    public void setUsersRealname(String usersRealname) {
        this.usersRealname = usersRealname == null ? null : usersRealname.trim();
    }

    public String getUsersSex() {
        return usersSex;
    }

    public void setUsersSex(String usersSex) {
        this.usersSex = usersSex == null ? null : usersSex.trim();
    }

    public String getUsersTelephone() {
        return usersTelephone;
    }

    public void setUsersTelephone(String usersTelephone) {
        this.usersTelephone = usersTelephone == null ? null : usersTelephone.trim();
    }

    public Integer getUsersRole() {
        return usersRole;
    }

    public void setUsersRole(Integer usersRole) {
        this.usersRole = usersRole;
    }

    public Integer getUsersCandelete() {
        return usersCandelete;
    }

    public void setUsersCandelete(Integer usersCandelete) {
        this.usersCandelete = usersCandelete;
    }

    public Integer getUsersIsdel() {
        return usersIsdel;
    }

    public void setUsersIsdel(Integer usersIsdel) {
        this.usersIsdel = usersIsdel;
    }
}