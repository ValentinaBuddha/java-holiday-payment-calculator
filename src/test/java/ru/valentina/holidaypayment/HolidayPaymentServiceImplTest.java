package ru.valentina.holidaypayment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.valentina.holidaypayment.dto.HolidayRequestDto;
import ru.valentina.holidaypayment.dto.HolidayResponseDto;
import ru.valentina.holidaypayment.service.HolidayPaymentService;
import ru.valentina.holidaypayment.service.HolidayPaymentServiceImpl;

class HolidayPaymentServiceImplTest {

    HolidayRequestDto holidayRequestDto = new HolidayRequestDto();
    HolidayPaymentService holidayPaymentService = new HolidayPaymentServiceImpl();

    @Test
    void calculate_whenAverageSalaryIs1AndVacationDurationIs1_thenGetHolidayPayment() {
        holidayRequestDto.setAverageSalary(1.00);
        holidayRequestDto.setVacationDuration(1);

        HolidayResponseDto holidayResponseDto = holidayPaymentService.calculate(holidayRequestDto);

        Assertions.assertEquals(holidayResponseDto.getHolidayPayment(), 29.3);
    }

    @Test
    void calculate_whenAverageSalaryIs1000AndVacationDurationIs1_thenGetHolidayPayment() {
        holidayRequestDto.setAverageSalary(1000.00);
        holidayRequestDto.setVacationDuration(1);

        HolidayResponseDto holidayResponseDto = holidayPaymentService.calculate(holidayRequestDto);

        Assertions.assertEquals(holidayResponseDto.getHolidayPayment(), 29300.00);
    }

    @Test
    void calculate_whenAverageSalaryIs1000AndVacationDurationIs10_thenGetHolidayPayment() {
        holidayRequestDto.setAverageSalary(1000.00);
        holidayRequestDto.setVacationDuration(10);

        HolidayResponseDto holidayResponseDto = holidayPaymentService.calculate(holidayRequestDto);

        Assertions.assertEquals(holidayResponseDto.getHolidayPayment(), 2930.00);
    }
}