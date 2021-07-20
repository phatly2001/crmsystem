package sopvn.crmsystem.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "campaign")
@EntityListeners(AuditingEntityListener.class)
public class campaign {
	private int campaign_id;
	private String campaignName;
	private String campaignObject;
	private String campaignDetail;
	private Date campaignStart;
	private Date campaignEnd;
	private int opportunityId;
	private boolean campaignStatus;
	
	private List<campaignmember> campaignmember;
	private opportunity opportunity;
	
	//join opportunity
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "opportunity_id", referencedColumnName = "opportunity_id", insertable = false, updatable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	public opportunity getOpportunity() {
		return opportunity;
	}

	public void setOpportunity(opportunity opportunity) {
		this.opportunity = opportunity;
	}
	
	//join campaign
	@OneToMany(mappedBy="campaign")
	public List<campaignmember> getCampaignmember() {
		return campaignmember;
	}

	public void setCampaignmember(List<campaignmember> campaignmember) {
		this.campaignmember = campaignmember;
	}

	@Column(name = "campaign_status", nullable = true)
	public boolean getCampaignStatus() {
		return campaignStatus;
	}

	public void setCampaignStatus(boolean campaignStatus) {
		this.campaignStatus = campaignStatus;
	}


	@Column(name = "opportunity_id", nullable = true)
	public int getOpportunityId() {
		return opportunityId;
	}

	public void setOpportunityId(int opportunityId) {
		this.opportunityId = opportunityId;
	}


	@Column(name = "campaign_end", nullable = true)
	public Date getCampaignEnd() {
		return campaignEnd;
	}

	public void setCampaignEnd(Date campaignEnd) {
		this.campaignEnd = campaignEnd;
	}


	@Column(name = "campaign_start", nullable = true)
	public Date getCampaignStart() {
		return campaignStart;
	}

	public void setCampaignStart(Date campaignStart) {
		this.campaignStart = campaignStart;
	}


	@Column(name = "campaign_detail", nullable = true)
	public String getCampaignDetail() {
		return campaignDetail;
	}

	public void setCampaignDetail(String campaignDetail) {
		this.campaignDetail = campaignDetail;
	}


	@Column(name = "campaign_object", nullable = true)
	public String getCampaignObject() {
		return campaignObject;
	}

	public void setCampaignObject(String campaignObject) {
		this.campaignObject = campaignObject;
	}


	@Column(name = "campaign_name", nullable = true)
	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getCampaign_id() {
		return campaign_id;
	}

	public void setCampaign_id(int id) {
		this.campaign_id = id;
	}

}

