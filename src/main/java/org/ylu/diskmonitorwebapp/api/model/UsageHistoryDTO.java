package org.ylu.diskmonitorwebapp.api.model;

import lombok.Data;
import org.ylu.diskmonitorwebapp.domain.Disk;
import org.ylu.diskmonitorwebapp.domain.User;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
public class UsageHistoryDTO {
    private Long id;

    private Date dateTime;

    private Long diskId;

    private String userId;

    private Float used;
}
