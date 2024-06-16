package com.project.judging_app_server.DTOs.Mapper;

import com.project.judging_app_server.DTOs.CriteriaDTO;
import com.project.judging_app_server.Entities.Criteria;
import org.springframework.stereotype.Component;

@Component
public class CriteriaMapper {

    public CriteriaDTO toCriteriaDTO(Criteria criteria) {
        CriteriaDTO criteriaDTO = new CriteriaDTO();
        criteriaDTO.setId(criteria.getId());
        criteriaDTO.setCriteriaName(criteria.getCriteriaName());
        criteriaDTO.setMark(criteria.getMark());
        criteriaDTO.setCreateAt(criteria.getCreateAt());
        criteriaDTO.setModifyAt(criteria.getModifyAt());
        criteriaDTO.setModifyBy(criteria.getModifyBy());
        criteriaDTO.setCreateBy(criteria.getCreateBy());
        criteriaDTO.setDescription(criteria.getDescription());
        return criteriaDTO;
    }

    public Criteria toCriteria(CriteriaDTO criteriaDTO) {
        Criteria criteria = new Criteria();
        criteria.setCriteriaName(criteriaDTO.getCriteriaName());
        criteria.setMark(criteriaDTO.getMark());
        criteria.setCreateAt(criteriaDTO.getCreateAt());
        criteria.setModifyAt(criteriaDTO.getModifyAt());
        criteria.setModifyBy(criteriaDTO.getModifyBy());
        criteria.setCreateBy(criteriaDTO.getCreateBy());
        criteria.setDescription(criteriaDTO.getDescription());
        return criteria;
    }
}
