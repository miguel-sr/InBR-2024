// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class DriveSubsystem extends SubsystemBase {

  private final WPI_VictorSPX leftFrontMotor = new WPI_VictorSPX(DriveConstants.kLeftFrontMotorPort);

  private final  WPI_VictorSPX leftRearMotor = new WPI_VictorSPX(DriveConstants.kLeftRearMotorPort);

  private final WPI_VictorSPX rightFrontMotor = new WPI_VictorSPX(DriveConstants.kRightFrontMotorPort);

  private final WPI_VictorSPX RightRearMotor = new WPI_VictorSPX(DriveConstants.kLeftRearMotorPort);

  
  /** Creates a new DriveSubsystem. */
  public DriveSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
