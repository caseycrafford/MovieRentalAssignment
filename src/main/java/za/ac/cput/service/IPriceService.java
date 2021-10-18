package za.ac.cput.service;

import za.ac.cput.entity.Price;

import java.util.Set;
@Deprecated
public interface IPriceService extends IService<Price,String>{
    Set<Price> getAll();
}
