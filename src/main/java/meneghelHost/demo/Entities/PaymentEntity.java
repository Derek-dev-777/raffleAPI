package meneghelHost.demo.Entities;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
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
import meneghelHost.demo.Enums.PaymentMethodEnum;
import meneghelHost.demo.Enums.PaymentStatusEnum;

@Entity
@Table(name = "payment_tbl")
public class PaymentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private PaymentMethodEnum method;
	
	@Enumerated(EnumType.STRING)
	private PaymentStatusEnum status;
	
	private Double amount;
	
	@Column(unique = true)
	private String transactionId;
	private String gateway;
	
	private LocalDateTime createdAt;
	private LocalDateTime confirmedAt;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "order_id")
    private OrderEntity order;

	public PaymentEntity(PaymentMethodEnum method, PaymentStatusEnum status, Double amount, String transactionId,
			String gateway, OrderEntity order) {
		super();
		this.method = method;
		this.status = status;
		this.amount = amount;
		this.transactionId = transactionId;
		this.gateway = gateway;
		this.order = order;
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

	public LocalDateTime getConfirmedAt() {
		return confirmedAt;
	}

	public void setConfirmedAt(LocalDateTime confirmedAt) {
		this.confirmedAt = confirmedAt;
	}

	public OrderEntity getOrder() {
		return order;
	}

	public void setOrder(OrderEntity order) {
		this.order = order;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
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
		PaymentEntity other = (PaymentEntity) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
