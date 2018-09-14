package org.ylu.diskmonitorwebapp.services;

import org.ylu.diskmonitorwebapp.api.model.UserIdUsedDTO;

import java.util.List;

public interface DiskUsageService {
    List<UserIdUsedDTO> getUserUsageById(Long id);

    List<UserIdUsedDTO> getTopKUserUsage(int k);
}
