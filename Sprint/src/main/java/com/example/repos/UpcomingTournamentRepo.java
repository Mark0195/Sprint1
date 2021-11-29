package com.example.repos;


import com.example.accessingdatarest.UpcomingTournament;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.time.LocalDate;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "current", path = "current")
public interface UpcomingTournamentRepo extends PagingAndSortingRepository<UpcomingTournament, Long> {
    List<UpcomingTournament> findByUpcomingTournamentDate(@Param("upcomingTournamentDate") LocalDate upcomingTournamentDate);
    List<UpcomingTournament> findUpcomingTournamentByTournament(@Param("tournament") LocalDate tournament);
}