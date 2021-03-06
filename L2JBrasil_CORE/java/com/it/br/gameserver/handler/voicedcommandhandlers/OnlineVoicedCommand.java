/* This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA
 * 02111-1307, USA.
 *
 * http://www.gnu.org/copyleft/gpl.html
 */
package com.it.br.gameserver.handler.voicedcommandhandlers;

import com.it.br.gameserver.handler.IVoicedCommandHandler;
import com.it.br.gameserver.model.L2World;
import com.it.br.gameserver.model.actor.instance.L2PcInstance;

public class OnlineVoicedCommand implements IVoicedCommandHandler
{
	private static final String[] VOICED_COMMANDS = {"online"};


	public boolean useVoicedCommand(String command, L2PcInstance activeChar, String target)
	{
		if (command.equalsIgnoreCase("online"))
		{
			activeChar.sendMessage("======<Players Online!>======");
			activeChar.sendMessage("There are " + L2World.getInstance().getAllPlayers().size() + " players online!.");
			activeChar.sendMessage("=======================");
			return true;
		}
		else
			return false;
	}

	public String[] getVoicedCommandList()
	{
		return VOICED_COMMANDS;
	}
}