package guru.qa.springws.controller;

import guru.qa.springws.domain.Country;
import guru.qa.springws.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Component
//@Service
//@Controller
@RestController()
@RequestMapping("api/internal")
public class MainController {

    private final ICountryService countryService;

    @Autowired
    public MainController(ICountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/countries")
    public Country getDefaultCountry() {
        return countryService.getCountry();
    }
}
