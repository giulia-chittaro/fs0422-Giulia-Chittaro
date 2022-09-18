import { fakeAsync, ComponentFixture, TestBed } from '@angular/core/testing';
import { WithAnIconComponent } from './with-an-icon.component';

describe('WithAnIconComponent', () => {
  let component: WithAnIconComponent;
  let fixture: ComponentFixture<WithAnIconComponent>;

  beforeEach(fakeAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ WithAnIconComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(WithAnIconComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should compile', () => {
    expect(component).toBeTruthy();
  });
});
