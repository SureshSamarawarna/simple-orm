package lk.ijse.dep9.orm.entity;

import lk.ijse.dep9.orm.annotation.Id;
import lk.ijse.dep9.orm.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Table
public class User {
//    @Id
    private String username;
    private String password;
    private String role;
}
