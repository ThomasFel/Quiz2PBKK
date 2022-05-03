package com.blockdev.pbkk.service;

import com.blockdev.pbkk.model.Services;
import com.blockdev.pbkk.repository.ServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ServicesService extends AbstractService<Services, Long> {
    @Autowired
    private ServicesRepository servicesRepository;

    @Override
    protected JpaRepository<Services, Long> getRepository() {
        return servicesRepository;
    }
}
