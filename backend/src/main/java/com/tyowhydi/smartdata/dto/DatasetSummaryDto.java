package com.tyowhydi.smartdata.dto;

public class DatasetSummaryDto {
    private long totalDatasets;
    private String status;
    private String message;

    public DatasetSummaryDto(long totalDatasets, String status, String message) {
        this.totalDatasets = totalDatasets;
        this.status = status;
        this.message = message;
    }

    public long getTotalDatasets() {
        return totalDatasets;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
