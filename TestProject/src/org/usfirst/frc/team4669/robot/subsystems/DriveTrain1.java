package org.usfirst.frc.team4669.robot.subsystems;

import org.usfirst.frc.team4669.robot.commands.DriveWithJoysticks;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain1 extends Subsystem {
    CANTalon leftMotor, rightMotor;
    RobotDrive drivetrain;
    
    public DriveTrain1() {
    	leftMotor = new CANTalon(4);
    	rightMotor = new CANTalon(1);
    	leftMotor.enableControl();
    	rightMotor.enableControl();
    	leftMotor.setPID(1.0, 0.0, 0.0);
    	rightMotor.setPID(1.0, 0.0, 0.0);
    	leftMotor.changeControlMode(CANTalon.ControlMode.PercentVbus);
    	rightMotor.changeControlMode(CANTalon.ControlMode.PercentVbus);
    	leftMotor.enableBrakeMode(true);
    	rightMotor.enableBrakeMode(true);
    	drivetrain = new RobotDrive(leftMotor, rightMotor);
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void joystickDrive(double left, double right) {
			drivetrain.tankDrive(left*0.5, right*0.5, false);
	}
	
	public void joystickDrive(Joystick leftStick, Joystick rightStick) {
		joystickDrive(leftStick.getY(), rightStick.getY());
	}
	
	public void stop() {
		joystickDrive(0,0);
	}
	
	public void setControlType(CANTalon.ControlMode control) {
		leftMotor.changeControlMode(control);
		leftMotor.set(0);
		rightMotor.changeControlMode(control);
		rightMotor.set(0);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new  DriveWithJoysticks());
    }
}

