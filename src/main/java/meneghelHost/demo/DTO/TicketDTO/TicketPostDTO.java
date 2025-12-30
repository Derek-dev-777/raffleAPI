package meneghelHost.demo.DTO.TicketDTO;


import meneghelHost.demo.Entities.RaffleEntity;
import meneghelHost.demo.Entities.UsersEntity;
import meneghelHost.demo.Enums.TicketStatusEnum;

public class TicketPostDTO {
	
	
	private Integer number;
	
	private TicketStatusEnum status;

	private RaffleEntity which_raffle;

	private UsersEntity ticket_owner;

	public TicketPostDTO(Integer number, TicketStatusEnum status, RaffleEntity which_raffle, UsersEntity ticket_owner) {
		super();
		this.number = number;
		this.status = status;
		this.which_raffle = which_raffle;
		this.ticket_owner = ticket_owner;
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

	public RaffleEntity getWhich_raffle() {
		return which_raffle;
	}

	public void setWhich_raffle(RaffleEntity which_raffle) {
		this.which_raffle = which_raffle;
	}

	public UsersEntity getTicket_owner() {
		return ticket_owner;
	}

	public void setTicket_owner(UsersEntity ticket_owner) {
		this.ticket_owner = ticket_owner;
	}
	
	
	
}
