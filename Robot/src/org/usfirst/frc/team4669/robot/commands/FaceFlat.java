package org.usfirst.frc.team4669.robot.commands;

import org.usfirst.frc.team4669.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class FaceFlat extends Command {

    public FaceFlat() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.sensors.getUSensor1() > Robot.sensors.getUSensor2()) {
    		Robot.drive.joystickDrive(-0.2, 0);
    	}
    	if (Robot.sensors.getUSensor1() < Robot.sensors.getUSensor2()) {
    		Robot.drive.joystickDrive(0, -0.2);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (Math.abs(Robot.sensors.getUSensor1() - Robot.sensors.getUSensor2()) < 0.1);
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drive.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
