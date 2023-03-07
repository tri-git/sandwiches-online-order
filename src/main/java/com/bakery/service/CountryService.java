package com.bakery.service;

import com.bakery.entity.Country;

import java.util.List;

public interface CountryService {

    List<Country> getAllCountry();

    Country creatCountry(Country country);

    Country getCountryById (int id);

    Country updateCountry(int id, Country country);

    Country deleteCountry(int id);
}
