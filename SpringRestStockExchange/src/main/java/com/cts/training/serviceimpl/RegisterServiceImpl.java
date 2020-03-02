package com.cts.training.serviceimpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cts.training.dao.RegisterDAO;
import com.cts.training.dto.RegisterDTO;
import com.cts.training.model.Register;

import com.cts.training.service.RegisterService;
@Service
public class RegisterServiceImpl implements RegisterService{
	@Autowired
	RegisterDAO registerDAO;
	@Autowired
	JavaMailSender javaMail;
//	@Override
//	public RegisterDTO insert(RegisterDTO user) {
//		Register register=new Register();
//		BeanUtils.copyProperties(user, register);
//		registerDAO.save(register);
//		return user;
//	}
	@Override
	public RegisterDTO insert(RegisterDTO register) {
		Register user=new Register();
		try {
			MimeMessage mimeMessage=javaMail.createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,"utf-8");
			helper.setFrom("uppalaranjani@gmail.com");			
			helper.setTo(register.getEmail());
			helper.setSubject("Activate");
			//sm.setText("This is testing mail");
			helper.setText("Account created click on <a href='http://localhost:4200/activate?"+user.getEmail()+"'>Click</a>",true);
			javaMail.send(mimeMessage);
			BeanUtils.copyProperties(register, user);
			registerDAO.save(user);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return register;
	}
	@Override
	public RegisterDTO updateUser(RegisterDTO user) {
			Register register=new Register();
			BeanUtils.copyProperties(user, register);
			BeanUtils.copyProperties(registerDAO.save(register), user);
			return user;
		}
		@Override
		public void delete(int id) {
			registerDAO.deleteById(id);
		}
		@Override
		public RegisterDTO getUserById(int id) throws NoClassDefFoundError{
			Optional<Register> user= registerDAO.findById(id);
			RegisterDTO register=new RegisterDTO();
			BeanUtils.copyProperties(user.get(), register);
			return register;
		}
		public String activate(@RequestBody String email) {
			String str=email.substring(email.indexOf(":")+2,email.lastIndexOf("\""));
		    System.out.println("email ::"+str);
		    Register user= registerDAO.findByEmail(str);
	    	System.out.println("uname :"+user.getUsername());
	    	user.setActive("yes");
		    user=registerDAO.save(user);
	        return "{\"status\":\"ok\"}";
		}
		@Override
		public List<RegisterDTO> getAllUsers(){
			List<Register> entities = registerDAO.findAll();
			List<RegisterDTO> usersDTO = new ArrayList<RegisterDTO>();
			for(Register entity: entities) {
				RegisterDTO userDTO = new RegisterDTO();
				BeanUtils.copyProperties(entity, userDTO);
				usersDTO.add(userDTO);
			}
			System.out.println("Entity: "+entities);
			System.out.println("DTO: "+usersDTO);
			return usersDTO;
		}
}