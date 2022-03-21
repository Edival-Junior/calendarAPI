package com.uolhost.calendarAPI.repository;

import com.uolhost.calendarAPI.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepository extends JpaRepository<Person, Long>{

}
