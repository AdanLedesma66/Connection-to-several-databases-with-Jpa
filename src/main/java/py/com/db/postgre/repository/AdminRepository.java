package py.com.db.postgre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import py.com.db.postgre.entities.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
