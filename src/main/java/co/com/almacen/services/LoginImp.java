package co.com.almacen.services;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.almacen.models.Login;
import co.com.almacen.repository.LoginRepository;

@Service
public class LoginImp implements ILoginService {

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public Login buscarUsuario(Login login) {
		Login response = null;
		Login loginDB = loginRepository.findByUser(login.getUser());
		if (loginDB != null) {
			String passEncode = Base64.getEncoder().encodeToString(login.getPassword().getBytes());
			if (passEncode.equals(loginDB.getPassword())) {
				response = loginDB;
			}
		}
		return response;
	}

}
