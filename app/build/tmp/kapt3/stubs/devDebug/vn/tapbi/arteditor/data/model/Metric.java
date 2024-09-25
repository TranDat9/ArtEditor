package vn.tapbi.arteditor.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0018"}, d2 = {"Lvn/tapbi/arteditor/data/model/Metric;", "", "()V", "value", "", "unit", "", "unitType", "", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;)V", "getUnit", "()Ljava/lang/String;", "setUnit", "(Ljava/lang/String;)V", "getUnitType", "()Ljava/lang/Integer;", "setUnitType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getValue", "()Ljava/lang/Double;", "setValue", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "app_devDebug"})
public final class Metric {
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "Value")
    private java.lang.Double value;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "Unit")
    private java.lang.String unit;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "UnitType")
    private java.lang.Integer unitType;
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getValue() {
        return null;
    }
    
    public final void setValue(@org.jetbrains.annotations.Nullable
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUnit() {
        return null;
    }
    
    public final void setUnit(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getUnitType() {
        return null;
    }
    
    public final void setUnitType(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    /**
     * No args constructor for use in serialization
     */
    public Metric() {
        super();
    }
    
    /**
     * @param unitType
     * @param unit
     * @param value
     */
    public Metric(@org.jetbrains.annotations.Nullable
    java.lang.Double value, @org.jetbrains.annotations.Nullable
    java.lang.String unit, @org.jetbrains.annotations.Nullable
    java.lang.Integer unitType) {
        super();
    }
}