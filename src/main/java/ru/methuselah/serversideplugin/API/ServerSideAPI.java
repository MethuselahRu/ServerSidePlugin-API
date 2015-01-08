package ru.methuselah.serversideplugin.API;
import java.util.UUID;

public abstract class ServerSideAPI
{
	private static ServerSideAPI instance;
	protected ServerSideAPI()
	{
		instance = ServerSideAPI.this;
	}
	public final static ServerSideAPI getManager()
	{
		return instance;
	}
	public abstract PlayerInformation getPlayerInfo(UUID uuid);
}
