package com.api.BaseAPI.Domains;

import javax.persistence.*;
import java.util.List;

//Plano de siembra
@Entity
@Table(name = "PlantingMap")
public class PlantingMapEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PLANTINGMAP_ID")
    private Long id;

    @Column(name = "BATCH", length = 120, nullable = false)
    private String batch;//lote

    @Column(name = "GROOVE")
    private Integer groove;//surco

    @Column(name = "PLANTS")
    private Integer plants;//plantas

    @Column(name = "YEAR")
    private Integer year;//año

    @Column(name = "WEEK")
    private Integer week;//mes

    @Column(name = "DAY")
    private Integer day;//día

    @Column(name = "LAND_CODE", length = 8, nullable = false)
    private String landCode;// código de finca

    @Column(name = "CODE", length = 120, nullable = false)
    private String code;//código

    @ManyToOne
    @JoinColumn(name="LAND_ID")
    private LandEntity land; //Finca

    @ManyToMany(mappedBy = "plantingMaps")
    private List<SpreadsheetEntity> spreadsheets;

    @OneToMany(mappedBy="plantingMap", cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE})
    private ProductEntity product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Integer getGroove() {
        return groove;
    }

    public void setGroove(Integer groove) {
        this.groove = groove;
    }

    public Integer getPlants() {
        return plants;
    }

    public void setPlants(Integer plants) {
        this.plants = plants;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getLandCode() {
        return landCode;
    }

    public void setLandCode(String landCode) {
        this.landCode = landCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LandEntity getLand() {
        return land;
    }

    public void setLand(LandEntity land) {
        this.land = land;
    }

    public List<SpreadsheetEntity> getSpreadsheets() {
        return spreadsheets;
    }

    public void setSpreadsheets(List<SpreadsheetEntity> spreadsheets) {
        this.spreadsheets = spreadsheets;
    }


}
