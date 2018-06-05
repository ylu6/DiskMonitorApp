package org.ylu.diskmonitorwebapp.services;

import org.ylu.diskmonitorwebapp.api.model.DiskAvailableDTO;
import org.ylu.diskmonitorwebapp.api.model.DiskDTO;
import org.ylu.diskmonitorwebapp.api.model.DiskListDTO;
import org.ylu.diskmonitorwebapp.domain.Disk;
import org.ylu.diskmonitorwebapp.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface DiskService{

    List<DiskDTO> getAllDisks();

    DiskDTO updateDiskAvailable(DiskAvailableDTO diskAvailableDTO);

    DiskDTO getDiskById(Long id);

    Map<Long, Double> listAllUserUsages();


    Disk saveDisk(Disk disk);
}
