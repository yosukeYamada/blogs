package com.example.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "status")
@Data 
public class StatusConfigration {
	
	private Integer HOLD;
	private Integer AVAILABLE;
	private Integer BAN;
	private Integer DELETED;
	
	
	
}
