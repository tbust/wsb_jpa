package com.capgemini.wsb.persistence.dao;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;


@Test
public void testFindPatientByLastName() {
        List<PatientEntity> patient = patientDao.findByLastName("Janina");
        assertThat(patient).isNotNull();
        assertThat(patient.size()).isEqualTo(1);
        assertThat(patient.get(0).getFirstName()).isEqualTo("Igor");
        patient = patientDao.findByLastName("Kowalski");
        assertThat(patient).isNotNull();
        assertThat(patient.size()).isEqualTo(2);
        assertThat(patient.get(0).getFirstName()).isEqualTo("Janina");
        assertThat(patient.get(1).getFirstName()).isEqualTo("Igor");
        }

