package br.com.domain.repository;

import br.com.domain.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    boolean existsByName(String vehicleName);
}
