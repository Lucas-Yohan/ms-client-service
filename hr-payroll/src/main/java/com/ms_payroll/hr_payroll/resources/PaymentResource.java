package com.ms_payroll.hr_payroll.resources;

import com.ms_payroll.hr_payroll.entities.Payment;
import com.ms_payroll.hr_payroll.services.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
@RequiredArgsConstructor
public class PaymentResource {

    private final PaymentService paymentServices;

    @GetMapping("/{workerId}/days/{days}" )
    public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable int days){
        Payment payment = paymentServices.getPayment(workerId, days);
        return ResponseEntity.ok(payment);
    }

}
