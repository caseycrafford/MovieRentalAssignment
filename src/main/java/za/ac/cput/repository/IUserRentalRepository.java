package za.ac.cput.repository;

import za.ac.cput.entity.UserRental;
import java.util.Set;

public interface IUserRentalRepository extends IRepository<UserRental, Integer> {
    public Set<UserRental> getAll();
}
