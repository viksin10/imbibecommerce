/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.imbibe.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.imbibe.core.constants.ImbibeCoreConstants;
import com.imbibe.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class ImbibeCoreManager extends GeneratedImbibeCoreManager
{
	public static final ImbibeCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ImbibeCoreManager) em.getExtension(ImbibeCoreConstants.EXTENSIONNAME);
	}
}
