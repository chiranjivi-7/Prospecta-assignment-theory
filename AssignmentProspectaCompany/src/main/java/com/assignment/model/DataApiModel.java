package com.assignment.model;

import java.util.List;
import java.util.Map.Entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class DataApiModel {
	
	private int count;
	private List<Entry> entries;

}
