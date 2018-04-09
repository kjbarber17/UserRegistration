package edu.dmacc.spring.userregistration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String name;
		private String lastname;
		private String password;
		private String detail;
		private String birthMonth;
		private Gender gender;
		private String country;
		private boolean nonSmoking;
			
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getDetail() {
			return detail;
		}
		public void setDetail(String detail) {
			this.detail = detail;
		}
		public String getBirthMonth() {
			return birthMonth;
		}
		public void setBirthMonth(String birthMonth) {
			this.birthMonth = birthMonth;
		}
		public Gender getGender() {
			return gender;
		}
		public void setGender(Gender gender) {
			this.gender = gender;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public boolean isNonSmoking() {
			return nonSmoking;
		}
		public void setNonSmoking(boolean nonSmoking) {
			this.nonSmoking = nonSmoking;
		}


}
