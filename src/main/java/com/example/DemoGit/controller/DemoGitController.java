package com.example.DemoGit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoGitController {
@GetMapping("/hello")
public String meth()
{
	return "abcde";
}
}
