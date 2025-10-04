package com.hr_worker.hr_worker.repositories;


import com.hr_worker.hr_worker.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
