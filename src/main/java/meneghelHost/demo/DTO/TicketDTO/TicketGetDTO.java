package meneghelHost.demo.DTO.TicketDTO;

import java.time.LocalDateTime;


import meneghelHost.demo.Enums.TicketStatusEnum;

public class TicketGetDTO {
	
	private Long id;
	
	private Integer number;
	
	private TicketStatusEnum status;
	
	private LocalDateTime reserved_at;
	
	private LocalDateTime updated_at;
	
	private String dultalt;
	
	private Long raffleID;
	
	private Long ownerID;

	public TicketGetDTO(Long id, Integer number, TicketStatusEnum status, LocalDateTime reserved_at,
			LocalDateTime updated_at, String dultalt, Long raffleID, Long ownerID) {
		super();
		this.id = id;
		this.number = number;
		this.status = status;
		this.reserved_at = reserved_at;
		this.updated_at = updated_at;
		this.dultalt = dultalt;
		this.raffleID = raffleID;
		this.ownerID = ownerID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getRaffleID() {
		return raffleID;
	}

	public void setRaffleID(Long raffleID) {
		this.raffleID = raffleID;
	}

	public Long getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(Long ownerID) {
		ownerID = ownerID;
	}
	
	
	
}
