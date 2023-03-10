package be.thomasmore.party.repositories;

import be.thomasmore.party.model.Artist;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ArtistRepository extends CrudRepository<Artist, Integer> {
    Optional<Artist> findFirstByIdLessThanOrderByIdDesc(int id);
    Optional<Artist> findFirstByIdGreaterThanOrderById(int id);
    Optional<Artist> findFirstByOrderByIdDesc();
    Optional<Artist> findFirstByOrderByIdAsc();
}
