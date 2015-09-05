/**
 * 
 */
/**
 * @author kdyzm
 *
 */
package com.kdyzm.action;

import com.opensymphony.xwork2.Action;

public class HelloWorldAction implements Action
{
	@Override
	public String execute() throws Exception {
		System.out.println("Hello,World!");
		return "success";
	}
	
}