package sopvn.crmsystem.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "contract")
@EntityListeners(AuditingEntityListener.class)
public class contract {
	private int contract_id;
	private int accountId;
	private String contractName;
	private String contractDetail;
	private String contractStatus;
	private int userId;
	
	private account account;
	private user user;
	
	//join user
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	public user getUser() {
		return user;
	}

	public void setUser(user user) {
		this.user = user;
	}

	//join account
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "account_id", referencedColumnName = "account_id", insertable = false, updatable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	public account getAccount() {
		return account;
	}

	public void setAccount(account account) {
		this.account = account;
	}

	@Column(name = "user_id", nullable = true)
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}


	@Column(name = "contract_status", nullable = true)
	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}


	@Column(name = "contract_detail", nullable = true)
	public String getContractDetail() {
		return contractDetail;
	}

	public void setContractDetail(String contractDetail) {
		this.contractDetail = contractDetail;
	}


	@Column(name = "contract_name", nullable = true)
	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}


	@Column(name = "account_id", nullable = true)
	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getContract_id() {
		return contract_id;
	}

	public void setContract_id(int id) {
		this.contract_id = id;
	}

}

