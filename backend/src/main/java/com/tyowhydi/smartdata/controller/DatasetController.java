package com.tyowhydi.smartdata.controller;

import com.tyowhydi.smartdata.dto.DatasetSummaryDto;
import com.tyowhydi.smartdata.entity.Dataset;
import com.tyowhydi.smartdata.service.DatasetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/datasets")
public class DatasetController {

    private final DatasetService datasetService;

    public DatasetController(DatasetService datasetService) {
        this.datasetService = datasetService;
    }

    @GetMapping
    public List<Dataset> getAllDatasets() {
        return datasetService.getAllDatasets();
    }

    @GetMapping("/summary")
    public DatasetSummaryDto getSummary() {
        return datasetService.getSummary();
    }

    @PostMapping("/upload")
    public ResponseEntity<Map<String, Object>> uploadDataset(
            @RequestParam String name,
            @RequestParam String fileName,
            @RequestParam String source,
            @RequestParam(defaultValue = "") String description,
            @RequestParam(defaultValue = "id, value") String schema
    ) {
        Dataset dataset = datasetService.createDataset(name, fileName, source, description, schema);

        Map<String, Object> response = new HashMap<>();
        response.put("message", "Dataset uploaded successfully");
        response.put("dataset", dataset);

        return ResponseEntity.ok(response);
    }
}
