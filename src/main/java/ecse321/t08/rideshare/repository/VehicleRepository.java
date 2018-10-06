package ecse321.t08.rideshare.repository;

import ecse321.t08.rideshare.entity.Vehicle;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class VehicleRepository {

	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public Vehicle createVehicle(int driverId, int nbOfSeats, String colour, String model, String vehicleType) {
        Vehicle aVehicle = new Vehicle();
        aVehicle.setDriverId(driverId);
        aVehicle.setNbOfSeats(nbOfSeats);
        aVehicle.setColour(colour);
        aVehicle.setModel(model);
        aVehicle.setVehicleType(vehicleType);
        em.persist(aVehicle);
        return aVehicle;
	}

    @Transactional
    public Vehicle getVehicle(int id) {
        return em.find(Vehicle.class, id);
    }

    @Transactional
    public int findVehicleForDriver(int driverid) {
        List<Vehicle> vehList = em.createNamedQuery("Vehicle.findAll").getResultList();
        vehList =  vehList.stream().filter(u -> u.getDriverId() == driverid)
                .collect(Collectors.toList());

        if(vehList.size() > 1 || vehList.size() < 1) {
            return -1;
        } else
            return vehList.get(0).getVehicleId();
    }
}