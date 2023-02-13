package com.example.consultingg.services;

   
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;
 
import com.example.consultingg.entity.Cliente;  
import com.example.consultingg.respository.ClienteRepository; 
import com.example.consultingg.respository.BaseRepository; 

@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente, Long> implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepository;
	   
	public ClienteServiceImpl(BaseRepository<Cliente, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}

	 
}
