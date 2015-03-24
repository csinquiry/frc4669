package org.usfirst.frc.team4669.robot.subsystems;

import org.usfirst.frc.team4669.robot.subsystems.sensor.InfraredTOF;

import edu.wpi.first.wpilibj.I2C.Port;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class I2CSensors extends Subsystem {
    public InfraredTOF tofRight;
    public InfraredTOF tofLeft;
    protected boolean leftEnb = false;
    
    public I2CSensors() {
		super();
		tofRight = new InfraredTOF(Port.kOnboard);
		if (leftEnb) {
			tofLeft = new InfraredTOF(Port.kMXP);
		}
		setup();
	}
    
    public boolean setup() {
    	try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	boolean r = tofRight.setup();
    	if (leftEnb) {
    		if (r) {
    			r =  tofLeft.setup();
    		}
    	}
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	return r;
    }
    
    protected int[] r2 = new int[2];
    protected long startTime = 0;
    
    public void startMeasure() {
    	tofRight.startMeasure();
    	if (leftEnb) {
    		tofLeft.startMeasure();
    	}
    	startTime = System.currentTimeMillis();
    }

    public boolean isMeasuring() {
    	return System.currentTimeMillis() < startTime + 10;
    }
    
    public int[] getDistance() {
    	r2[0] = tofRight.readMeasure();
    	if (leftEnb) {
    		r2[1] = tofLeft.readMeasure();
    	} else {
    		r2[1] = -1;
    	}
    	return r2;
    }

	public void initDefaultCommand() {
    }
}

