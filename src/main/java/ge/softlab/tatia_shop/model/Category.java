package ge.softlab.tatia_shop.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "categories")
public class Category {
    @Id
    private Long id;
    @Column(name = "parent_id")
    private Long parentId;
    @Column(name = "category_name")
    private String categoryName;

}
