package com.zadaniegrupowe2.demo.request;

import com.zadaniegrupowe2.demo.entity.PartType;

import java.util.Objects;

public class PartFilterRequest {
    private String partType;

    public String getPartType() {
        return partType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartFilterRequest that = (PartFilterRequest) o;
        return Objects.equals(partType, that.partType);
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(partType);
    }

    @Override
    public String toString() {
        return "PartFilterRequest{" +
                "partType='" + partType + '\'' +
                '}';
    }
}
