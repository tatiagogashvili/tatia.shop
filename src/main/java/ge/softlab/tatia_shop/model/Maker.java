package ge.softlab.tatia_shop.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "categories")
public class Maker {

    @Id
    private Long id;
    @Column(name = "maker_name")
    private String makerName;
}
