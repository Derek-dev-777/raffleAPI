package meneghelHost.demo.Mappers;


import meneghelHost.demo.DTO.PaymentDTO.PaymentGetDTO;
import meneghelHost.demo.DTO.PaymentDTO.PaymentPostDTO;
import meneghelHost.demo.Entities.PaymentEntity;

public class PaymentMapper {
	
	public static PaymentGetDTO convertEntityToDto(PaymentEntity entity) {
		return new PaymentGetDTO(
				entity.getId(),
				entity.getMethod(),
				entity.getStatus(),
				entity.getAmount(),
				entity.getTransactionId(),
				entity.getGateway(),
				entity.getCreatedAt(),
				entity.getConfirmedAt(),
				entity.getOrder().getId());
	}
	
	public static PaymentEntity convertDtoToEntity(PaymentPostDTO dto) {
		return new PaymentEntity(
				dto.getMethod(),
				dto.getStatus(),
				dto.getAmount(),
				dto.getTransactionId(),
				dto.getGateway(),
				dto.getOrder());
	}
}
