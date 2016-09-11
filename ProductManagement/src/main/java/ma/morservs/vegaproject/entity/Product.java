package ma.morservs.vegaproject.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Ayoub on 07/09/2016.
 */


@Entity
@Table(name = "PRODUCT")
public class Product {


    @Id
    @GeneratedValue
    private Long id;
    @Column(name ="PRODUCT_NAME", length = 255)
    private String name;
    @Column(name ="PRODUCT_DESCRIPTION", length = 255)
    private String Description;
    @Column(name ="PRODUCT_VALID_FROM")
    private Date validFrom;
    @Column(name ="PRODUCT_VALID_TO")
    private Date validTo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }
}
