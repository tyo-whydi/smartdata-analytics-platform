package com.tyowhydi.smartdata.service;

import com.tyowhydi.smartdata.dto.DatasetSummaryDto;
import com.tyowhydi.smartdata.entity.Dataset;
import com.tyowhydi.smartdata.repository.DatasetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatasetService {

    private final DatasetRepository datasetRepository;

    public DatasetService(DatasetRepository datasetRepository) {
        this.datasetRepository = datasetRepository;
    }

    public Dataset createDataset(String name, String fileName, String source, String description, String schema) {
        Dataset dataset = new Dataset(name, fileName, source, description, schema);
        return datasetRepository.save(dataset);
    }

    public List<Dataset> getAllDatasets() {
        return datasetRepository.findAll();
    }

    public DatasetSummaryDto getSummary() {
        long total = datasetRepository.count();
        return new DatasetSummaryDto(
            total,
            "UP",
            "Dataset processing engine is ready for analytics workflows"
        );
    }
}
