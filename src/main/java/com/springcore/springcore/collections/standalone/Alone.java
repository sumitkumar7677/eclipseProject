package com.springcore.springcore.collections.standalone;

import java.util.List;
import java.util.Map;

public class Alone {
		
		@Override
	public String toString() {
		return "Alone [name=" + name + ", section=" + section + ", courseFeeMap=" + courseFeeMap + "]";
	}
		public Alone(List<String> name, List<String> section) {
			super();
			this.name = name;
			this.section = section;
		}
		public Alone() {
			super();
			// TODO Auto-generated constructor stub
		}
		private List<String> name;
		public List<String> getName() {
			return name;
		}
		public void setName(List<String> name) {
			this.name = name;
		}
		public List<String> getSection() {
			return section;
		}
		public void setSection(List<String> section) {
			this.section = section;
		}
		private List<String> section;
		private Map<String,Integer> courseFeeMap;
		public Alone(Map<String, Integer> courseFeeMap) {
			super();
			this.courseFeeMap = courseFeeMap;
		}
		public Map<String, Integer> getCourseFeeMap() {
			return courseFeeMap;
		}
		public void setCourseFeeMap(Map<String, Integer> courseFeeMap) {
			this.courseFeeMap = courseFeeMap;
		}
	
	}
