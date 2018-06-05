package org.ylu.diskmonitorwebapp.controllers;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UsageHistoryController.BASE_URL)
public class UsageHistoryController {
    public static final String BASE_URL = "/api/usagehistory";

}
