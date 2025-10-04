package com.ms_payroll.hr_payroll.services;

import com.ms_payroll.hr_payroll.entities.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServices {

    public Payment getPayment(Long id, int days) {
        return new Payment("Bob", days, 200.0);
    }

}
