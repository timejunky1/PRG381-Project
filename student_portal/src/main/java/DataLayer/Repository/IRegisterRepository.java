package DataLayer.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import DataLayer.Model.Register;


@Repository
public interface IRegisterRepository extends JpaRepository<Register, Integer>{
    
}
