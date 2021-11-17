package com.example.accessingdatarest;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "tournament", path = "tournament")

public interface TournamentRepo extends PagingAndSortingRepository<Tournament, Long> {

    List<Tournament> findByStartOfTournament(@Param("Start") String Start);

}


