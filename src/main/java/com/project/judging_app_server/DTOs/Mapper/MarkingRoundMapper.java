package com.project.judging_app_server.DTOs.Mapper;


import com.project.judging_app_server.DTOs.MarkingRoundDTO;
import com.project.judging_app_server.Entities.MarkingRound;
import org.springframework.stereotype.Component;

@Component
public class MarkingRoundMapper {

    public MarkingRoundDTO toMarkingRoundDTO(MarkingRound markingRound) {
        MarkingRoundDTO markingRoundDTO = new MarkingRoundDTO();
        markingRoundDTO.setId(markingRound.getId());
        markingRoundDTO.setRound(markingRound.getRound());
        markingRoundDTO.setCreateAt(markingRound.getCreateAt());
        markingRoundDTO.setModifyAt(markingRound.getModifyAt());
        markingRoundDTO.setModifyBy(markingRound.getModifyBy());
        markingRoundDTO.setCreateBy(markingRound.getCreateBy());
        markingRoundDTO.setDescription(markingRound.getDescription());
        return markingRoundDTO;
    }

    public MarkingRound toMarkingRound(MarkingRoundDTO markingRoundDTO) {
        MarkingRound markingRound = new MarkingRound();
        markingRound.setRound(markingRoundDTO.getRound());
        markingRound.setCreateAt(markingRoundDTO.getCreateAt());
        markingRound.setModifyAt(markingRoundDTO.getModifyAt());
        markingRound.setModifyBy(markingRoundDTO.getModifyBy());
        markingRound.setCreateBy(markingRoundDTO.getCreateBy());
        markingRound.setDescription(markingRoundDTO.getDescription());
        return markingRound;
    }
}
