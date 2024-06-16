package com.project.judging_app_server.DTOs.Mapper;

import com.project.judging_app_server.DTOs.JudgeDTO;
import com.project.judging_app_server.Entities.Judge;
import org.springframework.stereotype.Component;

@Component
public class JudgeMapper {

    public JudgeDTO toJudgeDTO(Judge judge) {
        JudgeDTO judgeDTO = new JudgeDTO();
        judgeDTO.setId(judge.getId());
        judgeDTO.setFirstName(judge.getFirstName());
        judgeDTO.setLastName(judge.getLastName());
        judgeDTO.setEmail(judge.getEmail());
        judgeDTO.setPhone(judge.getPhone());
        judgeDTO.setCreateAt(judge.getCreateAt());
        judgeDTO.setModifyAt(judge.getModifyAt());
        judgeDTO.setNumberOfProject(judge.getNumberOfProject());
        return judgeDTO;
    }

    public static Judge toJudge(JudgeDTO judgeDTO) {
        Judge judge = new Judge();
        judge.setFirstName(judgeDTO.getFirstName());
        judge.setLastName(judgeDTO.getLastName());
        judge.setEmail(judgeDTO.getEmail());
        judge.setPhone(judgeDTO.getPhone());
        judge.setCreateAt(judgeDTO.getCreateAt());
        judge.setModifyAt(judgeDTO.getModifyAt());
        return judge;
    }
}
