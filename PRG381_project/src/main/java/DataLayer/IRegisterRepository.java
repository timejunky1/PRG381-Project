package DataLayer;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IRegisterRepository extends JpaRepository<Register, Integer>{
}
