package akr.trainingmicro.akrrestdocsexample.web.mappers;

import org.mapstruct.Mapper;

import akr.trainingmicro.akrrestdocsexample.domain.Beer;
import akr.trainingmicro.akrrestdocsexample.web.model.BeerDto;

/**
 * Created by jt on 2019-05-25.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
