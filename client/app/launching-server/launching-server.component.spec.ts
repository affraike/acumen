import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LaunchingServerComponent } from './launching-server.component';

describe('LaunchingServerComponent', () => {
  let component: LaunchingServerComponent;
  let fixture: ComponentFixture<LaunchingServerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LaunchingServerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LaunchingServerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
