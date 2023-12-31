package com.assignment.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Entry {

	@JsonProperty("API")
	@Id
	private String api;

	@JsonProperty("Description")
	private String description;

	@JsonProperty("Auth")
	private String auth;

	@JsonProperty("HTTPS")
	private boolean hTTPS;

	@JsonProperty("Cors")
	private String cors;

	@JsonProperty("Category")
	private String category;

}
