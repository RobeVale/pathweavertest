/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {

  private CANSparkMax topMotor = new CANSparkMax(3, MotorType.kBrushless);
  private CANSparkMax bottomMotor = new CANSparkMax(4, MotorType.kBrushless);

  @Override
  public void periodic() {
    System.out.println("Top Motor: " + topMotor.getEncoder().getVelocity());
    System.out.println("Bottom Motor: " + bottomMotor.getEncoder().getVelocity());
  }

  public void setSpeed(double speed) {
    topMotor.set(speed);
    bottomMotor.set(speed);
  }
}

