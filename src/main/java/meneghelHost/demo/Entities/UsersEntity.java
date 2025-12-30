package meneghelHost.demo.Entities;

import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import meneghelHost.demo.Enums.IsActiveEnum;
import meneghelHost.demo.Enums.RolesEnum;

@Entity
@Table(name = "users_tbl")
public class UsersEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID") 
	private Long id;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "EMAIL", nullable = false, unique = true)
	private String email;
	
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	
	@Column( name = "PHONE_NUMBER")
	private String phone_number;
	
	@Enumerated(EnumType.STRING)
	@Column( name = "ROLE")
	private RolesEnum role;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "IS_ACTIVE")
	private IsActiveEnum is_active;
	
	@Column(name = "CREATED_AT", updatable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "UPDATED_AT")
	private LocalDateTime updated_at = LocalDateTime.now();
	
	@Column(name = "DULTALT")
	private String dultalt;
	
	@OneToMany(mappedBy = "userOrganizer")
	private List<RaffleEntity> listOfRaffles = new ArrayList<>();
	
	@OneToMany(mappedBy = "ticket_owner")
	private List<TicketEntity> listOfTickets = new ArrayList<>();
	
	@OneToMany(mappedBy = "user")
	private List<OrderEntity> listOfOrders = new ArrayList<>();
	
	public UsersEntity () {}

	public UsersEntity(String name, String email, String password, String phone_number, RolesEnum role,
		 String dultalt) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone_number = phone_number;
		this.role = role;
		this.dultalt = dultalt;
		this.is_active = IsActiveEnum.ACTIVE;
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
	
	
	public RolesEnum getRole() {
		return role;
	}

	public void setRole(RolesEnum role) {
		this.role = role;
	}

	public IsActiveEnum getIs_active() {
		return is_active;
	}

	public void setIs_active(IsActiveEnum is_active) {
		this.is_active = is_active;
	}

	public LocalDateTime getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}

	public String getDultalt() {
		return dultalt;
	}

	public void setDultalt(String dultalt) {
		this.dultalt = dultalt;
	}

	public Long getId() {
		return id;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}
	

	public List<RaffleEntity> getListOfRaffles() {
		return listOfRaffles;
	}

	public List<TicketEntity> getListOfTickets() {
		return listOfTickets;
	}

	public List<OrderEntity> getListOfOrders() {
		return listOfOrders;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsersEntity other = (UsersEntity) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
	
	
	
}
