package meneghelHost.demo.DTO.PaymentDTO;

import java.time.LocalDateTime;

import meneghelHost.demo.Enums.PaymentMethodEnum;
import meneghelHost.demo.Enums.PaymentStatusEnum;

public class PaymentGetDTO {
	
	private Long id;
	
	private PaymentMethodEnum method;
	
	private PaymentStatusEnum status;
	
	private Double amount;
	
	private String transactionId;
	
	private String gateway;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime confirmedAt;

    private Long orderId;

	public PaymentGetDTO(Long id, PaymentMethodEnum method, PaymentStatusEnum status, Double amount,
			String transactionId, String gateway, LocalDateTime createdAt, LocalDateTime confirmedAt, Long orderId) {
		super();
		this.id = id;
		this.method = method;
		this.status = status;
		this.amount = amount;
		this.transactionId = transactionId;
		this.gateway = gateway;
		this.createdAt = createdAt;
		this.confirmedAt = confirmedAt;
		this.orderId = orderId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PaymentMethodEnum getMethod() {
		return method;
	}

	public void setMethod(PaymentMethodEnum method) {
		this.method = method;
	}

	public PaymentStatusEnum getStatus() {
		return status;
	}

	public void setStatus(PaymentStatusEnum status) {
		this.status = status;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getGateway() {
		return gateway;
	}

	public void setGateway(String gateway) {
		this.gateway = gateway;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getConfirmedAt() {
		return confirmedAt;
	}

	public void setConfirmedAt(LocalDateTime confirmedAt) {
		this.confirmedAt = confirmedAt;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
    
    
}
