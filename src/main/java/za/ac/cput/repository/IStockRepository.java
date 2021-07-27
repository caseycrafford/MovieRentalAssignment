package za.ac.cput.repository;

import za.ac.cput.entity.Stock;

import java.util.Set;

public interface IStockRepository extends IRepository<Stock, String> {
    public Set<Stock> getAll();
}