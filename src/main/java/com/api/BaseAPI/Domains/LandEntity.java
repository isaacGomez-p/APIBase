package com.api.BaseAPI.Domains;

import org.apache.catalina.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Land")
public class LandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LAND_ID")
    private Long landId;

    @Column(name = "NAME", length = 120, nullable = false)
    private String name;

    @Column(name = "STATUS")
    private Integer status;

    @ManyToOne
    @JoinColumn(name="id")
    private UserEntity user;

    @Column(name = "CODE", length = 8, nullable = false)
    private String code;

    @OneToMany(mappedBy="land", cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE})
    private List<PlantingMapEntity> plantingMaps;

    public Long getLandId() {
        return landId;
    }

    public void setLandId(Long landId) {
        this.landId = landId;
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

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<PlantingMapEntity> getPlantingMaps() {
        return plantingMaps;
    }

    public void setPlantingMaps(List<PlantingMapEntity> plantingMaps) {
        this.plantingMaps = plantingMaps;
    }


}
