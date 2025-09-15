package com.springcore.springcore.steriotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	    @Value("Sumit")
		private String studentName;
	    @Value("Bihar")
		private String city;
	    @Value("#{temp}")	
	    private List<String> District;
		public List<String> getDistrict() {
			return District;
		}
		public void setDistrict(List<String> district) {
			District = district;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		@Override
		public String toString() {
			return "Student [studentName=" + studentName + ", city=" + city + ", District=" + District + "]";
		}

}
