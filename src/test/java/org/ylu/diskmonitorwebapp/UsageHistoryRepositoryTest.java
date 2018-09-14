package org.ylu.diskmonitorwebapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.config.RepositoryConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.ylu.diskmonitorwebapp.api.model.UserIdUsedDTO;
import org.ylu.diskmonitorwebapp.repositories.UsageHistoryRepository;

import java.util.List;
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = {RepositoryConfiguration.class})
////@RunWith(SpringRunner.class)
////@SpringBootTest
//public class UsageHistoryRepositoryTest {
//
//    private UsageHistoryRepository usageHistoryRepository;
//
//    @Autowired
//    public void setUsageHistoryRepository(UsageHistoryRepository usageHistoryRepository) {
//        this.usageHistoryRepository = usageHistoryRepository;
//    }
//
//    @Test
//    public void testGetRecentReportByDiskId() {
//        List<UserIdUsedDTO> report = usageHistoryRepository.getRecentReportByDiskID(1L);
//        for(Object object : report) {
//            System.out.println(object);
//        }
//    }
//}

