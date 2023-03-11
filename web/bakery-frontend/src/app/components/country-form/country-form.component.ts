import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Country } from 'src/app/entity/country';
import { CountryService } from 'src/app/service/country-service.service';

@Component({
  selector: 'app-country-form',
  templateUrl: './country-form.component.html',
  styleUrls: ['./country-form.component.css']
})
export class CountryFormComponent implements OnInit {

  country!: Country;
  


  constructor(private route: ActivatedRoute, private router: Router, private countryService: CountryService) { 
    this.country = new Country;
  }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  onSubmit() {
    this.countryService.createCountry(this.country).subscribe(result => this.gotoCountryList());
  }

  gotoCountryList(){
    this.router.navigate(['/countries']);
  }

}
