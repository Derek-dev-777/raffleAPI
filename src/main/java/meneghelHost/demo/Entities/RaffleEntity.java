package meneghelHost.demo.Entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import meneghelHost.demo.Enums.RaffleStatusEnum;

@Entity
@Table(name = "raffle_tbl")
public class RaffleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	
	private String description;
	
	private String image_url;
	
	private Double ticket_price;
	
	private Integer total_tickets;
	
	private LocalDate draw_date;
	
	private LocalDateTime created_at = LocalDateTime.now();
	
	private LocalDateTime updated_at = LocalDateTime.now();
	 
	@Enumerated(EnumType.STRING)
	private RaffleStatusEnum status = RaffleStatusEnum.ACTIVE;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ORGANIZER_ID", nullable = false)
	private UsersEntity userOrganizer;
	
	@OneToMany(mappedBy = "raffle")
	private List<OrderEntity> listOfOrders = new ArrayList<>();
	
	@OneToMany(mappedBy = "which_raffle")
	private List<TicketEntity> tickets = new ArrayList<>();
	
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
	
	public RaffleStatusEnum getStatus() {
		return status;
	}

	public void setStatus(RaffleStatusEnum status) {
		this.status = status;
	}

	public UsersEntity getUserOrganizer() {
		return userOrganizer;
	}

	public List<TicketEntity> getTickets() {
		return tickets;
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
		RaffleEntity other = (RaffleEntity) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
}
