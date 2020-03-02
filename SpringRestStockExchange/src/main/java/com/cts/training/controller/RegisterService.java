package com.cts.training.controller;

import java.util.List;

import com.cts.training.dto.RegisterDTO;

public interface RegisterService {
public RegisterDTO insert(RegisterDTO registerDTO);
public void delete(int id);
public RegisterDTO updateUser(RegisterDTO users);
public List<RegisterDTO> getAllUsers();
public RegisterDTO getUserById(int id);
public String activate(String email);


}
