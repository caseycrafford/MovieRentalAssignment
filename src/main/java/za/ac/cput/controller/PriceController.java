package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Price;
import za.ac.cput.factory.PriceFactory;
import za.ac.cput.service.PriceService;

import java.util.Set;

@RestController
@RequestMapping("/price")
public class PriceController {
    @Autowired
    private PriceService priceService;

    @PostMapping("/create")
    public Price create(@RequestBody Price price) {
        Price newPrice = PriceFactory.build(price.getAmount());
        return priceService.create(newPrice);
    }

    @GetMapping("/read{priceId}")
    public Price read(@PathVariable String priceId){
        return priceService.read(priceId);
    }

    @PostMapping("/update")
    public Price update(@RequestBody Price price){
        return priceService.update(price);
    }

    @DeleteMapping("/delete{priceId}")
    public boolean delete(@PathVariable String priceId){
        return priceService.delete(priceId);
    }
    @GetMapping("/getall")
    public Set<Price> getAll(){
        return priceService.getAll();
    }
}
