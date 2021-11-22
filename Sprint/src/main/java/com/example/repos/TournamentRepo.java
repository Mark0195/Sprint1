package com.example.repos;

import java.time.LocalTime;
import java.util.List;
import com.example.accessingdatarest.Tournament;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "tournament", path = "tournament")
public interface TournamentRepo extends PagingAndSortingRepository<Tournament, Long> {
    List<Tournament> findByStart(@Param("Start") LocalTime Start);
    List<Tournament> findByEnd(@Param("End") LocalTime End);
    List<Tournament> findByLocation(@Param("Location") String Location);
    List<Tournament> findByFee(@Param("Fee") double Fee);
    List<Tournament> findByPrize(@Param("Prize") double Prize);
    List<Tournament> findByMembers(@Param("Members") String Members);
    List<Tournament> findByStandings(@Param("Standings") String Standings);
}


