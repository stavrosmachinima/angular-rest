import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Task1aComponent } from './task1a.component';

describe('Task1AComponent', () => {
  let component: Task1aComponent;
  let fixture: ComponentFixture<Task1aComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Task1aComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Task1aComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
