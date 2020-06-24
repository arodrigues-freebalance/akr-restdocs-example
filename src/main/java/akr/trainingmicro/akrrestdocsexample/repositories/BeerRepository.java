package akr.trainingmicro.akrrestdocsexample.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import akr.trainingmicro.akrrestdocsexample.domain.Beer;

import java.util.UUID;

/**
 * Created by jt on 2019-05-17.
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
