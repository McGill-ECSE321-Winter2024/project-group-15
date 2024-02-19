package ca.mcgill.ecse321.sportsregistrationw24.dao;

import ca.mcgill.ecse321.sportsregistrationw24.model.CourseOffering;
import ca.mcgill.ecse321.sportsregistrationw24.model.CustomerAccount;
import ca.mcgill.ecse321.sportsregistrationw24.model.Registration;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RegistrationRepository extends CrudRepository<Registration, Integer> {
    List<Registration> findByCustomerAccount(CustomerAccount customerAccount);
    List<Registration> findByCourseOffering(CourseOffering courseOffering);
    boolean existsByCustomerAccountAndCourseOffering(CustomerAccount customerAccount, CourseOffering courseOffering);
}