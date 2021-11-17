package com.example.repos;

import java.util.List;
import java.time.LocalDate;
import com.example.accessingdatarest.Membership;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Membership", path = "Membership")

public interface MembershipRepo extends PagingAndSortingRepository<Membership, Long> {
    List<Membership> findByMembershipFirstName(@Param("FirstName") String FirstName);
    List<Membership> findByMembershipLastName(@Param("Lastname") String Lastname);
    List<Membership> findByMembershipAddress(@Param("Address") String Address);
    List<Membership> findByMembershipEmail(@Param("Email") String Email);
    List<Membership> findByMembershipPhoneNum(@Param("PhoneNum") int PhoneNum);
    List<Membership> findByMembershipStartDate(@Param("StartDate") LocalDate StartDate);
    List<Membership> findByMembershipDuration(@Param("Duration") LocalDate Duration);
    List<Membership> findByMembership(@Param("Membership") String Membership);
    List<Membership> findByMembershipCurrentTournaments(@Param("CurrentTournaments") String CurrentTournaments);
    List<Membership> findByMembershipPastTournaments(@Param("PastTournaments") String PastTournaments);
    List<Membership> findByMembershipUpcomingTournaments(@Param("UpcomingTournaments") String UpcomingTournaments);

}
