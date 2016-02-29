package org.cutre.soft.epi.command;

/**
 * Class that represents a Command of type BUTTON or RELEASE.
 *
 * Copyright (C) 2015  Pau G.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @author Stanley F.
 *
 */
public class CommandCommand implements CommandMessage {

    private static final String CMD_PREFIX = "cmd";

    public enum CommandType {
        begin,
        end,
        once
    }

    private CommandType type;
    private String commandName;

    public CommandCommand(CommandType type, String name) {
        this.type = type;
        this.commandName = name;
    }

    @Override
    public String getCommand() {
        StringBuilder sb = new StringBuilder();

        sb.append(CMD_PREFIX);
        sb.append(" ");
        sb.append(type.name());
        sb.append(" ");
        sb.append(commandName);

        return sb.toString();
    }
}
