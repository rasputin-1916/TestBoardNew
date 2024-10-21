// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.leftMotor;

public class DriveLeftMotor extends Command {

  private leftMotor s_leftMotor;
  private DoubleSupplier s_speed;

  /** Creates a new DriveLeftMotor. */
  public DriveLeftMotor(leftMotor s_leftMotor, DoubleSupplier s_speed) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.s_leftMotor = s_leftMotor;
    this.s_speed = s_speed;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    s_leftMotor.set(s_speed.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    s_leftMotor.set(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
