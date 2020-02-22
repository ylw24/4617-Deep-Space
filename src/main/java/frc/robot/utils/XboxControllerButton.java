/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.utils;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.OI;

/**
 * Add your docs here.
 */
public class XboxControllerButton extends JoystickButton
{
	// For creating buttons and connecting them to the XboxController
	// old way of doing it
	public XboxControllerButton( XboxController controller, XboxButton buttonNumber )
	{
		super( controller, buttonNumber.getValue() );
	}

}
