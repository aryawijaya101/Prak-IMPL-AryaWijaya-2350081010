package LatihanCleanCode.UsePronounceableNames;

import java.time.LocalDateTime;

public class Customer {

    private static final String DEFAULT_RECORD_ID = "102";

    private LocalDateTime generationTimestamp;
    private LocalDateTime modificationTimestamp;
    private final String recordId;

    public Customer(LocalDateTime generationTimestamp, LocalDateTime modificationTimestamp) {
        this.generationTimestamp = generationTimestamp;
        this.modificationTimestamp = modificationTimestamp;
        this.recordId = DEFAULT_RECORD_ID; // Record ID is set by default as constant
    }

    public LocalDateTime getGenerationTimestamp() {
        return generationTimestamp;
    }

    public void setGenerationTimestamp(LocalDateTime generationTimestamp) {
        this.generationTimestamp = generationTimestamp;
    }

    public LocalDateTime getModificationTimestamp() {
        return modificationTimestamp;
    }

    public void setModificationTimestamp(LocalDateTime modificationTimestamp) {
        this.modificationTimestamp = modificationTimestamp;
    }

    public String getRecordId() {
        return recordId;
    }

}
