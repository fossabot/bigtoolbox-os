package io.github.incplusplus.bigtoolbox.os.opsys.mac;

import io.github.incplusplus.bigtoolbox.os.IncorrectOperatingSystemException;
import io.github.incplusplus.bigtoolbox.os.UnsupportedOSException;
import io.github.incplusplus.bigtoolbox.os.opsys.OperatingSystem;
import org.apache.commons.lang3.SystemUtils;

public abstract class Mac extends OperatingSystem
{
	public Mac()
	{
		if(! SystemUtils.IS_OS_MAC)
		{
			throw new IncorrectOperatingSystemException();
		}
	}
	public static Mac getInstance()
	{
		throw new UnsupportedOSException();
	}
}