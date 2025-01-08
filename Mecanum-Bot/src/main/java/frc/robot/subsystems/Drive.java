package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.DriveConstants.*;
public class Drive extends SubsystemBase {
    private final SparkMax frontLeft, frontRight, backLeft, backRight;

    public Drive() {
        this.frontLeft = new SparkMax(FRONT_LEFT_MOTOR_ID, MotorType.kBrushless);
        this.frontRight = new SparkMax(FRONT_RIGHT_MOTOR_ID, MotorType.kBrushless);
        this.backLeft = new SparkMax(BACK_LEFT_MOTOR_ID, MotorType.kBrushless);
        this.backRight = new SparkMax(BACK_RIGHT_MOTOR_ID, MotorType.kBrushless);

        this.frontLeft.setInverted(FRONT_LEFT_MOTOR_INVERTED);
        this.frontRight.setInverted(FRONT_RIGHT_MOTOR_INVERTED);
        this.backLeft.setInverted(BACK_LEFT_MOTOR_INVERTED);
        this.backRight.setInverted(BACK_RIGHT_MOTOR_INVERTED);
    }


    @Override
    public void periodic() {

    }
}
