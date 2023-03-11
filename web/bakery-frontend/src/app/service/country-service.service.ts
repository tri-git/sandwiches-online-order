import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders} from '@angular/common/http'
import { Country } from '../entity/country'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CountryService {

  private countriesUrl: string;
  private addCountryUrl: string;

  constructor(private http: HttpClient) { 
    this.countriesUrl = 'http://localhost:8080/api/v1/countries'; 
    this.addCountryUrl = 'http://localhost:8080/api/v1/country';
}

public getCountries(): Observable<Country[]> {
return this.http.get<Country[]>(this.countriesUrl);
}

public createCountry(country: Country): Observable<Country> {
return this.http.post<Country>(this.addCountryUrl, country);
}

public getCountry(id: number): Observable<Country> {
 return this.http.get<Country>(`${this.countriesUrl}/${id}`);
}

public updateCountry(id: number, country: Country) : Observable<Country> {
  return this.http.put(`${this.countriesUrl}/${id}`, country);
}

public deleteCountry(id: number): Observable<Country> {
  return this.http.delete(`${this.countriesUrl}/${id}`);
}

public searchByName(name: string): Observable<Country> {
  return this.http.get(`${this.countriesUrl}?name=${name}`);
} 

}
