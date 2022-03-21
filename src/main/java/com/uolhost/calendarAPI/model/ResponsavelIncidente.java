package com.uolhost.calendarAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class ResponsavelIncidente {

    private String nomeResponsavel;
    private LocalDate dataIncidente;

}
