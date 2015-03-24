package org.usfirst.frc.team4669.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

public class DriveTrainU extends DriveTrain {

	protected boolean isJoystick = false;
    RobotDrive drivetrain;
	
	public DriveTrainU() {
		super();
    	drivetrain = new RobotDrive(drive1, drive);
	}

	public void enableJoystick() {
		if (!isJoystick){
	    	drive1.setPID(1.0, 0.0, 0.0);
	    	drive.setPID(1.0, 0.0, 0.0);
	    	drive1.changeControlMode(CANTalon.ControlMode.PercentVbus);
	    	drive.changeControlMode(CANTalon.ControlMode.PercentVbus);
	    	drive1.enableBrakeMode(true);
	    	drive.enableBrakeMode(true);
			isJoystick = true;
		}
		
	}
	
	public void setPositionMode(){
		if (isJoystick){
			super.setPositionMode();
	    	isJoystick=false;
		}
	}
	
	public void joystickDrive(Joystick leftStick, Joystick rightStick) {
		drivetrain.tankDrive(leftStick.getY()*.5, rightStick.getY()*.5);
	}
	

	@Override
	public boolean isFinished() {
		if (isJoystick){
			return false;
		} else {
			return super.isFinished();
		}
	}

	@Override
	public void stop() {
		if (isJoystick) {
			drivetrain.tankDrive(0, 0, false);
		} else {
			super.stop();
		}
	}
	
	
}
