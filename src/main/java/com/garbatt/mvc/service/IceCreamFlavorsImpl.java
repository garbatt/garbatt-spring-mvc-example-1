package com.garbatt.mvc.service;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "IceCreamFlavors")
public class IceCreamFlavorsImpl implements IceCreamFlavors {
	private ArrayList<String> flavors = null;

	
	public IceCreamFlavorsImpl() {
		super();
		this.flavors = new ArrayList<String>();
		this.flavors.add("Vanilla");
		this.flavors.add("Chocolate");
		this.flavors.add("Coconut");
	}

	/* (non-Javadoc)
	 * @see com.garbatt.mvc.service.IceCreamFlavors#getFlavors()
	 */
	@Override
	public ArrayList<String> getFlavors() {
		return flavors;
	}

	/* (non-Javadoc)
	 * @see com.garbatt.mvc.service.IceCreamFlavors#setFlavors(java.util.ArrayList)
	 */
	@Override
	public void setFlavors(ArrayList<String> flavors) {
		this.flavors = flavors;
	}	
}
