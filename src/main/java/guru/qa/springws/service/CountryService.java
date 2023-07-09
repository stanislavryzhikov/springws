package guru.qa.springws.service;


import guru.qa.springws.domain.Country;
import guru.qa.springws.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService implements ICountryService {


    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Country getCountry() {
        return Country.fromUserEntity(countryRepository.getCountryByCode("KZ"));

    }
}
