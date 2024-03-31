package ru.valentina.holidaypayment.service;

import ru.valentina.holidaypayment.dto.HolidayRequestDto;
import ru.valentina.holidaypayment.dto.HolidayResponseDto;

/**
 * Интерфейс HolidayPaymentService содержит бизнес-логику расчёта отпускных
 *
 * @author Валентина Вахламова
 */
public interface HolidayPaymentService {

    /**
     * Метод расчёта отпускных
     */
    HolidayResponseDto calculate(HolidayRequestDto holidayRequestDto);
}
