package org.ylu.diskmonitorwebapp.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.ylu.diskmonitorwebapp.api.model.DiskDTO;
import org.ylu.diskmonitorwebapp.domain.Disk;

@Mapper
public interface DiskMapper {
    DiskMapper INSTANCE = Mappers.getMapper(DiskMapper.class);

    DiskDTO diskToDiskDTO(Disk disk);
}
