package org.ylu.diskmonitorwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.ylu.diskmonitorwebapp.domain.UsageHistory;

public interface UsageHistoryRepository extends CrudRepository<UsageHistory, Long> {
}