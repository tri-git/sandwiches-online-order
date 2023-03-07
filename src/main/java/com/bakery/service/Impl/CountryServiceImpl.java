package com.bakery.service.Impl;

import com.bakery.constant.Constant;
import com.bakery.entity.Country;
import com.bakery.exception.ResourceNotFoundException;
import com.bakery.repository.CountryRepo;
import com.bakery.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepo mCountryRepo;

    @Autowired
    public CountryServiceImpl(CountryRepo countryRepo) {
        mCountryRepo = countryRepo;
    }

    @Override
    public List<Country> getAllCountry() {
        List<Country> countries = mCountryRepo.findAll();
        if (countries.isEmpty()) {
            throw new ResourceNotFoundException(Constant.EMPTY_COUNTRY);
        }
        return countries;
    }

    @Override
    public Country creatCountry(Country country) {
        return mCountryRepo.save(country);
    }

    @Override
    public Country getCountryById(int id) {
        Country country = mCountryRepo.findById(id).orElseThrow( () -> new ResourceNotFoundException(Constant.COUNTRY_NOT_FOUND + id));
        return country;
    }

    @Override
    public Country updateCountry(int id, Country model) {
        Country country = mCountryRepo.findById(id).orElseThrow( () -> new ResourceNotFoundException(Constant.COUNTRY_NOT_FOUND + id));
        country.setCode(model.getCode());
        country.setName(model.getName());

        return mCountryRepo.save(country);
    }

    @Override
    public Country deleteCountry(int id) {
        Country country = mCountryRepo.findById(id).orElseThrow( () -> new ResourceNotFoundException(Constant.COUNTRY_NOT_FOUND + id));
        mCountryRepo.delete(country);
        return country;
    }
}
