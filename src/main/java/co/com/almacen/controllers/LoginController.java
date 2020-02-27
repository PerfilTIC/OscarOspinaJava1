package co.com.almacen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.almacen.models.Login;
import co.com.almacen.services.ILoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private ILoginService loginService; 
	
	@PostMapping
	public Login log(@RequestBody Login login) {
		
		return loginService.buscarUsuario(login);
	}

}
