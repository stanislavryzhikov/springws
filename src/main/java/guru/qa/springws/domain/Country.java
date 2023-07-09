package guru.qa.springws.domain;

import guru.qa.springws.domain.entity.CountriesEntity;

import java.util.Date;

public class Country {
    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Country fromUserEntity(CountriesEntity countriesEntity){
        Country country = new Country();
        country.setCode(countriesEntity.getCode());
        country.setName(countriesEntity.getName());
        return  country;
    }
}
