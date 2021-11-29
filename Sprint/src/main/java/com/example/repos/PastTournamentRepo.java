package com.example.repos;

import com.example.accessingdatarest.MembershipType;
import com.example.accessingdatarest.PastTournament;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.time.LocalDate;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "past", path = "past")
public interface PastTournamentRepo extends PagingAndSortingRepository<PastTournament, Long> {
    List<PastTournament> findByPastTournamentDate(@Param("pastTournamentDate") LocalDate pastTournamentDate);
    List<PastTournament> findPastTournamentByTournament(@Param("tournament") LocalDate tournament);
}