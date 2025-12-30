package meneghelHost.demo.Mappers;

import java.util.stream.Collectors;


import meneghelHost.demo.DTO.UsersDTO.UserGetDTO;
import meneghelHost.demo.DTO.UsersDTO.UserPostDTO;
import meneghelHost.demo.Entities.UsersEntity;

public class UserMapper {
	
	
	public static UserGetDTO convertEntityToDTO(UsersEntity entity){
		return new UserGetDTO(
				entity.getId(),
				entity.getName(),
				entity.getEmail(),
				entity.getPhone_number(),
				entity.getRole(),
				entity.getIs_active(),
				entity.getCreated_at(),
				entity.getUpdated_at(),
				entity.getDultalt(),
				entity.getListOfRaffles().stream().map(RaffleMapper::convertEntityToDTO).collect(Collectors.toList()),
				entity.getListOfTickets().stream().map(TicketMapper::convertEntityToDto).collect(Collectors.toList()),
				entity.getListOfOrders().stream().map(OrderMapper::convertEntityToDto).collect(Collectors.toList())
				);
	}
	
	public static UsersEntity convertDtoToEntity(UserPostDTO dto) {
		return new UsersEntity(
				dto.getName(),
				dto.getEmail(),
				dto.getPassword(),
				dto.getPhone_number(),
				dto.getRoles(),
				dto.getDultalt());
				
	}
}
