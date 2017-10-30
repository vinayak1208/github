package com.cg.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name = "complaint")
@NamedQueries(
			@NamedQuery(name="CheckStatus",query="select cust from Customer cust"))

public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE2")
	@SequenceGenerator(name="SEQUENCE2", sequenceName="complaintid", allocationSize=10)
	private int complaintid;
	@NotNull
	@Column(name = "accountid")
	@Pattern(regexp="[0-9]{10}",message="Account id should be 10 Digit")
	private int accountId;
	@NotEmpty(message="Should not be empty")
	@Column(name = "branchcode")
	private String branchCode;
	
	@NotEmpty(message="Should not be empty")
	@Column(name = "emailid")
	private String emailId;
	@NotEmpty(message="Should not be empty")
	@Column(name = "category")
	private String complainCategory;
	@NotEmpty(message="Should not be empty")
	@Column(name = "description")
	private String description;
	
	private String priority;
	private String status;
	
	
	
	
	
	@Override
	public String toString() {
		return "Customer [complaintid=" + complaintid + ", accountId="
				+ accountId + ", branchCode=" + branchCode + ", emailId="
				+ emailId + ", complainCategory=" + complainCategory
				+ ", description=" + description + ", priority=" + priority
				+ ", status=" + status + "]";
	}
	public int getComplaintid() {
		return complaintid;
	}
	public void setComplaintid(int complaintid) {
		this.complaintid = complaintid;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getComplainCategory() {
		return complainCategory;
	}
	public void setComplainCategory(String complainCategory) {
		this.complainCategory = complainCategory;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
