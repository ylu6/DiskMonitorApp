package org.ylu.diskmonitorwebapp.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

public class DiskAvailableDTO {
    private Long id;
    private Float capacity;
    private Float available;

    public DiskAvailableDTO() {
    }

    public DiskAvailableDTO(Long id, Float capacity, Float available) {
        this.id = id;
        this.capacity = capacity;
        this.available = available;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getCapacity() {
        return capacity;
    }

    public void setCapacity(Float capacity) {
        this.capacity = capacity;
    }

    public Float getAvailable() {
        return available;
    }

    public void setAvailable(Float available) {
        this.available = available;
    }
}
