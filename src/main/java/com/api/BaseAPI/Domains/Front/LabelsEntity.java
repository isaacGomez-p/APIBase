package com.api.BaseAPI.Domains.Front;

import javax.persistence.*;

@Entity
@Table(name = "labels")
public class LabelsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LABEL_ID")
    private Long labelId;

    @Column(name = "NAME", length = 120, nullable = false)
    private String name;

    @Column(name = "STATUS")
    private Integer status;

    public Long getLabelId() {
        return labelId;
    }

    public void setLabelId(Long labelId) {
        this.labelId = labelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
