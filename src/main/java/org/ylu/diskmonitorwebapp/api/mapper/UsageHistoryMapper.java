package org.ylu.diskmonitorwebapp.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.ylu.diskmonitorwebapp.api.model.UsageHistoryDTO;
import org.ylu.diskmonitorwebapp.domain.UsageHistory;

@Mapper
public interface UsageHistoryMapper {
    UsageHistoryMapper INSTANCE = Mappers.getMapper(UsageHistoryMapper.class);

    UsageHistory usageHistoryDTOToUsageHistory(UsageHistoryDTO usageHistoryDTO);
}
