package com.mz.cth.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mz.cth.model.Device;
// So instanciamos para operacoes Crud
@Repository
public interface DeviceRepository extends CrudRepository<Device, String> {

Device findById(long id); // Para procura de um elemento por codigo

}