package org.ylu.diskmonitorwebapp.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
public class UsageHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;

    private Long diskId;

    private Long userId;

    private Float used;

    public UsageHistory() {
    }

    public UsageHistory(Date dateTime, Long diskId, Long userId, Float used) {

        this.dateTime = dateTime;
        this.diskId = diskId;
        this.userId = userId;
        this.used = used;
    }
}
