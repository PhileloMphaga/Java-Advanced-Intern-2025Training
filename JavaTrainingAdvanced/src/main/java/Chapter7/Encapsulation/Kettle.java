package Chapter7.Encapsulation;

public class Kettle {

    private boolean waterBoiling = false;
    private boolean heatSensorOn = false;

    public void switchOn(){
        if(isThereWater()){
            System.err.println("Switching on...");
            accessElectricity();
            heatUpSensor();
            if(isWaterBoiling()){
                waterBoiling = true;
                switchOff();
            }
        }else{
            switchOff();
            putWater();
        }
    }

    private void heatUpSensor(){
        System.err.println("Sensor is heating up...");
        heatSensorOn = true;
    }

    private boolean isWaterBoiling(){
        System.err.println("Water boiling...");
        return false;
    }

    public void switchOff(){
        System.err.println("Switching off...");
    }

    public void putWater(){
    }

    private void accessElectricity(){
        System.err.println("Using Electricity...");
    }

    private boolean isThereWater(){
        return true;
    }
}
