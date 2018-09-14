package org.ylu.diskmonitorwebapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ylu.diskmonitorwebapp.api.model.UserIdUsedDTO;
import org.ylu.diskmonitorwebapp.services.DiskUsageService;

import java.util.List;

@RestController
@RequestMapping(DiskUsageController.BASE_URL)
public class DiskUsageController {
    public static final String BASE_URL = "/api/diskusage";

    DiskUsageService diskUsageService;

    public DiskUsageController(DiskUsageService diskUsageService) {
        this.diskUsageService = diskUsageService;
    }

    @GetMapping("/{id}")
    public List<UserIdUsedDTO> getUserIdAndUsed(@PathVariable Long id){
        return diskUsageService.getUserUsageById(id);
    }

    @GetMapping
    public List<UserIdUsedDTO> getRecentUserReport() {
        return diskUsageService.getTopKUserUsage(25);
    }
}
