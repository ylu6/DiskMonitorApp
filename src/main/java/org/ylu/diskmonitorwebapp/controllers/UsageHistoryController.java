package org.ylu.diskmonitorwebapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.ylu.diskmonitorwebapp.api.model.UsageHistoryDTO;
import org.ylu.diskmonitorwebapp.domain.UsageHistory;
import org.ylu.diskmonitorwebapp.services.UsageHistoryService;

import java.util.List;

@RestController
@RequestMapping(UsageHistoryController.BASE_URL)
public class UsageHistoryController {
    public static final String BASE_URL = "/api/usagehistory";

    UsageHistoryService usageHistoryService;

    public UsageHistoryController(UsageHistoryService usageHistoryService) {
        this.usageHistoryService = usageHistoryService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public String insertUsageHistories(@RequestBody List<UsageHistoryDTO> usageHistoryDTOs) {
        usageHistoryService.insertAllUsageHistory(usageHistoryDTOs);
        return "Disk Usage History Successfully Inserted.";
    }

}
