package com.cts.training.registerservice;

import java.util.List;



public interface RegisterService {
public RegisterDTO insert(RegisterDTO registerDTO);
public void delete(int id);
public RegisterDTO updateUser(RegisterDTO users);
public List<RegisterDTO> getAllUsers();
public RegisterDTO getUserById(int id);
public String activate(String email);


}
