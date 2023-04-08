package py.com.db.mysql.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class User {
    @Id
    private Integer user_id;

}
