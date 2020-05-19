import { TestBed, inject } from '@angular/core/testing';

import { LaunchingServiceService } from './launching-service.service';

describe('LaunchingServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [LaunchingServiceService]
    });
  });

  it('should ...', inject([LaunchingServiceService], (service: LaunchingServiceService) => {
    expect(service).toBeTruthy();
  }));
});
