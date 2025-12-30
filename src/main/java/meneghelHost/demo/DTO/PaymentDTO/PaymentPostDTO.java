package meneghelHost.demo.DTO.PaymentDTO;

import meneghelHost.demo.Entities.OrderEntity;
import meneghelHost.demo.Enums.PaymentMethodEnum;
import meneghelHost.demo.Enums.PaymentStatusEnum;

public class PaymentPostDTO {

	private PaymentMethodEnum method;
	private PaymentStatusEnum status;
	private Double amount;
	private String transactionId;
	private String gateway;
	private OrderEntity order;
	
	public PaymentPostDTO(PaymentMethodEnum method, PaymentStatusEnum status, Double amount, String transactionId,
			String gateway, OrderEntity order) {
		super();
		this.method = method;
		this.status = status;
		this.amount = amount;
		this.transactionId = transactionId;
		this.gateway = gateway;
		this.order = order;
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

	public OrderEntity getOrder() {
		return order;
	}

	public void setOrder(OrderEntity order) {
		this.order = order;
	}
	
	
}
