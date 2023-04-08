package py.com.db.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import py.com.db.mysql.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
