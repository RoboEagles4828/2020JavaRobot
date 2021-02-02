package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;
import com.ctre.phoenix.motorcontrol.ControlMode;
public class Shooter {
    private TalonSRX intake;
    private VictorSPX conveyor;
    private DigitalInput conveyorProxFront;
    private DigitalInput conveyorProxBack;
    private TalonSRX shooterLeft;
    private TalonSRX shooterRight;
    private Solenoid shooterPiston0;
    private Solenoid shooterPiston1;
    private double intakeSpeed;
    private boolean conveyorStatus;
    private boolean CPFStatus;
    private boolean CPBStatus;
    private double shooterSpeed;
    private boolean shooterStatus;
    private Timer timer = new Timer();

    Shooter(TalonSRX intake, VictorSPX conveyor, DigitalInput conveyorProxFront,
     DigitalInput conveyorProxBack, TalonSRX shooterLeft, TalonSRX shooterRight,
     Solenoid shooterPiston0, Solenoid shooterPiston1){
        this.intake=intake;
        this.conveyor=conveyor;
        this.conveyorProxFront=conveyorProxFront;
        this.conveyorProxBack=conveyorProxBack;
        this.shooterLeft=shooterLeft;
        this.shooterRight=shooterRight;
        this.shooterPiston0=shooterPiston0;
        this.shooterPiston1=shooterPiston1;
        intakeSpeed=0;
        conveyorStatus=false;
        CPFStatus=false;
        CPBStatus=false;
        shooterSpeed=0;
        shooterStatus=false;
    }

    public void setIntakeSpeed(double speed){
        intakeSpeed=speed;
        if(speed!=0){setShooterStatus(true);}
    }

    public double getIntakeSpeed(){
        return intakeSpeed;
    }

    public void setConveyor(boolean status){
        conveyorStatus=status;
    }

    public boolean getCPFStatus(){
        return CPFStatus;
    }

    public boolean getCPBStatus(){
        return CPBStatus;
    }

    public void setShooterSpeed(double speed){
        shooterSpeed=speed;
    }

    public void setShooterStatus(boolean status){
        shooterStatus=status;
    }

    public boolean getShooterStatus(){
        return shooterStatus;
    }

    public void execute(){
        intake.set(ControlMode.PercentOutput, intakeSpeed);
        CPFStatus=conveyorProxFront.get();
        CPBStatus=conveyorProxBack.get();
        if(shooterSpeed!=0){
            if(timer.hasElapsed(1.0)){
                conveyor.set(ControlMode.PercentOutput, config.Shooter.CONVEYOR_SHOOT_SPEED);
            }
            timer.start();
        }else if((getCPFStatus()&&!getCPBStatus())||conveyorStatus){
            timer.stop();
            timer.reset();
            conveyor.set(ControlMode.PercentOutput, config.Shooter.CONVEYOR_INTAKE_SPEED);
        }else{
            timer.stop();
            timer.reset();
            conveyor.set(ControlMode.PercentOutput,0);
        }
        shooterLeft.set(ControlMode.PercentOutput,shooterSpeed);
        shooterRight.set(ControlMode.PercentOutput,shooterSpeed);
        shooterPiston0.set(shooterStatus);
        shooterPiston1.set(shooterStatus);
    }
}
