package br.com.service;

import br.com.domain.model.Vehicle;
import br.com.domain.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class VehicleServiceImpl implements VehicleService{

    private final VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository){
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle findById(Long id) {
        return vehicleRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Vehicle create(Vehicle vehicleToCreate) {
        if(vehicleRepository.existsByName(vehicleToCreate.getName())){
            throw new IllegalArgumentException("This Vehicle already exists");
        }
        return vehicleRepository.save(vehicleToCreate);
    }
}
