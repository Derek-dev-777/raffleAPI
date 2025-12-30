package meneghelHost.demo.Mappers;


import java.util.stream.Collectors;

import meneghelHost.demo.DTO.RaffleDTO.RaffleGetDTO;
import meneghelHost.demo.DTO.RaffleDTO.RafflePostDTO;
import meneghelHost.demo.Entities.RaffleEntity;

public class RaffleMapper {
	
	public static RaffleGetDTO convertEntityToDTO(RaffleEntity entity) {
		return new RaffleGetDTO(
				entity.getId(),
				entity.getTitle(),
				entity.getDescription(),
				entity.getTicket_price(),
				entity.getTotal_tickets(),
				entity.getDraw_date(),
				entity.getCreated_at(),
				entity.getUpdated_at(),
				entity.getStatus(),
				entity.getUserOrganizer().getId(),
				entity.getListOfOrders().stream().map(OrderMapper::convertEntityToDto).collect(Collectors.toList()),
				entity.getTickets().stream().map(TicketMapper::convertEntityToDto).collect(Collectors.toList()));
				}
	
	public static RaffleEntity convertDtoToEntity(RafflePostDTO dto) {
		return new RaffleEntity(
				dto.getTitle(),
				dto.getDescription(),
				dto.getImage_url(),
				dto.getTicket_price(),
				dto.getTotal_tickets(),
				dto.getDraw_date(),
				dto.getUserOrganizer());
	}
}
