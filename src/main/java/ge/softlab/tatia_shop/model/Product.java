package ge.softlab.tatia_shop.model;

import lombok.Data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    private Long id;
    @Column(name = "ean_code")
    private String eanCode;
    @Column(name = "produc_name")
    private String productName;
    @Column(name = "description")
    private String description;
    @Column(name = "maker_id")
    private Long makerId;
    @Column(name = "category_id")
    private Long categoryId;
    @Column(name = "sell_price")
    private Double sellPrice;
    @Column(name = "remaining")
    private Integer remaining;

}
