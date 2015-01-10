package ru.methuselah.serversideplugin.API;
import java.util.UUID;
import ru.methuselah.authlib.UserProvider;
import ru.methuselah.authlib.UserRole;

public class PlayerInformation
{
	UUID         uuid;
	UserRole     role;
	UserProvider provider;
	boolean      launcher;
	public UUID getUUID()
	{
		return uuid;
	}
	public UserRole getUserRole()
	{
		return role;
	}
	public UserProvider getUserProvider()
	{
		return provider;
	}
	public boolean isUsingCustomLauncher()
	{
		return launcher;
	}
	public UUID[] getBoundUUIDs()
	{
		return new UUID[] { uuid };
	}
}
