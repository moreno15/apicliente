package com.example.consultingg.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.consultingg.entity.Cliente;
import com.example.consultingg.services.ClienteServiceImpl; 

@RestController 
@CrossOrigin 
@RequestMapping(path = "api/v1/cliente")   
	
public class ClienteController extends BaseControllerImpl<Cliente, ClienteServiceImpl>{

} 
 