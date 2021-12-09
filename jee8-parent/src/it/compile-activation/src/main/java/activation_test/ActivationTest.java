/*
 * Copyright 2021 Kerbaya Software
 * 
 * This file is part of jee8-parent. 
 * 
 * jee8-parent is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * jee8-parent is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with jee8-parent.  If not, see <http://www.gnu.org/licenses/>.
 */
package activation_test;

import javax.activation.MimeType;
import javax.activation.MimeTypeParseException;

public class ActivationTest
{
	public static final MimeType MT;
	
	static
	{
		try
		{
			MT = new MimeType("text/plain");
		}
		catch (MimeTypeParseException e)
		{
			throw new IllegalStateException(e);
		}
	}
}
