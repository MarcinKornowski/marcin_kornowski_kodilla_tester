package com.kodilla.collections.sets;

import java.util.Objects;

public class Stamp {

    private String stampName;
    private String stampSize;
    private boolean hasPostMark;

    public Stamp(String stampName, String stampSize, boolean hasPostMark) {
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.hasPostMark = hasPostMark;
    }

    public String getStampName() {
        return stampName;
    }

    public String getStampSize() {
        return stampSize;
    }

    public boolean checkPostMArk() {
        return hasPostMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return hasPostMark == stamp.hasPostMark &&
                Objects.equals(stampName, stamp.stampName) &&
                Objects.equals(stampSize, stamp.stampSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampSize, hasPostMark);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampSize='" + stampSize + '\'' +
                ", hasPostMark=" + hasPostMark +
                '}';
    }
}