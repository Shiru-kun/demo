package com.mz.cth.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mz.cth.demo.model.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {

Device findById(long id); // Para procura de um elemento por codigo

}