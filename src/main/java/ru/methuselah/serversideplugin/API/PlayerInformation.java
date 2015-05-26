package ru.methuselah.serversideplugin.API;

import java.util.UUID;
import ru.methuselah.authlib.UserProvider;
import ru.methuselah.authlib.UserRole;

public interface PlayerInformation
{
	/**
	 * Возвращает UUID игрока, для которого возвращена информация
	 * @return
	 */
	public UUID getUUID();

	/**
	 * Текущая роль пользователя. Существует несколько ролей.
	 * @return Возвращает текущую роль
	 */
	public UserRole getUserRole();

	/**
	 * Провайдер аутентификации пользователя. Существует несколько рзличных провайдеров аутентификации.
	 * @return Возвращает текущего провайдера аутентификации.
	 */
	public UserProvider getUserProvider();

	/**
	 * 
	 * @return
	 */
	public boolean isUsingCustomLauncher();

	/**
	 *
	 * @return
	 */
	public UUID[] getBoundUUIDs();
}
