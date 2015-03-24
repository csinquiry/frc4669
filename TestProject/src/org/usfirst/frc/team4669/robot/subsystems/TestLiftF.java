package org.usfirst.frc.team4669.robot.subsystems;

import org.usfirst.frc.team4669.robot.data.TimePosF;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class TestLiftF extends TimePosF {
	public static double WHEEL_DIA = 1.75;
	public static double ENC_COUNT = 360;
	
	public TestLiftF() {
		super(2, false); // 4
	}

	public void execute() {
		long time = System.currentTimeMillis();
		super.execute(time);
		SmartDashboard.putNumber("liftFrontPos", drive.getPosition());
		SmartDashboard.putNumber("liftFrontThrot", drive.getOutputVoltage());
		SmartDashboard.putNumber("liftFrontErr", drive.getClosedLoopError());
	}
	
	public void moveOff(double inches) {
		double d = inches / WHEEL_DIA / Math.PI * 360*4;
		super.moveOff(d);
		SmartDashboard.putNumber("end", d);
	}
	
	protected void doPos(double p) {
		super.doPos(p);
		SmartDashboard.putNumber("liftSet", p);
	}
	
}

