package com.uolhost.calendarAPI.service.impl;

import com.uolhost.calendarAPI.entity.Person;
import com.uolhost.calendarAPI.model.ResponsavelIncidente;
import com.uolhost.calendarAPI.repository.IPersonRepository;
import com.uolhost.calendarAPI.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private IPersonRepository repository;

    @Override
    public List<ResponsavelIncidente> getResponsavelIncidentes() {
        List<Person> personList = repository.findAll(Sort.by("id"));
        List<ResponsavelIncidente> personMap = new ArrayList<>();
        int count = 0;
        for ( int i = -1; personMap.size() <= 10; i++ ) {
            LocalDate date = LocalDate.now().plusDays(Long.valueOf(i));
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            if ( dayOfWeek.toString().equals("SATURDAY") || dayOfWeek.toString().equals("SUNDAY") ) {
                personMap.add(new ResponsavelIncidente("Final de Semana", date));
                continue;
            }
            if ( count == (personList.size() - 1) ) {
                personMap.add(new ResponsavelIncidente(personList.get(personList.size() - 1).getName(), date));
                count = 0;
                continue;
            }
            personMap.add(new ResponsavelIncidente(personList.get(count).getName(), date));
            count++;
        }
        return personMap;
    }

}
