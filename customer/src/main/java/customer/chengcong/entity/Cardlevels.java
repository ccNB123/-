package customer.chengcong.entity;

public class Cardlevels {
    private Integer cardlevelsId;

    private String cardlevelsLevelname;

    private Integer cardlevelsNeedpoint;

    private Float cardlevelsPoint;

    private Float cardlevelsPercent;

    public Integer getCardlevelsId() {
        return cardlevelsId;
    }

    public void setCardlevelsId(Integer cardlevelsId) {
        this.cardlevelsId = cardlevelsId;
    }

    public String getCardlevelsLevelname() {
        return cardlevelsLevelname;
    }

    public void setCardlevelsLevelname(String cardlevelsLevelname) {
        this.cardlevelsLevelname = cardlevelsLevelname == null ? null : cardlevelsLevelname.trim();
    }

    public Integer getCardlevelsNeedpoint() {
        return cardlevelsNeedpoint;
    }

    public void setCardlevelsNeedpoint(Integer cardlevelsNeedpoint) {
        this.cardlevelsNeedpoint = cardlevelsNeedpoint;
    }

    public Float getCardlevelsPoint() {
        return cardlevelsPoint;
    }

    public void setCardlevelsPoint(Float cardlevelsPoint) {
        this.cardlevelsPoint = cardlevelsPoint;
    }

    public Float getCardlevelsPercent() {
        return cardlevelsPercent;
    }

    public void setCardlevelsPercent(Float cardlevelsPercent) {
        this.cardlevelsPercent = cardlevelsPercent;
    }
}