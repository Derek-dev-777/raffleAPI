package meneghelHost.demo.DTO.OrderDTO;

import java.time.LocalDateTime;
import java.util.List;

import meneghelHost.demo.DTO.PaymentDTO.PaymentGetDTO;
import meneghelHost.demo.Enums.OrderStatusEnum;

public class OrderGetDTO {
	
	private Long id;
    
    private Double totalAmount;

    private OrderStatusEnum status; 

    private LocalDateTime createdAt;
    
    private Long userId;

    private Long raffleId;
    
    private List<PaymentGetDTO> payments;

	public OrderGetDTO(Long id, Double totalAmount, OrderStatusEnum status, LocalDateTime createdAt, Long userId,
			Long raffleId, List<PaymentGetDTO> payments) {
		super();
		this.id = id;
		this.totalAmount = totalAmount;
		this.status = status;
		this.createdAt = createdAt;
		this.userId = userId;
		this.raffleId = raffleId;
		this.payments = payments;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public OrderStatusEnum getStatus() {
		return status;
	}

	public void setStatus(OrderStatusEnum status) {
		this.status = status;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRaffleId() {
		return raffleId;
	}

	public void setRaffleId(Long raffleId) {
		this.raffleId = raffleId;
	}

	public List<PaymentGetDTO> getPayments() {
		return payments;
	}

	public void setPayments(List<PaymentGetDTO> payments) {
		this.payments = payments;
	}
    
    
    
}
