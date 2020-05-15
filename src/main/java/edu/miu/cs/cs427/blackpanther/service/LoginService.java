package edu.miu.cs.cs427.blackpanther.service;

import edu.miu.cs.cs427.blackpanther.model.UserDTO;
import edu.miu.cs.cs427.blackpanther.repository.LoginDAO;

public class LoginService {

    private LoginDAO dao;

    public LoginService() {
        dao = new LoginDAO();
    }

    public String authenticate(UserDTO userDTO) {
        return dao.authenticate(userDTO);
    }
}
