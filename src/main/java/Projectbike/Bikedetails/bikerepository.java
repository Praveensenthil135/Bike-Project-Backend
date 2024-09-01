package Projectbike.Bikedetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bikerepository extends JpaRepository<bikeentity,String>
{
    public bikeentity findByBikeBrand(String brand);
}
