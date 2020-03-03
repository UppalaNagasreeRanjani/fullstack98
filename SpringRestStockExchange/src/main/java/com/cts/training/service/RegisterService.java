package com.cts.training.service;
import java.util.List;
import com.cts.training.dto.RegisterDTO;
public interface RegisterService {
public RegisterDTO insert(RegisterDTO registerDTO);
public RegisterDTO updateUser(RegisterDTO users);
public void delete(int id);
public String activate(String email);
public List<RegisterDTO> getAllUsers();
public RegisterDTO getUserById(int id);
}