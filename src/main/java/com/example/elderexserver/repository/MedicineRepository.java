package com.example.elderexserver.repository;

import com.example.elderexserver.data.patient.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine, Integer> {
}
