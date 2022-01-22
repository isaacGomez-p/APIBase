package com.api.BaseAPI.Domains;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

//Número de planilla
@Entity
@Table(name = "NSpreadsheet")
public class NSpreadsheetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NSPREADSHEET_ID")
    private Long nSpreadsheetId;

    @Column(name = "NAME", length = 120, nullable = false)
    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "CREATION_DATE", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private LocalDateTime creationDate;

    @Column(name = "CODE", length = 8, nullable = false)
    private String code;

    @OneToMany(mappedBy="nSpreadsheet", cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE})
    private List<SpreadsheetEntity> spreadsheets;

    public Long getnSpreadsheetId() {
        return nSpreadsheetId;
    }

    public void setnSpreadsheetId(Long nSpreadsheetId) {
        this.nSpreadsheetId = nSpreadsheetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<SpreadsheetEntity> getSpreadsheets() {
        return spreadsheets;
    }

    public void setSpreadsheets(List<SpreadsheetEntity> spreadsheets) {
        this.spreadsheets = spreadsheets;
    }
}