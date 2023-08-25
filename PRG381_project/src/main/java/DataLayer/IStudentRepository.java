/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DataLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author sjaco
 */
@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer>{
    
    List<Student> findByTitleContainingOrContentContaining(String text, String textAgain);

    public Student findOne(int studentId);

    public void delete(int studentId);
    
}
