package org.ylu.diskmonitorwebapp.services;

import org.springframework.stereotype.Service;
import org.ylu.diskmonitorwebapp.api.mapper.DiskMapper;
import org.ylu.diskmonitorwebapp.api.model.DiskAvailableDTO;
import org.ylu.diskmonitorwebapp.api.model.DiskDTO;
import org.ylu.diskmonitorwebapp.domain.Disk;
import org.ylu.diskmonitorwebapp.repositories.DiskRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DiskServiceImpl implements DiskService {
    private DiskRepository diskRepository;
    private DiskMapper diskMapper;

    @PersistenceContext
    EntityManager entityManager;

    public DiskServiceImpl(DiskRepository diskRepository, DiskMapper diskMapper) {
        this.diskRepository = diskRepository;
        this.diskMapper = diskMapper;
    }

    @Override
    public List<DiskDTO> getAllDisks() {
        return diskRepository.findAll().stream()
                .map(disk->diskMapper.diskToDiskDTO(disk))
                .collect(Collectors.toList());
    }

    @Override
    public Map<Long, Double> listAllUserUsages() {
//        Query q = entityManager.createNativeQuery("select");
        return null;
    }

    @Override
    public DiskDTO getDiskById(Long id) {
        return diskRepository
                .findById(id)
                .map(diskMapper::diskToDiskDTO)
                .orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public DiskDTO updateDiskAvailable(DiskAvailableDTO diskAvailableDTO) {
        Disk disk = diskRepository.getOne(diskAvailableDTO.getId());
        disk.setCapacity(diskAvailableDTO.getCapacity());
        disk.setAvailable(diskAvailableDTO.getAvailable());
        diskRepository.save(disk);
        return diskMapper.diskToDiskDTO(disk);
    }

    @Override
    public Disk saveDisk(Disk disk) {
        return diskRepository.save(disk);
    }
}
