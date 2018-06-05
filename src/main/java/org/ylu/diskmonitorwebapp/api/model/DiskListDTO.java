package org.ylu.diskmonitorwebapp.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class DiskListDTO {
    List<DiskDTO> disks;

    public DiskListDTO(List<DiskDTO> disks) {
        this.disks = disks;
    }
}
