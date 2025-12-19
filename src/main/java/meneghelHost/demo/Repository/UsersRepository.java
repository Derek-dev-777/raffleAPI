package meneghelHost.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import meneghelHost.demo.Entities.UsersEntity;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Long>{

}
