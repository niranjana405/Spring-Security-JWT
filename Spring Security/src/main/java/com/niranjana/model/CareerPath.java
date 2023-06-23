/*
 * package com.niranjana.model;
 * 
 * import java.io.Serializable;
 * 
 * import jakarta.persistence.Entity; import jakarta.persistence.GeneratedValue;
 * import jakarta.persistence.GenerationType; import jakarta.persistence.Id;
 * import jakarta.persistence.ManyToOne;
 * 
 * 
 * 
 * @Entity public class CareerPath implements Serializable{ private static final
 * long serialVersionUID = 1L;
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long careerId;
 * private String careerName; private String description; private String
 * motivation; private String reqSkills; private String userInterest;
 * 
 * @ManyToOne(optional = false) private Users user; public Users getUsers() {
 * return user; } public void setUsers(Users users) { this.user = users; }
 * //private List<JobProspect> diffJobs; public Long getCareerId() { return
 * careerId; } public void setCareerId(Long careerId) { this.careerId =
 * careerId; } public String getCareerName() { return careerName; } public void
 * setCareerName(String careerName) { this.careerName = careerName; } public
 * String getDescription() { return description; } public void
 * setDescription(String description) { this.description = description; } public
 * String getMotivation() { return motivation; } public void
 * setMotivation(String motivation) { this.motivation = motivation; } public
 * String getReqSkills() { return reqSkills; } public void setReqSkills(String
 * reqSkills) { this.reqSkills = reqSkills; } public String getUserInterest() {
 * return userInterest; } public void setUserInterest(String userInterest) {
 * this.userInterest = userInterest; } public static long getSerialversionuid()
 * { return serialVersionUID; }
 * 
 * @Override public String toString() { return "CareerPath [careerId=" +
 * careerId + ", careerName=" + careerName + ", description=" + description +
 * ", motivation=" + motivation + ", reqSkills=" + reqSkills + ", userInterest="
 * + userInterest + "]"; } public CareerPath(Long careerId, String careerName,
 * String description, String motivation, String reqSkills, String userInterest)
 * { super(); this.careerId = careerId; this.careerName = careerName;
 * this.description = description; this.motivation = motivation; this.reqSkills
 * = reqSkills; this.userInterest = userInterest; }
 * 
 * public CareerPath() {
 * 
 * } }
 */