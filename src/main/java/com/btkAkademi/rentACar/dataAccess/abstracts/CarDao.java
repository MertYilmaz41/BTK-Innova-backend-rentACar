package com.btkAkademi.rentACar.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;


import com.btkAkademi.rentACar.entities.concretes.Car;

public interface CarDao extends JpaRepository<Car, Integer>{
	//@Query(value = "select cars.id as rental_id,\r\n"
			//+ "	rentals.return_date\r\n"
			//+ "from cars\r\n"
			//+ "left join car_maintenances on cars.id = car_maintenances.car_id and car_maintenances.maintenance_end_time is null\r\n"
			//+ "left join rentals on cars.id = rentals.car_id and (rentals.return_date is null or rentals.return_date>NOW())\r\n"
			//+ "where car_maintenances.id is null and rentals.id is null and cars.segment_id =?1	",nativeQuery = true)
	//List<Integer> findAvailableCarBySegment(Integer segmentId);
}
