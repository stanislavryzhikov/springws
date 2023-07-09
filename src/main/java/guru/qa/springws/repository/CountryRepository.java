package guru.qa.springws.repository;

import guru.qa.springws.domain.entity.CountriesEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CountryRepository extends CrudRepository<CountriesEntity, UUID> {
        CountriesEntity getCountryByCode(String code);

}
