/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author zhaojiyuan
 */
public class VitalSign {
    private float respiratoryRate;
    private float heartRate;
    private float systolicBloodPressure;
    private float weight;
    private String timeAndDate;
    private Boolean isVitalSignNormal;
    
    public float getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(float respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(float heartRate) {
        this.heartRate = heartRate;
    }

    public float getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(float systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getTimeAndDate() {
        return timeAndDate;
    }

    public void setTimeAndDate(String timeAndDate) {
        this.timeAndDate = timeAndDate;
    }
    
    public Boolean getIsVitalSignNormal() {
        return isVitalSignNormal;
    }

    public void setIsVitalSignNormal(Boolean isVitalSignNormal) {
        this.isVitalSignNormal = isVitalSignNormal;
    }
    
    
    
    @Override
    public String toString() {
        return getTimeAndDate();
    }



}
