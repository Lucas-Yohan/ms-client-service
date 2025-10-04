package com.hr_worker.hr_worker.resources;

import com.hr_worker.hr_worker.entity.Worker;
import com.hr_worker.hr_worker.repositories.WorkerRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
@RequiredArgsConstructor
public class WorkerResource {

    private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);
    private final Environment env;

    private final WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> getAll() {
        List<Worker> works = workerRepository.findAll();
        return ResponseEntity.ok(works);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> getById(@PathVariable Long id) {
        logger.info("Port = " + env.getProperty("local.server.port"));

        Worker worker = workerRepository.findById(id).orElse(null);
        return ResponseEntity.ok(worker);
    }

}
