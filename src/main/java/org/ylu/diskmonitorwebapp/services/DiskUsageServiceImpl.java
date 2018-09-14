package org.ylu.diskmonitorwebapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ylu.diskmonitorwebapp.api.model.UserIdUsedDTO;
import org.ylu.diskmonitorwebapp.repositories.UsageHistoryRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiskUsageServiceImpl implements DiskUsageService{

    UsageHistoryRepository usageHistoryRepository;

    @Autowired
    public DiskUsageServiceImpl(UsageHistoryRepository usageHistoryRepository) {
        this.usageHistoryRepository = usageHistoryRepository;
    }

    @Override
    public List<UserIdUsedDTO> getUserUsageById(Long id) {
        return usageHistoryRepository.getRecentReportByDiskID(id);
    }

    @Override
    public List<UserIdUsedDTO> getTopKUserUsage(int k) {
        List<UserIdUsedDTO> dtos = usageHistoryRepository.getAllRecentReport();
        Collection<UserIdUsedDTO> results = dtos.stream().collect(Collectors.toMap(
                UserIdUsedDTO::getUserId,
                UserIdUsedDTO::new,
                UserIdUsedDTO::merge
        )).values();
        List<UserIdUsedDTO> list = new ArrayList<UserIdUsedDTO>(results);
        list.sort((a,b) -> (int) (b.getUsed() - a.getUsed()));
        return list.subList(0, k);
    }
}
