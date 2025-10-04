package com.ms_payroll.hr_payroll.services;

import com.ms_payroll.hr_payroll.entities.Payment;
import com.ms_payroll.hr_payroll.entities.Worker;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PaymentService {

    @Value("${hr-worker.host}")
    private String workerHost;

    private final RestTemplate restTemplate;

    public Payment getPayment(Long id, int days) {
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", "" + id);

        Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
        return new Payment(worker.getName(), days, worker.getDailyIncome());
    }

}
