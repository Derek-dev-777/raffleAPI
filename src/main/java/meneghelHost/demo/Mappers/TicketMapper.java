package meneghelHost.demo.Mappers;

import meneghelHost.demo.DTO.TicketDTO.TicketGetDTO;
import meneghelHost.demo.DTO.TicketDTO.TicketPostDTO;
import meneghelHost.demo.Entities.TicketEntity;

public class TicketMapper {
	
	public static TicketGetDTO convertEntityToDto(TicketEntity entity) {
		return new TicketGetDTO(
				entity.getId(),
				entity.getNumber(),
				entity.getStatus(),
				entity.getReserved_at(),
				entity.getUpdated_at(),
				entity.getDultalt(),
				entity.getWhich_raffle().getId(),
				entity.getRaffle_owner().getId());
		}

	public static TicketEntity convertDtoToEntity(TicketPostDTO dto) {
		return new TicketEntity(
				dto.getNumber(),
				dto.getStatus(),
				dto.getWhich_raffle(),
				dto.getTicket_owner());
	}
	
}
