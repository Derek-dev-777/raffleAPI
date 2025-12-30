package meneghelHost.demo.Entities;

import java.time.LocalDateTime;
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
import jakarta.persistence.Table;
import meneghelHost.demo.Enums.TicketStatusEnum;


@Entity
@Table(name = "ticket_tbl")
public class TicketEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer number;
	
	@Enumerated(EnumType.STRING) 
	private TicketStatusEnum status;
	
	private LocalDateTime reserved_at;
	
	private LocalDateTime updated_at = LocalDateTime.now();
	
	private String dultalt;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Raffle_ID", nullable = false)
	private RaffleEntity which_raffle;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "User_Id", nullable = false)
	private UsersEntity ticket_owner;
	
	
	public TicketEntity() {}


	public TicketEntity(Integer number, TicketStatusEnum status, RaffleEntity which_raffle, UsersEntity raffle_owner) {
		super();
		this.number = number;
		this.status = status;
		this.which_raffle = which_raffle;
		this.ticket_owner = raffle_owner;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}

	
	public TicketStatusEnum getStatus() {
		return status;
	}


	public void setStatus(TicketStatusEnum status) {
		this.status = status;
	}


	public LocalDateTime getReserved_at() {
		return reserved_at;
	}


	public void setReserved_at(LocalDateTime reserved_at) {
		this.reserved_at = reserved_at;
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


	public RaffleEntity getWhich_raffle() {
		return which_raffle;
	}


	public void setWhich_raffle(RaffleEntity which_raffle) {
		this.which_raffle = which_raffle;
	}


	public UsersEntity getRaffle_owner() {
		return ticket_owner;
	}


	public void setRaffle_owner(UsersEntity raffle_owner) {
		this.ticket_owner = raffle_owner;
	}


	public Long getId() {
		return id;
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
		TicketEntity other = (TicketEntity) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
}
