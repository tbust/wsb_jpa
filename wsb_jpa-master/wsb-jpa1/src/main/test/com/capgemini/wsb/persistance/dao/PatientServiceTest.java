package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.AddressTO;
import com.capgemini.wsb.dto.DoctorTO;
import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.service.impl.AddressServiceImpl;
import com.capgemini.wsb.service.impl.DoctorServiceImpl;
import com.capgemini.wsb.service.impl.PatientServiceImpl;
import com.capgemini.wsb.service.impl.VisitServiceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class PatientServiceTest {
    @Autowired
    private PatientService patientService;

    @Test
    void testDeletePatientAndCascadeVisits() {
        PatientTO patient = patientService.findById(1L);
        VisitTO visit = visitService.findById(1L);
        DoctorTO doctor = doctorService.findById(1L);
        AddressTO address = addressService.findById(2L);

        assertThat(patient).isNotNull();
        assertThat(visit).isNotNull();
        assertThat(doctor).isNotNull();
        assertThat(address).isNotNull();

        patientService.delete(1L);
        assertThat(patientService.findById(1L)).isNull();
        assertThat(visitService.findById(1L)).isNull();
        assertThat(doctorService.findById(1L)).isNotNull();
        assertThat(addressService.findById(2L)).isNull();
    }

}

