package ru.valentina.holidaypayment.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.valentina.holidaypayment.dto.HolidayRequestDto;
import ru.valentina.holidaypayment.dto.HolidayResponseDto;
import ru.valentina.holidaypayment.service.HolidayPaymentService;

import javax.validation.Valid;

/**
 * Класс PublicController содержит эндпойнт для расчета отпускных.
 *
 * @author Валентина Вахламова
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/public")
public class HolidayPaymentController {

    private final HolidayPaymentService holidayPaymentService;

    /**
     * Эндпойнт расчёта отпускных на основе среднемесячной зарплаты за последние 12 месяцев и продолжительности отпуска
     */
    @GetMapping("/calculate")
    public HolidayResponseDto calculate(@Valid @RequestBody HolidayRequestDto holidayRequestDto) {
        return holidayPaymentService.calculate(holidayRequestDto);
    }
}