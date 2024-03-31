package ru.valentina.holidaypayment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Класс HolidayResponseDto для передачи информации о сумме отпускных
 *
 * @author Валентина Вахламова
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HolidayResponseDto {

    /**
     * Сумма отпускных
     */
    private Double holidayPayment;
}
