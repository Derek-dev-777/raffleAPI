package meneghelHost.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import meneghelHost.demo.Entities.TicketEntity;

@Repository
public interface TicketRepository extends JpaRepository<TicketEntity, Long>{

}
