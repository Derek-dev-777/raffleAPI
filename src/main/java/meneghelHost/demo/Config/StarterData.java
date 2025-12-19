package meneghelHost.demo.Config;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import meneghelHost.demo.Entities.RaffleEntity;
import meneghelHost.demo.Entities.UsersEntity;
import meneghelHost.demo.Enums.IsActiveEnum;
import meneghelHost.demo.Enums.RolesEnum;
import meneghelHost.demo.Repository.RaffleRepository;
import meneghelHost.demo.Repository.UsersRepository;

@Configuration
public class StarterData {
	
	@Bean
    CommandLineRunner initDatabase(UsersRepository usersRepository,
    								RaffleRepository raffleRepository){
        return args -> {
        	UsersEntity usersEntity1 = new UsersEntity(
        			"Derek",
        			"derekmeneghel2004@gmail.com",
        			"Honda57",
        			"13988491360",
        			RolesEnum.ADMIN,
        			IsActiveEnum.INACTIVE,
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
        		
        	
        	System.out.println("Dados salvos com sucesso");
        	
        	
        	
    
        };
	}
}