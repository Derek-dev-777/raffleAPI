package meneghelHost.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import meneghelHost.demo.Entities.RaffleEntity;

@Repository
public interface RaffleRepository extends JpaRepository<RaffleEntity, Long>{

}
