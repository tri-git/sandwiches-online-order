package com.bakery.controller;

import com.bakery.entity.Country;
import com.bakery.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class CountryController {

    private final CountryService mCountryService;

    @Autowired
    public CountryController(CountryService countryService){
        mCountryService = countryService;
    }

    @GetMapping("countries")
    public List<Country> getCountries() {
      return mCountryService.getAllCountry();
    }

    @PostMapping("country")
    public Country createCountry(@RequestBody Country country) {
        return mCountryService.creatCountry(country);
    }

    @GetMapping("countries/{id}")
    public ResponseEntity<Country> getCountryById (@PathVariable("id") int id) {
      return ResponseEntity.ok(mCountryService.getCountryById(id));
    }

    @PutMapping("countries/{id}")
    public ResponseEntity<Country> updateCountry (@PathVariable ("id") int id, @RequestBody Country country) {
        return ResponseEntity.ok(mCountryService.updateCountry(id, country));
    }

    @DeleteMapping("countries/{id}")
    public ResponseEntity<Country> deleteCountry(@PathVariable("id") int id) {
        return ResponseEntity.ok(mCountryService.deleteCountry(id));
    }

}
