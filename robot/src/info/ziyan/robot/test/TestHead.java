/*
 * File: TestHead.java is part of info.ziyan.robot.test.
 * Author: Ziyan Zhou <zhou@ziyan.info> http://ziyan.info
 *
 * This package is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This package is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * To obtain a copy of the GNU General Public License,
 * see <http://www.gnu.org/licenses/>.
 *
 */
package info.ziyan.robot.test;

import info.ziyan.robot.Head;

public class TestHead {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Head.init();
		System.out.println("Press ENTER to exit ...");
		System.in.read();
		Head.exit();
	}

}
