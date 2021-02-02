package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class Drivetrain {

    private TalonFX fleft;
    private TalonFX bleft;
    private TalonFX fright;
    private TalonFX bright;
    private double speedLeft;
    private double speedRight;

    Drivetrain(TalonFX left0, TalonFX right0, TalonFX left1, TalonFX right1){
        fleft=left0;
        bleft=left1;
        fright=right0;
        bright=right1;
        speedLeft=0;
        speedRight=0;
    }
    
    public void setSpeeds(double leftSpeed, double rightSpeed){
        speedLeft=leftSpeed;
        speedRight=rightSpeed;
    }

    public double getLeftSpeed(){
        return speedLeft;
    }

    public double getRightSpeed(){
        return speedRight;
    }

    public void setSpeedsJoystick(double x, double y, double twist){
        double speedL;
        double speedR;
        if(x>0){speedL=(y+x+twist);}
        else{speedL=(y+twist);}
        if(x<0){speedR=(y+x+twist);}
        else{speedR=(y+twist);}
        //Normalization
        double maxSpeed=Math.max(Math.abs(speedL),Math.abs(speedR));
        if (maxSpeed>1){
            speedL/=maxSpeed;
            speedR/=maxSpeed;
        }
        setSpeeds(speedL,speedR);
    }

    public void execute(){
        fleft.set(ControlMode.PercentOutput,speedLeft);
        bleft.set(ControlMode.PercentOutput,speedLeft);
        fright.set(ControlMode.PercentOutput,speedRight);
        bright.set(ControlMode.PercentOutput,speedRight);
    }
}
