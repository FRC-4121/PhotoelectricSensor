package frc.extraClasses;

import edu.wpi.first.wpilibj.DigitalInput;

public class PhotoElecSensor {

    DigitalInput sensor = new DigitalInput(3);

    public boolean isNotBlocked(){
        return sensor.get();
    }
}
