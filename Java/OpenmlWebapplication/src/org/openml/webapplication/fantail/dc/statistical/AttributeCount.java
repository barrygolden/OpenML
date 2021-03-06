/*
 *  Webapplication - Java library that runs on OpenML servers
 *  Copyright (C) 2014 
 *  @author Jan N. van Rijn (j.n.van.rijn@liacs.leidenuniv.nl)
 *  @author Quan Sun (quan.sun.nz@gmail.com)
 *  
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *  
 */
package org.openml.webapplication.fantail.dc.statistical;

import java.util.HashMap;
import java.util.Map;

import org.openml.webapplication.fantail.dc.Characterizer;

import weka.core.Instances;

public class AttributeCount extends Characterizer {

	protected final String[] ids = new String[] { "NumAttributes",
			"Dimensionality" };

	@Override
	public String[] getIDs() {
		return ids;
	}

	@Override
	public Map<String, Double> characterize(Instances instances) {
		Map<String, Double> qualities = new HashMap<String, Double>();
		qualities.put(ids[0], instances.numAttributes() * 1.0);
		qualities.put(ids[1],
				1.0 * instances.numAttributes() / instances.numInstances());
		return qualities;

	}
}
