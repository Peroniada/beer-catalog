package edu.peronade;

import edu.peronade.entity.Beer;
import edu.peronade.entity.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

/**
 * Created by peronade on 30.12.16.
 */

@RepositoryRestResource
public interface DrinkRepository extends JpaRepository<Beer, Long> {
    public Collection<Drink> findByStyleOrderByScoreDesc(String style);
    public Collection<Drink> findAllByOrderByScoreDesc();
}
