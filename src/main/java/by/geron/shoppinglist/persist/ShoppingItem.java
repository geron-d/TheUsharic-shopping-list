package by.geron.shoppinglist.persist;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "shopping_items")
public class ShoppingItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

}
