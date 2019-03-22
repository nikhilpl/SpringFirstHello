/**
 * 
 */
package org.nik.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nikhil P L
 *
 */
@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String redirect() {
		return "viewpage";
	}
}
