package meneghelHost.demo.DTO.RaffleDTO;

import java.time.LocalDate;

import meneghelHost.demo.Entities.UsersEntity;

public class RafflePostDTO {
	
	private String title;
	
	private String description;
	
	private String image_url;
	
	private Double ticket_price;
	
	private Integer total_tickets;
	
	private LocalDate draw_date;
	
	private UsersEntity userOrganizer;

	public RafflePostDTO(String title, String description, String image_url, Double ticket_price, Integer total_tickets,
			LocalDate draw_date, UsersEntity userOrganizer) {
		super();
		this.title = title;
		this.description = description;
		this.image_url = image_url;
		this.ticket_price = ticket_price;
		this.total_tickets = total_tickets;
		this.draw_date = draw_date;
		this.userOrganizer = userOrganizer;
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

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
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

	public UsersEntity getUserOrganizer() {
		return userOrganizer;
	}

	public void setUserOrganizer(UsersEntity userOrganizer) {
		userOrganizer = userOrganizer;
	}
	
	
	
}
