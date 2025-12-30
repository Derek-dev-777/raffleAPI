package meneghelHost.demo.DTO.RaffleDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import meneghelHost.demo.DTO.OrderDTO.OrderGetDTO;
import meneghelHost.demo.DTO.TicketDTO.TicketGetDTO;
import meneghelHost.demo.Enums.RaffleStatusEnum;

public class RaffleGetDTO {
	
	private Long id;
	
	private String title;
	
	private String description;
	
	private Double ticket_price;
	
	private Integer total_tickets;
	
	private LocalDate draw_date;
	
	private LocalDateTime created_at = LocalDateTime.now();
	
	private LocalDateTime updated_at = LocalDateTime.now();
	
	private RaffleStatusEnum status;
	
	private Long userOrganizer_ID;
	
	private List<OrderGetDTO> listOfOrders = new ArrayList<>();
	
	private List<TicketGetDTO> tickets = new ArrayList<>();

	public RaffleGetDTO(Long id, String title, String description, Double ticket_price, Integer total_tickets,
			LocalDate draw_date, LocalDateTime created_at, LocalDateTime updated_at, RaffleStatusEnum status,
			Long userOrganizer_ID, List<OrderGetDTO> listOfOrders, List<TicketGetDTO> tickets) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.ticket_price = ticket_price;
		this.total_tickets = total_tickets;
		this.draw_date = draw_date;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.status = status;
		this.userOrganizer_ID = userOrganizer_ID;
		this.listOfOrders = listOfOrders;
		this.tickets = tickets;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getTicket_price() {
		return ticket_price;
	}

	public void setTicket_price(Double ticket_price) {
		this.ticket_price = ticket_price;
	}

	public Integer getTotal_tickets() {
		return total_tickets;
	}

	public void setTotal_tickets(Integer total_tickets) {
		this.total_tickets = total_tickets;
	}

	public LocalDate getDraw_date() {
		return draw_date;
	}

	public void setDraw_date(LocalDate draw_date) {
		this.draw_date = draw_date;
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

	public RaffleStatusEnum getStatus() {
		return status;
	}

	public void setStatus(RaffleStatusEnum status) {
		this.status = status;
	}

	public Long getUserOrganizer_ID() {
		return userOrganizer_ID;
	}

	public void setUserOrganizer_ID(Long userOrganizer_ID) {
		this.userOrganizer_ID = userOrganizer_ID;
	}

	public List<OrderGetDTO> getListOfOrders() {
		return listOfOrders;
	}

	public void setListOfOrders(List<OrderGetDTO> listOfOrders) {
		this.listOfOrders = listOfOrders;
	}

	public List<TicketGetDTO> getTickets() {
		return tickets;
	}

	public void setTickets(List<TicketGetDTO> tickets) {
		this.tickets = tickets;
	}
	
	
	
}
