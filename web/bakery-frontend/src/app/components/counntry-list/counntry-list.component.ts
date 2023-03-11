import { Component, OnInit } from '@angular/core';
import { Country } from 'src/app/entity/country'; 
import { CountryService } from 'src/app/service/country-service.service';

@Component({
  selector: 'app-counntry-list',
  templateUrl: './counntry-list.component.html',
  styleUrls: ['./counntry-list.component.css']
})
export class CountryListComponent implements OnInit {

  countries: Country[] = [];
  constructor(private countryService: CountryService) { }

  ngOnInit() {
    this.countryService.getCountries().subscribe(data => {
      this.countries = data;
    });
  }

}
