package com.uolhost.calendarAPI.service;

import com.uolhost.calendarAPI.model.ResponsavelIncidente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class PersonServiceTest {

    @Autowired
    private PersonService service;

    private List<ResponsavelIncidente> responsavelIncidenteList;

    @BeforeEach
    void setUp() {
        responsavelIncidenteList = service.getResponsavelIncidentes();
    }

    @Test
    void givenResponsavelIncidenteListThenCheckTimeInterval() {
        //Verifica se Primeiro index corresponde ao dia de ontem
        Assertions.assertEquals(responsavelIncidenteList.get(0).getDataIncidente(), LocalDate.now().minusDays(1) );
        //Verifica se ultimo index corresponde a data de nove dias posteriores
        Assertions.assertEquals(responsavelIncidenteList.get(10).getDataIncidente(), LocalDate.now().plusDays(9) );
        //Verifica se tamanho da lista corresponde a lista prevista
        Assertions.assertEquals(responsavelIncidenteList.size(), 11);
    }
}