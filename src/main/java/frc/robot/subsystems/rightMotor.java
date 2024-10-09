// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDSubsystem;
import frc.robot.Constants;

public class rightMotor extends PIDSubsystem {
  
  private TalonFX motor;

  public rightMotor() {
    super(
        // The PIDController used by the subsystem
        new PIDController(0, 0, 0));
    
    motor = new TalonFX(Constants.MotorConstants.rightMotorID);
  }

  @Override
  public void useOutput(double output, double setpoint) {
    // Use the output here
  }

  @Override
  public double getMeasurement() {
    // Return the process variable measurement here
    return 0;
  }

  public void set(double speed) {
    motor.set(speed);
  }
}