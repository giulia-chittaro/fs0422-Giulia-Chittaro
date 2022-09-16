import { fakeAsync, ComponentFixture, TestBed } from '@angular/core/testing';
import { InlineLoginFormComponent } from './inline-login-form.component';

describe('InlineLoginFormComponent', () => {
  let component: InlineLoginFormComponent;
  let fixture: ComponentFixture<InlineLoginFormComponent>;

  beforeEach(fakeAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ InlineLoginFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InlineLoginFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should compile', () => {
    expect(component).toBeTruthy();
  });
});
