package com.capgemini.wsb.mapper;


import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import org.springframework.stereotype.Component;
public final class VisitMapper {


    public static VisitTO mapToTO(final VisitEntity visitEntity){

        if(visitEntity == null) {
            return null;
        }

        final VisitTO visitTO = new VisitTO();
        visitTO.setId(visitEntity.getId());
        visitTO.setDescription(visitEntity.getDescription());
        visitTO.setTime(visitEntity.getTime());
        visitTO.setDoctor(visitEntity.getDoctor());
        visitTO.setPatient(visitEntity.getPatient());
        return visitTO;

    }

    public static VisitEntity mapToEntity(final VisitTO visitTO){

        if(visitTO == null) {
            return null;
        }

        final VisitEntity visitEntity = new VisitEntity();
        visitEntity.setId(visitTO.getId());
        visitEntity.setDescription(visitTO.getDescription());
        visitEntity.setTime(visitTO.getTime());
        visitEntity.setDoctor(visitTO.getDoctor());
        visitEntity.setPatient(visitTO.getPatient());
        return visitEntity;


    }


}
