package meneghelHost.demo.Config;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import meneghelHost.demo.Entities.OrderEntity;
import meneghelHost.demo.Entities.RaffleEntity;
import meneghelHost.demo.Entities.TicketEntity;
import meneghelHost.demo.Entities.UsersEntity;
import meneghelHost.demo.Enums.IsActiveEnum;
import meneghelHost.demo.Enums.OrderStatusEnum;
import meneghelHost.demo.Enums.RolesEnum;
import meneghelHost.demo.Enums.TicketStatusEnum;
import meneghelHost.demo.Repository.OrderRepository;
import meneghelHost.demo.Repository.RaffleRepository;
import meneghelHost.demo.Repository.TicketRepository;
import meneghelHost.demo.Repository.UsersRepository;

@Configuration
public class StarterData {
	
	@Bean
    CommandLineRunner initDatabase(UsersRepository usersRepository,
    								RaffleRepository raffleRepository,
    								TicketRepository ticketRepository,
    								OrderRepository orderRepository){
        return args -> {
        	UsersEntity usersEntity1 = new UsersEntity(
        			"Derek",
        			"derekmeneghel2004@gmail.com",
        			"Honda57",
        			"13988491360",
        			RolesEnum.ADMIN,
        			"DerekMeneghel"
        			);
        	
        	usersRepository.save(usersEntity1);
        	
        	RaffleEntity raffle1 = new RaffleEntity(
        			"Moto zero Honda",
        			"Moto CG 160 titan",
        			"Um link qualquer aqui",
        			0.50,
        			1000,
        			LocalDate.now(),
        			usersEntity1
        			);
        	
        	raffleRepository.save(raffle1);
        	
        	TicketEntity ticket1 = new TicketEntity(
        			1,
        			TicketStatusEnum.AVAIABLE,
        			raffle1,
        			usersEntity1
        			);
        	
        	ticketRepository.save(ticket1);
        	
        	OrderEntity order = new OrderEntity(
        			usersEntity1,
        			raffle1,
        			5.0
        			);
        	
        	orderRepository.save(order);
        	
        	System.out.println("Dados salvos com sucesso");
        	
        	
        	
    
        };
	}
}