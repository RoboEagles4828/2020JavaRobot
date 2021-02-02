package frc.robot;

public class config {
    public static class Robot{
        public static final double JOYSTICK_X_MAP_A = 0.75;
        public static final double JOYSTICK_Y_MAP_A = 0.75;
        public static final double JOYSTICK_TWIST_MAP_A = 0.5;
        public static final double JOYSTICK_DEADZONE = 0.05;
        public static final double JOYSTICK_AVERAGE_PERIOD = 0;
        public static final double CAMERA_YAW_POS_0 = 0.19;
        public static final double CMAERA_YAW_POS_1 = 0.90;

        public static class Drivetrain{
            public static final double DRIVE_SPEED = 0.4;
            public static final double DRIVE_SLOW_SPEED=0.1;
            public static final double DRIVE_TURN_SPEED = 0.3;
            public static final double VISION_RATIO = 0.5;
        }

        public static class Shooter{
            public static final double INTAKE_SPEED = 0.5;
            public static final double OUTTAKE_SPEED = 0.5;
            public static final double INTAKE_CONTROL_SPEED = 0.6;
            public static final double CONVEYOR_SPEED = 0.5;
            public static final double SHOOTER_SPEED_0 = 0.77;
            public static final double SHOOTER_SPEED_1 = 0.95;
        }

        public static class Climber{
            public static final double CLIMBER_LEFT_UP_SPEED = 0.60;
            public static final double CLIMBER_RIGHT_UP_SPEED = 0.45;
            public static final double WINCH_LEFT_FRONT_UP_SPEED = 1.0;
            public static final double WINCH_LEFT_BACK_UP_SPEED = 1.0;
            public static final double WINCH_RIGHT_FRONT_UP_SPEED = 1.0;
            public static final double WINCH_RIGHT_BACK_UP_SPEED = 1.0;
            public static final double CLIMBER_LEFT_DOWN_SPEED = 0.60;
            public static final double CLIMBER_RIGHT_DOWN_SPEED = 0.60;
            public static final double WINCH_LEFT_FRONT_DOWN_SPEED = 1.0;
            public static final double WINCH_RIGHT_FRONT_DOWN_SPEED = 1.0;
            public static final double WINCH_LEFT_BACK_DOWN_SPEED = 1.0;
            public static final double WINCH_RIGHT_BACK_DOWN_SPEED = 1.0;
        }
    }

    public static class Autonomous{
        public static final double POS_1_FORWARD = 43.3;
        public static final double POS_1_TO_TRENCH = 66.9;
        public static final double POS_1_TRENCH = 156.3;
        public static final double POS_2_TRENCH_TURN = 17.9;
        public static final double POS_2_TURN = 29.1;
        public static final double POS_2_TO_TRENCH = 86.6;
        public static final double POS_2_TRENCH = 108;
        public static final double POS_3_SHOOT = 134.9;
        public static final double POS_3_TURN = 60.9;
        public static final double POS_3_TRENCH = 130.4;
        public static final double DRIVE_DISTANCE = 50.0;
        public static final double DS_8_TO_MID = 60.0;
        public static final double DS_8_TURN = 22.5;
        public static final double DS_8_FORWARD_MID = 86.3;
        public static final double DS_8_BACK_MID = 68.3;
        public static final double DS_SHOOt = 178.0;
    }

    public static class Drivetrain{
        public static final double ENCODER_RATIO = 1/1460;
    }

    public static class Shooter{
        public static final double CONVEYOR_INTAKE_SPEED = 0.85;
        public static final double CONVEYOR_SHOOT_SPEED = 0.85;
    }

    public static class Ports{
        public static final int CAMERA_SERVO_YAW = 1;

        public static class Drivetrain{
            public static final int LEFT_0 = 1;
            public static final int LEFT_1 = 2;
            public static final int RIGHT_0 = 3;
            public static final int RIGHT_1 = 4;
        }

        public static class Shooter{
            public static final int INTAKE = 5;
            public static final int CONVEYOR = 7;
            public static final int CONVEYOR_PROX_FRONT = 8;
            public static final int CONVEYOR_PROX_BACK = 9;
            public static final int SHOOTER_LEFT = 11;
            public static final int SHOOTER_RIGHT = 12;
            public static final int SHOOTER_PISTON_0 = 5;
            public static final int SHOOTER_PISTON_1 = 7;
        }

        public static class Climber{
            public static final int CLIMBER_LEFT = 16;
            public static final int CLIMBER_RIGHT = 13;
            public static final int WINCH_LEFT_FRONT = 18;
            public static final int WINCH_LEFT_BACK = 17;
            public static final int WINCH_RIGHT_FRONT =14;
            public static final int WINCH_RIGHT_BACK = 15;
        }
    }
    public static class Buttons{
        public static class Joystick0{
            public static final int CAMERA = 11;

            public static class Drivetrain{
                public static final int VISION = 1;
            }

            public static class Shooter{
                public static final int CONVEYOR = 7;
            }
        }

        public static class Joystick1{
            public static class Climber{
                public static final int WINCH_LEFT_FRONT = 9;
                public static final int WINCH_LEFT_BACK = 11;
                public static final int WINCH_RIGHT_FRONT = 10;
                public static final int WINCH_RIGHT_BACK = 12;
                public static final int LEFT_UP = 5;
                public static final int LEFT_DOWN = 3;
                public static final int RIGHT_UP = 6;
                public static final int RIGHT_DOWN = 4;
            }

            public static class Shooter{
                public static final int INTAKE = 1;
                public static final int OUTTAKE = 2;
                public static final int SHOOT_0 = 7;
                public static final int SHOOT_1 = 8;
            }
        }
    }
}
