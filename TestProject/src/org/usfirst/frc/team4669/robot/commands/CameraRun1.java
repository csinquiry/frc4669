package org.usfirst.frc.team4669.robot.commands;

import org.usfirst.frc.team4669.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CameraRun1 extends Command {

    public CameraRun1() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
  //  	requires(Robot.camera1);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
  //  	Robot.camera1.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
  //  	Robot.camera1.run();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
   // 	Robot.camera1.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
