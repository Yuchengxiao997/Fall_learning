package generator.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @TableName countrylanguage
 */
@Data
public class Countrylanguage implements Serializable {
    private String countrycode;

    private String language;

    private Object isofficial;

    private BigDecimal percentage;

    private static final long serialVersionUID = 1L;

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
        Countrylanguage other = (Countrylanguage) that;
        return (this.getCountrycode() == null ? other.getCountrycode() == null : this.getCountrycode().equals(other.getCountrycode()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getIsofficial() == null ? other.getIsofficial() == null : this.getIsofficial().equals(other.getIsofficial()))
            && (this.getPercentage() == null ? other.getPercentage() == null : this.getPercentage().equals(other.getPercentage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCountrycode() == null) ? 0 : getCountrycode().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getIsofficial() == null) ? 0 : getIsofficial().hashCode());
        result = prime * result + ((getPercentage() == null) ? 0 : getPercentage().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", countrycode=").append(countrycode);
        sb.append(", language=").append(language);
        sb.append(", isofficial=").append(isofficial);
        sb.append(", percentage=").append(percentage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}