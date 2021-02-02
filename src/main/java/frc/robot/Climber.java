package frc.robot;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Climber {
    private TalonSRX climberLeft;
    private TalonSRX climberRight;
    private VictorSPX winchLeftFront;
    private VictorSPX winchRightFront;
    private VictorSPX winchLeftBack;
    private VictorSPX winchRightBack;
    private double leftCSpeed;
    private double rightCSpeed;
    private double leftWFSpeed;
    private double rightWFSpeed;
    private double leftWBSpeed;
    private double rightWBSpeed;

    Climber(TalonSRX leftClimber, TalonSRX rightClimber, VictorSPX leftFront, VictorSPX rightFront, VictorSPX leftBack, VictorSPX rightBack){
        climberLeft=leftClimber;
        climberRight=rightClimber;
        winchLeftFront=leftFront;
        winchRightFront=rightFront;
        winchLeftBack=leftBack;
        winchRightBack=rightBack;
        leftCSpeed=0;
        rightCSpeed=0;
        leftWFSpeed=0;
        rightWFSpeed=0;
        leftWBSpeed=0;
        rightWBSpeed=0;
    }

    public void setLeftCSpeed(double speed){
        leftCSpeed=speed;
    }
    
    public void setRighCSpeed(double speed){
        rightCSpeed=speed;
    }

    public void setLeftWFSpeed(double speed){
        leftWFSpeed=speed;
    }

    public void setRightWFSpeed(double speed){
        rightWFSpeed=speed;
    }
    
    public void setLeftWBSpeed(double speed){
        leftWBSpeed=speed;
    }

    public void setRightWBSpeed(double speed){
        rightWBSpeed=speed;
    }

    public void execute(){
        climberLeft.set(ControlMode.PercentOutput, leftCSpeed);
        climberRight.set(ControlMode.PercentOutput, rightCSpeed);
        winchLeftFront.set(ControlMode.PercentOutput, leftWFSpeed);
        winchRightFront.set(ControlMode.PercentOutput, rightWFSpeed);
        winchLeftBack.set(ControlMode.PercentOutput, leftWBSpeed);
        winchRightBack.set(ControlMode.PercentOutput, rightWBSpeed);
    }
}
