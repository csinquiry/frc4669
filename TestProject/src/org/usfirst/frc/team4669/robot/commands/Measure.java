package org.usfirst.frc.team4669.robot.commands;

import org.usfirst.frc.team4669.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Measure extends Command {
	
    public Measure() {
    	requires(Robot.sensors);
    }
    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.sensors.startMeasure();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return !Robot.sensors.isMeasuring();
    }

    // Called once after isFinished returns true
    protected void end() {
    	int[] d = Robot.sensors.getDistance();
    	SmartDashboard.putNumber("RightDist", d[0]);
    	SmartDashboard.putNumber("LeftDist", d[1]);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
