import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CountryListComponent } from './components/counntry-list/counntry-list.component';
import { CountryDetailsComponent } from './components/country-details/country-details.component';
import { CountryFormComponent } from './components/country-form/country-form.component';

const routes: Routes = [
  { path: '', redirectTo: 'countries', pathMatch: 'full'}, 
  { path: 'countries', component: CountryListComponent },
  { path: 'country', component: CountryFormComponent},
  { path: 'countries/:id', component: CountryDetailsComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
