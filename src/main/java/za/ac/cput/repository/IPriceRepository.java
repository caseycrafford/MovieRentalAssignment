package za.ac.cput.repository;

import za.ac.cput.entity.Price;

import java.util.Set;

public interface IPriceRepository extends IRepository<Price, String> {
    public Set<Price> getAll();
}
