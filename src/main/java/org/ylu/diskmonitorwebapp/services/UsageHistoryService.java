package org.ylu.diskmonitorwebapp.services;

import org.ylu.diskmonitorwebapp.api.model.UsageHistoryDTO;

import java.util.List;

public interface UsageHistoryService {
    public void insertAllUsageHistory(List<UsageHistoryDTO> usageHistoryDTOs);
}
