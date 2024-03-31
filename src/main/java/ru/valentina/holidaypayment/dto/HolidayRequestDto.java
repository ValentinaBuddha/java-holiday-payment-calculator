package ru.valentina.holidaypayment.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

/**
 * Класс HolidayRequestDto для передачи тела запроса на сервер с данными о средней зарплате и продолжительности отпуска
 *
 * @author Валентина Вахламова
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HolidayRequestDto {

    /**
     * Средняя месячная зарплата за последние 12 месяцев
     */
    @NotNull
    @Positive
    private Double averageSalary;

    /**
     * Продолжительность отпуска
     */
    @NotNull
    @Positive
    private Integer vacationDuration;
}