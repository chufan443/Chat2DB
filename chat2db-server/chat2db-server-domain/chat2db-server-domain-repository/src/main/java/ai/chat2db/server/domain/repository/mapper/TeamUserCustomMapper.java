package ai.chat2db.server.domain.repository.mapper;

import ai.chat2db.server.domain.repository.entity.DataSourceDO;
import ai.chat2db.server.domain.repository.entity.TeamUserDO;
import com.baomidou.mybatisplus.core.mapper.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;

/**
 * Team User Custom Mapper
 *
 * @author Jiaju Zhuang
 */
public interface TeamUserCustomMapper extends Mapper<TeamUserDO> {

    IPage<TeamUserDO> comprehensivePageQuery(IPage<DataSourceDO> page, @Param("teamId") Long teamId,
        @Param("userId") Long userId, @Param("teamRoleCode") String teamRoleCode);
}