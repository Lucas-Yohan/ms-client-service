package com.ms_payroll.hr_payroll.feignclients;

import com.ms_payroll.hr_payroll.entities.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "hr-worker", path = "/workers")
public interface WorkerFeignClient {

    @GetMapping("/{id}")
    Worker getById(@PathVariable Long id);

}
