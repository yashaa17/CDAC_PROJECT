package com.bookmydriver.controller;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmydriver.config.JwtService;
import com.bookmydriver.dao.LoginDao;
import com.bookmydriver.dto.UserDTO;
import com.bookmydriver.service.impl.UserServiceImpl;


@RequestMapping("/auth")
@RestController
@CrossOrigin("*")
public class LoginController {
	@Autowired
	private UserServiceImpl serviceImpl;

	@Autowired
	private JwtService jwtService;

	@PostMapping("/login")
	public ResponseEntity login(@RequestBody LoginDao dao) {
		System.out.println(dao.getEmail()+" "+ dao.getPassword());
		UserDTO userDTO = serviceImpl.getUserByEmail(dao.getEmail(), dao.getPassword());
		System.out.println(userDTO);
		HashMap hm = new HashMap();
		hm.put("user",userDTO);
		hm.put("token",jwtService.generateToken(new UserDetails() {

			@Override
			public boolean isEnabled() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isCredentialsNonExpired() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isAccountNonLocked() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isAccountNonExpired() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public String getUsername() {
				// TODO Auto-generated method stub
				return dao.getEmail();
			}

			@Override
			public String getPassword() {
				// TODO Auto-generated method stub
				return dao.getPassword();
			}

			@Override
			public Collection<? extends GrantedAuthority> getAuthorities() {
				// TODO Auto-generated method stub
				return null;
			}
		}));

		return ResponseEntity.ok(hm);

	}

	@PostMapping("/create")
	    public UserDTO createUser(@RequestBody UserDTO userDTO) {
		System.out.println(userDTO);
	        return serviceImpl.createUser(userDTO);
	    }
}
