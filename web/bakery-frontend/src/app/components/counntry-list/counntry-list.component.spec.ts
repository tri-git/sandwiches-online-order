import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CounntryListComponent } from './counntry-list.component';

describe('CounntryListComponent', () => {
  let component: CounntryListComponent;
  let fixture: ComponentFixture<CounntryListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CounntryListComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CounntryListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
