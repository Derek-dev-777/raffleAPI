package meneghelHost.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import meneghelHost.demo.Entities.OrderEntity;


@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long>{

}
