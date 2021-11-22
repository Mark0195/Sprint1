package com.example.repos;

import java.util.List;
import java.time.LocalDate;
import com.example.accessingdatarest.Membership;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "membership", path = "membership")
public interface MembershipRepo extends PagingAndSortingRepository<Membership, Long> {
    List<Membership> findByStartDate(@Param("StartDate") LocalDate StartDate);
    List<Membership> findByDuration(@Param("Duration") LocalDate Duration);
    List<Membership> findByMembershipType(@Param("MembershipType") String MembershipType);
    List<Membership> findByCurrentTournaments(@Param("CurrentTournaments") String CurrentTournaments);
    List<Membership> findByPastTournaments(@Param("PastTournaments") String PastTournaments);
    List<Membership> findByUpcomingTournaments(@Param("UpcomingTournaments") String UpcomingTournaments);
}
