package org.usfirst.frc.team4669.robot.commands;

import org.usfirst.frc.team4669.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Shift extends CommandGroup {
    
    public  Shift(double dist) {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	if (dist > 0){
    		double angle =Math.acos( (DriveTrain.WHEELBASE - dist) / 2 / DriveTrain.WHEELBASE) / Math.PI * 180;
    		addSequential(new Pivot(angle, true));
        	addSequential(new Turn(-2*angle));
    		addSequential(new Pivot(angle, false));
    	} else {
    		double angle =Math.acos( (DriveTrain.WHEELBASE + dist) / 2 / DriveTrain.WHEELBASE) / Math.PI * 180;
    		addSequential(new Pivot(-angle, false));
        	addSequential(new Turn(2*angle));
    		addSequential(new Pivot(-angle, true));
    	}
     }
}
