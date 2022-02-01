package com.api.BaseAPI.Domains;

import javax.persistence.*;

@Entity
@Table(name = "Product",
uniqueConstraints = @UniqueConstraint(columnNames = { "NAME", "VARIETY", "USER_ID" }))

public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID")
    private Long product_id;

    @Column(name = "NAME", length = 120, nullable = false)
    private String name;

    @Column(name = "VARIETY", length = 120, nullable = false)
    private String variety;

    @Column(name = "CODE", length = 8, nullable = false)
    private String code;

    @OneToOne(mappedBy = "product")
    private PlantingMapEntity plantingMap;

    @ManyToOne
    @JoinColumn(name="USER_ID")
    private UserEntity user;

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public PlantingMapEntity getPlantingMap() {
        return plantingMap;
    }

    public void setPlantingMap(PlantingMapEntity plantingMap) {
        this.plantingMap = plantingMap;
    }
}
