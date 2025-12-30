package meneghelHost.demo.DTO.OrderDTO;

import meneghelHost.demo.Entities.RaffleEntity;
import meneghelHost.demo.Entities.UsersEntity;

public class OrderPostDTO {
	
	private UsersEntity user;
	
	private RaffleEntity raffle; 
	
	private Double totalAmount;

	public OrderPostDTO(UsersEntity user, RaffleEntity raffle, Double totalAmount) {
		super();
		this.user = user;
		this.raffle = raffle;
		this.totalAmount = totalAmount;
	}

	public UsersEntity getUser() {
		return user;
	}

	public void setUser(UsersEntity user) {
		this.user = user;
	}

	public RaffleEntity getRaffle() {
		return raffle;
	}

	public void setRaffle(RaffleEntity raffle) {
		this.raffle = raffle;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
}
