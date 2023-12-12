package hello.itemservice.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public item() {

    }

    public item(Long id, String itemName, Integer price, Integer quantity) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
