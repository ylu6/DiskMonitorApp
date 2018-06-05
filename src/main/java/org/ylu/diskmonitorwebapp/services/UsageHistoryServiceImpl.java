package org.ylu.diskmonitorwebapp.services;

import org.springframework.stereotype.Service;
import org.ylu.diskmonitorwebapp.api.mapper.UsageHistoryMapper;
import org.ylu.diskmonitorwebapp.api.model.UsageHistoryDTO;
import org.ylu.diskmonitorwebapp.domain.UsageHistory;
import org.ylu.diskmonitorwebapp.repositories.UsageHistoryRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsageHistoryServiceImpl implements UsageHistoryService{
    UsageHistoryRepository usageHistoryRepository;
    UsageHistoryMapper usageHistoryMapper;

    public UsageHistoryServiceImpl(UsageHistoryRepository usageHistoryRepository, UsageHistoryMapper usageHistoryMapper) {
        this.usageHistoryRepository = usageHistoryRepository;
        this.usageHistoryMapper = usageHistoryMapper;
    }

    @Override
    public void insertAllUsageHistory(List<UsageHistoryDTO> usageHistoryDTOs) {
        List<UsageHistory> usageHistories = usageHistoryDTOs.stream()
                .map(usageHistoryDTO -> usageHistoryMapper.usageHistoryDTOToUsageHistory(usageHistoryDTO))
                .collect(Collectors.toList());
        usageHistoryRepository.saveAll(usageHistories);
    }
}
