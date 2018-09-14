package org.ylu.diskmonitorwebapp.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.ylu.diskmonitorwebapp.api.model.UserIdUsedDTO;
import org.ylu.diskmonitorwebapp.domain.UsageHistory;

import java.util.List;

public interface UsageHistoryRepository extends CrudRepository<UsageHistory, Long> {

//    @Query(value = "select uh.userId from UsageHistory uh where " +
//            "uh.dateTime = (select max(uh2.dateTime) from usageHistory uh2)" +
//            "and uh.diskId = :diskId")
//
    //@Query(value = "select new org.ylu.diskmonitorwebapp.api.model.UserIdUsedDTO(uh.userId, uh.used) from UsageHistory uh where uh.diskId= :diskId")
    @Query(value = "select new org.ylu.diskmonitorwebapp.api.model.UserIdUsedDTO(uh.userId, uh.used) from UsageHistory uh " +
            "where uh.dateTime = (select max(uh2.dateTime) from UsageHistory uh2)" +
            "and uh.diskId= :diskId ORDER BY uh.used desc")
    List<UserIdUsedDTO> getRecentReportByDiskID(@Param("diskId") Long diskId);

    @Query(value = "select new org.ylu.diskmonitorwebapp.api.model.UserIdUsedDTO(uh.userId, uh.used) from UsageHistory uh " +
            "where uh.dateTime = (select max(uh2.dateTime) from UsageHistory uh2)")
    List<UserIdUsedDTO> getAllRecentReport();
}
