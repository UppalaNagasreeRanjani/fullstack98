package com.cts.training.serviceimpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.dto.RegisterDTO;
import com.cts.training.model.Register;
import com.cts.training.repo.RegisterRepo;
import com.cts.training.service.RegisterService;
@Service
public class RegisterServiceImpl  implements RegisterService{
@Autowired
RegisterRepo rr;
@Override
public RegisterDTO insert(RegisterDTO rd) {
	Register re=new Register();
	BeanUtils.copyProperties(rd, re);
	rr.save(re);
	return rd;
}
	
}
