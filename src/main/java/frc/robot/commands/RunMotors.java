// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.subsystems.leftMotor;
import frc.robot.subsystems.rightMotor;

public class RunMotors extends Command {

  private leftMotor s_leftMotor;
  private rightMotor s_rightMotor;

  /** Creates a new RunMotors. */
  public RunMotors(leftMotor s_leftMotor, rightMotor s_rightMotor) {
    this.s_rightMotor = s_rightMotor;
    this.s_leftMotor = s_leftMotor;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    s_leftMotor.set(Constants.MotorConstants.motorSpeed);
    s_rightMotor.set(Constants.MotorConstants.motorSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    s_leftMotor.set(0);
    s_rightMotor.set(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
