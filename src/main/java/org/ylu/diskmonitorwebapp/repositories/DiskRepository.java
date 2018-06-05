package org.ylu.diskmonitorwebapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.ylu.diskmonitorwebapp.domain.Disk;

public interface DiskRepository extends JpaRepository<Disk, Long> {
    Disk getDiskById(Long id);
}
