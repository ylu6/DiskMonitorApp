package org.ylu.diskmonitorwebapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.ylu.diskmonitorwebapp.api.mapper.UsageHistoryMapper;
import org.ylu.diskmonitorwebapp.api.model.UsageHistoryDTO;
import org.ylu.diskmonitorwebapp.domain.Disk;
import org.ylu.diskmonitorwebapp.domain.UsageHistory;
import org.ylu.diskmonitorwebapp.domain.User;

import java.time.LocalDateTime;
import java.util.Date;

//
//public class UsageHistoryServiceMapperTest {
//
//    UsageHistoryMapper usageHistoryMapper = UsageHistoryMapper.INSTANCE;
//
//    @Test
//    public void mapUsageHistoryToUsageHistoryDTO() {
//        Disk disk = new Disk("/slowfs/tcad1", "tierI", (float) 1000.0, (float)20.0);
//        User user = new User();
//
//        UsageHistory usageHistory = new UsageHistory(new Date(), (long) 1, (long) 1, (float) 100.0);
//        UsageHistoryDTO dto = usageHistoryMapper.usageHistoryToUsageHistoryDTO(usageHistory);
//        System.out.println(dto.getDiskId());
//    }
//}
