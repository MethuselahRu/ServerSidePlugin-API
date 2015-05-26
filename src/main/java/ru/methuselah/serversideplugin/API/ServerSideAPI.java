package ru.methuselah.serversideplugin.API;

import java.util.UUID;
import ru.methuselah.authlib.exceptions.ResponseException;

public abstract class ServerSideAPI
{
	private static ServerSideAPI instance;
	protected ServerSideAPI()
	{
		instance = ServerSideAPI.this;
	}

	/**
	 * Позволяет получить объект, реализующий все доступные методы API
	 * @return
	 */
	public final static ServerSideAPI getManager()
	{
		return instance;
	}

	/**
	 * Получение базовой информации об игроке
	 * @param uuid уникальный идентификатор игрока
	 * @return Объект, содержащий методы получения информации об игроке
	 * @throws ru.methuselah.authlib.exceptions.ResponseException при возникновении сетевых и иных проблем
	 */
	public abstract PlayerInformation getPlayerInfo(UUID uuid) throws ResponseException;
}
