/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.imbibe.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.imbibe.fulfilmentprocess.constants.ImbibeFulfilmentProcessConstants;

public class ImbibeFulfilmentProcessManager extends GeneratedImbibeFulfilmentProcessManager
{
	public static final ImbibeFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ImbibeFulfilmentProcessManager) em.getExtension(ImbibeFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
