package lk.ijse.dep9.orm.custom.entity;

import lk.ijse.dep9.orm.annotation.Id;
import lk.ijse.dep9.orm.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Item {
    @Id
    private String code;
    private String description;
    private int qty;
    private BigDecimal unitPrice;
}
