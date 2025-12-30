package meneghelHost.demo.DTO.UsersDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import meneghelHost.demo.DTO.OrderDTO.OrderGetDTO;
import meneghelHost.demo.DTO.RaffleDTO.RaffleGetDTO;
import meneghelHost.demo.DTO.TicketDTO.TicketGetDTO;
import meneghelHost.demo.Enums.IsActiveEnum;
import meneghelHost.demo.Enums.RolesEnum;

public class UserGetDTO {
	
	private Long id;
	
	private String name;
	
	private String email;
	
	private String phone_number;
	
	private RolesEnum roles;
	
	private IsActiveEnum is_active;
	
	private LocalDateTime created_at;
	
	private LocalDateTime updated_at;
	
	private String dultalt;
	
	private List<RaffleGetDTO> listOfRaffles = new ArrayList<>();
	
	private List<TicketGetDTO> listOfTickets = new ArrayList<>();
	
	private List<OrderGetDTO> listOfOrders = new ArrayList<>();

	public UserGetDTO(Long id, String name, String email, String phone_number, RolesEnum roles, IsActiveEnum is_active,
			LocalDateTime created_at, LocalDateTime updated_at, String dultalt, List<RaffleGetDTO> listOfRaffles,
			List<TicketGetDTO> listOfTickets, List<OrderGetDTO> listOfOrders) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone_number = phone_number;
		this.roles = roles;
		this.is_active = is_active;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.dultalt = dultalt;
		this.listOfRaffles = listOfRaffles;
		this.listOfTickets = listOfTickets;
		this.listOfOrders = listOfOrders;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public IsActiveEnum getIs_active() {
		return is_active;
	}

	public void setIs_active(IsActiveEnum is_active) {
		this.is_active = is_active;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
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

	public List<RaffleGetDTO> getListOfRaffles() {
		return listOfRaffles;
	}

	public void setListOfRaffles(List<RaffleGetDTO> listOfRaffles) {
		this.listOfRaffles = listOfRaffles;
	}

	public List<TicketGetDTO> getListOfTickets() {
		return listOfTickets;
	}

	public void setListOfTickets(List<TicketGetDTO> listOfTickets) {
		this.listOfTickets = listOfTickets;
	}

	public List<OrderGetDTO> getListOfOrders() {
		return listOfOrders;
	}

	public void setListOfOrders(List<OrderGetDTO> listOfOrders) {
		this.listOfOrders = listOfOrders;
	}
	
	
}
