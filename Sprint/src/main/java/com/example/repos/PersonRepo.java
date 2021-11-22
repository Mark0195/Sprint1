package com.example.repos;

import java.util.List;
import com.example.accessingdatarest.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepo extends PagingAndSortingRepository<Person, Long> {
    List<Person> findByFirstName(@Param("FirstName") String FirstName);
    List<Person> findByLastName(@Param("LastName") String LastName);
    List<Person> findByAddress(@Param("Address") String Address);
    List<Person> findByEmail(@Param("Email") String Email);
    List<Person> findByPhoneNum(@Param("PhoneNum") int PhoneNum);
}