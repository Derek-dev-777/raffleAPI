package meneghelHost.demo.DTO.UsersDTO;

import meneghelHost.demo.Enums.RolesEnum;

public class UserPostDTO {
	
	private String name;
	
	private String email;
	
	private String password;
	
	private String phone_number;
	
	private RolesEnum roles;
	
	private String dultalt;

	public UserPostDTO(String name, String email, String password, String phone_number, RolesEnum roles,
			String dultalt) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone_number = phone_number;
		this.roles = roles;
		this.dultalt = dultalt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public RolesEnum getRoles() {
		return roles;
	}

	public void setRoles(RolesEnum roles) {
		this.roles = roles;
	}

	public String getDultalt() {
		return dultalt;
	}

	public void setDultalt(String dultalt) {
		this.dultalt = dultalt;
	}
	
	
	
}
