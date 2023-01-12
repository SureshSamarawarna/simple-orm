package lk.ijse.dep9.orm;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.junit.jupiter.api.Assertions.*;

class InitializeDBTest {

    @BeforeAll
    static void beforeAll() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }

    @Test
    void initialize() {
        assertDoesNotThrow(()-> InitializeDB.initialize("localhost","3306",
                "dep9_orm","root","MORA@spsa8",
                "lk.ijse.dep9.orm.entity","lk.ijse.dep9.orm.custom.entity"));
        assertDoesNotThrow(()->{
            try (Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/dep9_orm", "root", "MORA@spsa8")) {
                connection.createStatement().execute("SELECT id, name, address FROM Customer");
                connection.createStatement().execute("SELECT code, description, qty, unitPrice FROM Item");

            }
        });
    }
}