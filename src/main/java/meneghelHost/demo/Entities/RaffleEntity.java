package meneghelHost.demo.Entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "raffle_tbl")
public class RaffleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "IMAGE_URL")
	private String image_url;
	
	@Column(name = "TICKET_PRICE")
	private Double ticket_price;
	
	@Column(name = "TOTAL_TICKETS")
	private Integer total_tickets;
	
	@Column(name = "DRAW_DATE")
	private LocalDate draw_date;
	
	@Column(name = "CREATED_AT")
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "UPDATED_AT")
	private LocalDateTime updated_at = LocalDateTime.now();
	 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ORGANIZER_ID", nullable = false)
	private UsersEntity userOrganizer;
	
	public RaffleEntity() {}

	public RaffleEntity(String title, String description, String image_url, Double ticket_price, Integer total_tickets,
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

	public LocalDateTime getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}

	public Long getId() {
		return id;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public UsersEntity getUserOrganizer() {
		return userOrganizer;
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
		RaffleEntity other = (RaffleEntity) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
}
