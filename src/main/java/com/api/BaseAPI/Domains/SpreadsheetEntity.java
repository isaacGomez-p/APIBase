package com.api.BaseAPI.Domains;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

//PLanilla de aplicación
@Entity
@Table(name = "Spreadsheet")
public class SpreadsheetEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SPREADSHEET_ID")
    private Long spreadsheetId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "FILING_DATE", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private LocalDateTime filingDate; //Fecha de formulación

    @Column(name = "NAME", length = 120, nullable = false)
    private String name;

    @Column(name = "ACTIVITY", length = 120, nullable = false)
    private String activity;

    @Column(name = "CONTROL", length = 120, nullable = false)
    private String control;

    @Column(name = "PREVENTION", length = 120, nullable = false)
    private String prevention;

    @Column(name = "FERTILIZATION", length = 120, nullable = false)
    private String fertilization;

    @Column(name = "DOSE")
    private Double dose; //dosis

    @Column(name = "TOTAL_MIX")
    private Double totalMix; //mezcla total

    @Column(name = "TOTAL_DOSE")
    private Double totalDose; //dosis total

    @Column(name = "MADE_BY", length = 120, nullable = false)
    private String madeBy; //Elaborado por

    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    //@Column(name = "APPLICATION_DATE", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    //private LocalDateTime applicationDate; //Fecha de aplicación

    @Column(name = "STATUS", length = 120, nullable = false)
    private String status; //Estado

    @Column(name = "QUALITY", length = 120, nullable = false)
    private String quality; //Calidad de ejecución

    @Column(name = "CODE", length = 120, nullable = false)
    private String code; //Código

    @Column(name = "CODE_LAND", length = 120, nullable = false)
    private String codeLand; //Código de finca

    @Column(name = "CODE_NSPREADSHEET", length = 120, nullable = false)
    private String codeNSpreadsheet; //Código de número de planilla

    //@ManyToMany(fetch = FetchType.EAGER)
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "PLANTING_MAPS", joinColumns = @JoinColumn(name = "FK_SPREADSHEET_ID"), inverseJoinColumns = @JoinColumn(name = "FK_PLANTINGMAP_ID"))
    private List<PlantingMapEntity> plantingMaps;

    //@ManyToOne
    //@JoinColumn(name="NSPREADSHEET_ID")
    //private NSpreadsheetEntity nSpreadsheet;

    public Long getSpreadsheetId() {
        return spreadsheetId;
    }

    public void setSpreadsheetId(Long spreadsheetId) {
        this.spreadsheetId = spreadsheetId;
    }

    /*public LocalDateTime getFilingDate() {
        return filingDate;
    }

    public void setFilingDate(LocalDateTime filingDate) {
        this.filingDate = filingDate;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public String getPrevention() {
        return prevention;
    }

    public void setPrevention(String prevention) {
        this.prevention = prevention;
    }

    public String getFertilization() {
        return fertilization;
    }

    public void setFertilization(String fertilization) {
        this.fertilization = fertilization;
    }

    public Double getDose() {
        return dose;
    }

    public void setDose(Double dose) {
        this.dose = dose;
    }

    public Double getTotalMix() {
        return totalMix;
    }

    public void setTotalMix(Double totalMix) {
        this.totalMix = totalMix;
    }

    public Double getTotalDose() {
        return totalDose;
    }

    public void setTotalDose(Double totalDose) {
        this.totalDose = totalDose;
    }

    public String getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    /*public LocalDateTime getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDateTime applicationDate) {
        this.applicationDate = applicationDate;
    }*/

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeLand() {
        return codeLand;
    }

    public void setCodeLand(String codeLand) {
        this.codeLand = codeLand;
    }

    public String getCodeNSpreadsheet() {
        return codeNSpreadsheet;
    }

    public void setCodeNSpreadsheet(String codeNSpreadsheet) {
        this.codeNSpreadsheet = codeNSpreadsheet;
    }

    public List<PlantingMapEntity> getPlantingMaps() {
        return plantingMaps;
    }

    public void setPlantingMaps(List<PlantingMapEntity> plantingMaps) {
        this.plantingMaps = plantingMaps;
    }
/*
    public NSpreadsheetEntity getnSpreadsheet() {
        return nSpreadsheet;
    }

    public void setnSpreadsheet(NSpreadsheetEntity nSpreadsheet) {
        this.nSpreadsheet = nSpreadsheet;
    }*/
}
