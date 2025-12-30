package meneghelHost.demo.Entities;

import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
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
import meneghelHost.demo.Enums.OrderStatusEnum;

@Entity

@Table(name = "order_tbl")
public class OrderEntity {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    private Double totalAmount;

	    @Enumerated(EnumType.STRING)
	    private OrderStatusEnum status; 
	
	    private LocalDateTime createdAt = LocalDateTime.now();
	    
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "user_id", nullable=false)
	    private UsersEntity user;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "raffle_id", nullable=false)
	    private RaffleEntity raffle;
	    
	    @OneToMany(mappedBy = "order")
	    private List<PaymentEntity> payments = new ArrayList<>();
	    
	    public OrderEntity() {}

		public OrderEntity(UsersEntity user, RaffleEntity raffle, Double totalAmount) {
			super();
			this.user = user;
			this.raffle = raffle;
			this.totalAmount = totalAmount;
			this.status = OrderStatusEnum.CREATED;
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

		public OrderStatusEnum getStatus() {
			return status;
		}

		public void setStatus(OrderStatusEnum status) {
			this.status = status;
		}

		public Long getId() {
			return id;
		}

		public LocalDateTime getCreatedAt() {
			return createdAt;
		}

		public List<PaymentEntity> getPayments() {
			return payments;
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
			OrderEntity other = (OrderEntity) obj;
			return Objects.equals(id, other.id);
		}
		
		
	    
	    
}


