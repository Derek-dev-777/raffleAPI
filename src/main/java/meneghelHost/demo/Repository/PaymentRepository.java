package meneghelHost.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import meneghelHost.demo.Entities.PaymentEntity;


@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, Long>{

}
