/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataLayer.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import DataLayer.Model.Admin;
import DataLayer.Repository.IAdminRepository;
@RestController
public class AdminController {
    @Autowired
    IAdminRepository adminRepository;

    //Coppy over from Student controller
}
