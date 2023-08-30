package DataLayer.Repository;


import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import DataLayer.Model.Register;


@Repository
public interface IRegisterRepository extends JpaRepository<Register, Integer>{
    List<Register> register = new ArrayList<Register>();
}
