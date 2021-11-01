package ge.softlab.tatia_shop.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "purchases")
public class Purchase {

    @Id
    private Long id;
    @Column(name = "product_id")
    private Long productId;
    @Column(name="sell_price")
    private Double sellPrice;
    @Column(name = "purchase_date")
    private Date purchaseDate;

}
