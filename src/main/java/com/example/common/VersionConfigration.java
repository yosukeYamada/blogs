package com.example.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "version")
@Data 
public class VersionConfigration {
	
	private Integer DEFAULT;

}
