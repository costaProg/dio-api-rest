package br.com.service;

import br.com.domain.model.Vehicle;

public interface VehicleService {

    Vehicle findById(Long id);

    Vehicle create(Vehicle vehicleCreate);

}
