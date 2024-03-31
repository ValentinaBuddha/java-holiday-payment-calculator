package ru.valentina.holidaypayment.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.valentina.holidaypayment.dto.HolidayRequestDto;
import ru.valentina.holidaypayment.dto.HolidayResponseDto;

/**
 * Класс HolidayPaymentServiceImpl содержит бизнес-логику расчёта отпускных
 *
 * @author Валентина Вахламова
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class HolidayPaymentServiceImpl implements HolidayPaymentService {

    /**
     * Метод расчёта отпускных
     */
    @Override
    public HolidayResponseDto calculate(HolidayRequestDto holidayRequestDto) {
        log.info("Расчёт отпускных");
        double scale = Math.pow(10, 2);
        Double holidaysPayment = Math.ceil(holidayRequestDto.getAverageSalary() / holidayRequestDto.getVacationDuration() *
                29.3 * scale) / scale;

        HolidayResponseDto holidayResponseDto = new HolidayResponseDto();
        holidayResponseDto.setHolidayPayment(holidaysPayment);
        return holidayResponseDto;
    }
}