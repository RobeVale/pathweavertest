/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2020 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import frc.robot.Constants.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.*;

public class RobotContainer {
  private final DriveSubsystem m_robotDrive = new DriveSubsystem();

  static Joystick controller = new Joystick(DriveConstants.kControllerPort);


  public RobotContainer() {
    configureButtonBindings();

  }

  private void configureButtonBindings() {
    //match joystick button to methods
    JoystickButton a = new JoystickButton(controller, JoystickConstants.kA);
    a.whenHeld(new RunCommand(() -> m_robotDrive.setSpeed(0.5)));
    a.whenReleased(new RunCommand(() -> m_robotDrive.setSpeed(0)));
  }
}