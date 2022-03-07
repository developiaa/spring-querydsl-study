package study.developia.querydsl.repository;

import study.developia.querydsl.dto.MemberSearchCondition;
import study.developia.querydsl.dto.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {
    List<MemberTeamDto> search(MemberSearchCondition condition);
}
