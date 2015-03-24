package org.usfirst.frc.team4669.robot;

import org.usfirst.frc.team4669.robot.commands.DriveCheck;
import org.usfirst.frc.team4669.robot.commands.FaceTote;
import org.usfirst.frc.team4669.robot.commands.InchLeft;
import org.usfirst.frc.team4669.robot.commands.InchRight;
import org.usfirst.frc.team4669.robot.commands.LeftCam;
import org.usfirst.frc.team4669.robot.commands.Lift;
import org.usfirst.frc.team4669.robot.commands.Lift1;
import org.usfirst.frc.team4669.robot.commands.LiftCheck;
import org.usfirst.frc.team4669.robot.commands.LiftCheck1;
import org.usfirst.frc.team4669.robot.commands.LowerTote;
import org.usfirst.frc.team4669.robot.commands.LowerTote1;
import org.usfirst.frc.team4669.robot.commands.Measure;
import org.usfirst.frc.team4669.robot.commands.PickUpRecycleBin;
import org.usfirst.frc.team4669.robot.commands.PickUpTote;
import org.usfirst.frc.team4669.robot.commands.PickUpTote1;
import org.usfirst.frc.team4669.robot.commands.SetYaw;
import org.usfirst.frc.team4669.robot.commands.Shift;
import org.usfirst.frc.team4669.robot.commands.Turn;
import org.usfirst.frc.team4669.robot.commands.TurnCheck;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick stick = new Joystick(0);
	public static JoystickButton s1 = new JoystickButton(stick, 1);
	public static JoystickButton s2 = new JoystickButton(stick, 2);
	public static JoystickButton s3 = new JoystickButton(stick, 3);
	public static JoystickButton s4 = new JoystickButton(stick, 4);
	public static JoystickButton s5 = new JoystickButton(stick, 5);
	public static JoystickButton s6 = new JoystickButton(stick, 6);
	public static JoystickButton s7 = new JoystickButton(stick, 7);
	public static JoystickButton s8 = new JoystickButton(stick, 8);
	public static JoystickButton s9 = new JoystickButton(stick, 9);
	public static JoystickButton s10 = new JoystickButton(stick, 10);
	public static JoystickButton s11 = new JoystickButton(stick, 11);
	
	public static Joystick stickB = new Joystick(1);
	public static JoystickButton sB1 = new JoystickButton(stickB, 1);
	public static JoystickButton sB2 = new JoystickButton(stickB, 2);
	public static JoystickButton sB3 = new JoystickButton(stickB, 3);
	public static JoystickButton sB4 = new JoystickButton(stickB, 4);
	public static JoystickButton sB5 = new JoystickButton(stickB, 5);
	public static JoystickButton sB6 = new JoystickButton(stickB, 6);
	public static JoystickButton sB7 = new JoystickButton(stickB, 7);
	public static JoystickButton sB8 = new JoystickButton(stickB, 8);
	public static JoystickButton sB9 = new JoystickButton(stickB, 9);
	public static JoystickButton sB10 = new JoystickButton(stickB, 10);
	public static JoystickButton sB11 = new JoystickButton(stickB, 11);
	
//	protected  Command cTrig = new Trigger();
//	protected Command cTL45= new Turn(-45);
//	protected Command cTR45= new Turn(45);
//	protected Command cTL90= new Turn(-90);
//	protected Command cTR90= new Turn(90);
	protected Command turn = new TurnCheck(); 
	protected Command forward = new DriveCheck();
	protected Command zero = new SetYaw();
	protected Command lift = new LiftCheck(); 
	protected Command lift1 = new LiftCheck1();
	
	protected Command inchLeft = new Shift(-1);
	protected Command inchRight = new Shift(1);
	protected Command turnL5 = new Turn(-5);
	protected Command turnR5 = new Turn(5);
	protected Command turnL10 = new Turn(-10);
	protected Command turnR10 = new Turn(10);
	
	protected Command faceTote = new FaceTote(); 
	
	protected Command measure = new Measure();
	protected Command leftCam = new LeftCam();
	protected Command up14 = new Lift(12);
	protected Command up1 = new Lift(6);
	protected Command upH = new Lift(3);
	protected Command upQ = new Lift(1);
	protected Command down14 = new Lift(-12);
	protected Command down1 = new Lift(-6);
	protected Command downH = new Lift(-3);
	protected Command downQ = new Lift(-1);
	protected Command up14B = new Lift1(12);
	protected Command up1B = new Lift1(6);
	protected Command upHB = new Lift1(3);
	protected Command upQB = new Lift1(1);
	protected Command down14B = new Lift1(-12);
	protected Command down1B = new Lift1(-6);
	protected Command downHB = new Lift1(-3);
	protected Command downQB = new Lift1(-1);

	public OI() {
		SmartDashboard.putData(leftCam);
		SmartDashboard.putData("Move", forward);
		SmartDashboard.putData("Lift", lift);
		SmartDashboard.putData("Lift1", lift1);
		SmartDashboard.putData("Turn", turn);
		SmartDashboard.putData("ZeroYaw", zero);
		SmartDashboard.putData("Measure", measure);
//		s1.whenReleased(cTrig);
		s2.whenReleased(down14);
		s3.whenReleased(up14);
		
		//shift
//		s4.whenReleased(inchLeft);
//		s5.whenReleased(inchRight);
		s6.whenReleased(upQ);
		s7.whenReleased(downQ);
		s8.whenReleased(upH);
		s9.whenReleased(downH);
		s10.whenReleased(down1);
		s11.whenReleased(up1);
		
//		sB1.whenReleased(faceTote);
		sB2.whenReleased(down14B);
		sB3.whenReleased(up14B);
//		sB4.whenReleased(inchLeft);
//		sB5.whenReleased(inchRight);
		sB6.whenReleased(upQB);
		sB7.whenReleased(downQB);
		sB8.whenReleased(upHB);
		sB9.whenReleased(downHB);
		sB10.whenReleased(down1B);
		sB11.whenReleased(up1B);
		
		
	}
	
	public Joystick getLeftJoystick() {
		return stick;
	}
	
	public Joystick getRightJoystick() {
		return stickB;
	}

}

