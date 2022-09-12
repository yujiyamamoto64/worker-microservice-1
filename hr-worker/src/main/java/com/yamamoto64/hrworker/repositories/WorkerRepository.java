package com.yamamoto64.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yamamoto64.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
