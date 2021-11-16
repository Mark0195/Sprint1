package com.example.accessingdatarest;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Memberships", path = "Memberships")

public interface MembershipRepo extends PagingAndSortingRepository<Membership, Long> {

    List<Membership> findByLastName(@Param("Name") String Name);


}
