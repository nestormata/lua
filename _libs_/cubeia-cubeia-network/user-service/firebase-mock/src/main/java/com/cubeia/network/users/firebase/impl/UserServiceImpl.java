/**
 * Copyright (C) 2010 Cubeia Ltd <info@cubeia.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.cubeia.network.users.firebase.impl;

import com.cubeia.backoffice.users.api.dto.User;
import com.cubeia.firebase.api.server.SystemException;
import com.cubeia.firebase.api.service.Service;
import com.cubeia.firebase.api.service.ServiceContext;
import com.cubeia.network.users.firebase.api.UserServiceContract;

public class UserServiceImpl implements UserServiceContract, Service {

	@Override
	public User getUserById(int userId) {
		User u = new User();
		u.setUserId((long) userId);
		return u;
	}

	@Override
	public void invalidateUserSession(int userId) { }

	@Override
	public void init(ServiceContext con) throws SystemException { }

	@Override
	public void destroy() { }

	@Override
	public void start() { }

	@Override
	public void stop() { }

}
