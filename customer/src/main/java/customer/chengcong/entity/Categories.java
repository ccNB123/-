package customer.chengcong.entity;

public class Categories {
    private Integer categoryId;

    private String categoryName;

    private String categoryTitle;

    private Integer categoryPid;

    private Integer categoryIsdel;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle == null ? null : categoryTitle.trim();
    }

    public Integer getCategoryPid() {
        return categoryPid;
    }

    public void setCategoryPid(Integer categoryPid) {
        this.categoryPid = categoryPid;
    }

    public Integer getCategoryIsdel() {
        return categoryIsdel;
    }

    public void setCategoryIsdel(Integer categoryIsdel) {
        this.categoryIsdel = categoryIsdel;
    }
}