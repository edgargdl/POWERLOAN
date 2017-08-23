import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BuyingMainComponent } from './buying-main.component';

describe('BuyingMainComponent', () => {
  let component: BuyingMainComponent;
  let fixture: ComponentFixture<BuyingMainComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BuyingMainComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BuyingMainComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
