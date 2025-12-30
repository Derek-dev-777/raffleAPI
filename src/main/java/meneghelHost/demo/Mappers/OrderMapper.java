package meneghelHost.demo.Mappers;

import java.util.stream.Collectors;

import meneghelHost.demo.DTO.OrderDTO.OrderGetDTO;
import meneghelHost.demo.DTO.OrderDTO.OrderPostDTO;
import meneghelHost.demo.Entities.OrderEntity;

public class OrderMapper {
	
	public static OrderGetDTO convertEntityToDto(OrderEntity entity) {
		return new OrderGetDTO(
				entity.getId(),
				entity.getTotalAmount(),
				entity.getStatus(),
				entity.getCreatedAt(),
				entity.getUser().getId(),
				entity.getRaffle().getId(),
				entity.getPayments().stream().map(PaymentMapper::convertEntityToDto).collect(Collectors.toList()));
	}
	
	public static OrderEntity convertDtoToEntity(OrderPostDTO dto) {
		return new OrderEntity(
				dto.getUser(),
				dto.getRaffle(),
				dto.getTotalAmount());
	}
}
