package org.usfirst.frc.team4669.robot.commands;

import org.usfirst.frc.team4669.robot.Robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class Pivot extends Move {

	protected double _angle;
	protected boolean _isRight;
    public Pivot(double angle, boolean isRight) {
    	super();
    	_angle = angle;
    	_isRight =isRight;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	super.initialize();
    	pivot(_angle, _isRight);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	super.execute();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return super.isFinished();
    }

    // Called once after isFinished returns true
    protected void end() {
    	super.end();
     	if (Robot.imu != null) {
     		SmartDashboard.putNumber(   "IMU_Yaw",              Robot.imu.getYaw());
     	}
   }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	super.interrupted();
    }
}
