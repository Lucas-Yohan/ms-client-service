package com.ms_payroll.hr_payroll.services;

import com.ms_payroll.hr_payroll.entities.Payment;
import com.ms_payroll.hr_payroll.entities.Worker;
import com.ms_payroll.hr_payroll.feignClients.WorkerFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long id, int days) {
        Worker worker = workerFeignClient.getById(id);
        return new Payment(worker.getName(), days, worker.getDailyIncome());
    }

}
